package kr.or.ddit.user.web;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/config/spring/servlet-context.xml",
								  "classpath:kr/or/ddit/config/spring/root-context.xml"})
@WebAppConfiguration
public class UserControllerTest {

	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	
	/**
	* Method : loginViewTest
	* 작성자 : 김지태
	* 변경이력 :
	* Method 설명 : login view test
	 * @throws Exception 
	*/
	@Test
	public void loginViewTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(get("/user/loginView")
												.param("userId", "brown")
												.param("pass", "brownpass")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		String viewName = mav.getViewName();
		
		/***Then***/
		assertEquals("login/login", viewName);
		
	}

	
	/**
	* Method : loginProcessTest
	* 작성자 : 김지태
	* 변경이력 :
	* Method 설명 : login process success test 
	 * @throws Exception 
	*/
	@Test
	public void loginProcessSuccessTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(post("/user/loginProcess")
				.param("userId", "brown")
				.param("pass", "brownpass")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		
		/***Then***/
		assertEquals("main", mav.getViewName());
		
	}
	
	
	/**
	* Method : loginProcessTest
	* 작성자 : 김지태
	* 변경이력 :
	* Method 설명 : login process fail test 
	 * @throws Exception 
	*/
	@Test
	public void loginProcessFailTest() throws Exception {
		/***Given***/
		MvcResult mvcResult = mockMvc.perform(post("/user/loginProcess")
				.param("userId", "browm")
				.param("pass", "brownpase")).andReturn();

		/***When***/
		ModelAndView mav = mvcResult.getModelAndView();
		
		/***Then***/
		assertEquals("login/login", mav.getViewName());
		
	}
	
}

