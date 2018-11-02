package kr.or.ddit.hello;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.classic.Logger;
import kr.or.ddit.user.model.UserVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:kr/or/ddit/config/spring/servlet-context.xml"})
@WebAppConfiguration	//	spring ioc 컨테이너 구성을 web환경에 맞게 구성
public class HelloControllerTest {
	
	Logger logger = (Logger) LoggerFactory.getLogger(HelloControllerTest.class);
	
	@Autowired
	private WebApplicationContext ctx;	//	spring ioc 컨테이너
	
	private MockMvc mockMvc;			//	dispatcher servlet(front controller)
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void helloTest() throws Exception {
		/***Given***/
		

		/***When***/
		//dispatcher servlet으로 요청 전송
		MvcResult mvcResult = mockMvc.perform(get("/hello/hello.do")).andReturn();
		
		ModelAndView mav = mvcResult.getModelAndView();
		
		/***Then***/
		//viewName : hello
		assertEquals("hello", mav.getViewName());
	}

	
	@Test
	public void modelTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/hello/model")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		String viewName = mav.getViewName();
		
		//minions속성을 가져오기
		List<String> minions = (List<String>) mav.getModel().get("minions");
		//List<String> minions = (List<String>) mav.getModelMap().get("minions"); //둘 다 가능
		
		//Logger로 출력
		for(String minion : minions) {
			logger.debug("minions : {}", minions);
		}
		
		/***Then***/
		//1.view 이름
		assertEquals("hello", viewName);
		
		//2.minions 속성(model)
		assertEquals(3, minions.size());
	}

	
	@Test
	public void requestTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = (MvcResult) mockMvc.perform(get("/hello/request")
													.param("userId", "jerry")
													.param("pass", "jerry")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		
		//viewName
		String viewName = mav.getViewName();
		
		//userId, pass 속성
		String userId = (String) mav.getModel().get("userId");
		String pass = (String) mav.getModel().get("pass");
		
		/***Then***/
		assertEquals("jerry_attr", userId);
	}
	
	
	@Test
	public void voTest() throws Exception {
		/***Given***/
		MvcResult mvcResult =  mockMvc.perform(get("/hello/vo")
													.param("userId", "jerry")
													.param("pass", "jerry")).andReturn();
		
		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		
		UserVo userVo = (UserVo)mav.getModel().get("uservo");
		
		/***Then***/
		assertEquals("hello", mav.getViewName());
		assertEquals("jerry", userVo.getUserId());
	}
	
	
	@Test
	public void modelAndView() throws Exception {
		/***Given***/
		MvcResult mvcResult =  mockMvc.perform(get("/hello/modelAndView")
										.param("userId", "jerry")
										.param("pass", "jerry")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		String userId = (String) mav.getModel().get("userid");
		
		/***Then***/
		assertEquals("jerry_attr", userId);
	}
	
}

