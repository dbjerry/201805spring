package kr.or.ddit.lotto;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.qos.logback.classic.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/lotto/lotto.xml"})
public class LottoTest {
	Logger logger = (Logger) LoggerFactory.getLogger(LottoTest.class);
	
	private Lotto lotto;
	
	@Test
	public void lottoTest() {
		/***Given***/
		
		
		
		/***When***/
		lotto = new Lotto();
		lotto.setMaxNum(45);
		lotto.setBallNum(6);
		int[] lottos = lotto.execute();
		
		
		/***Then***/
		assertEquals(6, lottos.length);
		logger.debug("lotto : {}", lottos);
	}

}
