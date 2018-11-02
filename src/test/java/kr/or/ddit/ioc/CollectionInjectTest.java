package kr.or.ddit.ioc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/ioc/application-context-collection.xml"})
public class CollectionInjectTest {
	
	@Resource(name="collectionBean")
	private CollectionBean collectionBean;
	
	/**
	* Method : collectionBeanTest
	* 작성자 : 김지태
	* 변경이력 :
	* Method 설명 : 스프링 설정파일을 통해 collection 객체 주입이 정상적으로
	* 				이루어지는지 테스트
	*/
	@Test
	public void collectionBeanTest() {
		/***Given***/
		List<String> list = collectionBean.getList();
		Set<String> set = collectionBean.getSet();
		Map<String, String> map = collectionBean.getMap();
		Properties property = collectionBean.getProperty();

		/***When***/
		
		
		/***Then***/
		assertNotNull(collectionBean);	//	spring 컨테이너에서 DL을 통해 받은 빈 : 정상적이라면 null일 수 없다.
		
		//list 검증
		assertEquals(3, list.size());
		assertEquals("kevin", list.get(0));
		assertEquals("bob", list.get(1));
		
		//set 검증
		assertEquals(3, set.size());
		assertEquals(true, set.contains("jerry_set"));
		
		//map 검증
		assertEquals("kevin", map.get("name"));
		assertEquals("15", map.get("age"));
		
		//property 검증
		assertEquals("jerry", property.get("db.userId"));
		assertEquals("java", property.getProperty("db.password"));
		
	}

}

