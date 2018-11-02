package kr.or.ddit.ioc;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.qos.logback.classic.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/ioc/application-context-placeholder.xml"})
public class PlaceHolderTest {
	Logger logger = (Logger) LoggerFactory.getLogger(PlaceHolderTest.class);
	
	@Resource(name="placeHolder")
	private PlaceHolder placeholder;
	
	@Test
	public void test() {
		/***Given***/
		
		
		/***When***/
		
		
		/***Then***/
		assertNotNull(placeholder);
		logger.debug("placeholder : {}", placeholder);
		
	}

}

