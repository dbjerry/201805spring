package kr.or.ddit.ioc;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.board.dao.IBoardDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/ioc/application-context.xml"})
public class SpringScopeTest {

	// DI
	@Resource(name="boardDao")
	private IBoardDao boardDao;

	@Resource(name="boardDaoSingleton")
	private IBoardDao boardDaoSingleton;
	
	/**
	* Method : springBeanScopeSingletonTest
	* 작성자 : 김지태
	* 변경이력 :
	* Method 설명 : spring scope singleton test
	*/
	@Test
	public void springBeanScopeSingletonTest() {
		/***Given***/

		/***When***/

		/***Then***/
		assertNotEquals(boardDao, boardDaoSingleton);
		//assertEquals(boardDao, boardDaoSingleton);

	}

}

