package kr.or.ddit.ioc;

import static org.junit.Assert.assertNotNull;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.board.dao.IBoardDao;
import kr.or.ddit.board.service.IBoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {JavaComponentScanConfigTest.class})
public class JavaComponentScanConfigTest {

	@Resource(name="getBoardDao")
	private IBoardDao boardDao;
	
	@Resource(name="boardService")
	private IBoardService boardService;
	
	/**
	* Method : javaConfigTest
	* 작성자 : 김지태
	* 변경이력 :
	* Method 설명 : javaConfig를 통해 스프링 빈이 정상적으로 생성 되었는지 테스트
	*/
	@Test
	public void javaConfigTest() {
		/***Given***/

		/***When***/

		/***Then***/
		assertNotNull(boardDao);
		assertNotNull(boardService);
		
		
	}

}

