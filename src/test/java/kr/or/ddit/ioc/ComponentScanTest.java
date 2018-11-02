package kr.or.ddit.ioc;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.qos.logback.classic.Logger;
import kr.or.ddit.board.dao.IBoardDao;
import kr.or.ddit.board.model.BoardVO;
import kr.or.ddit.board.service.IBoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:kr/or/ddit/ioc/application-context-scan.xml"})
public class ComponentScanTest {
	
	Logger logger = (Logger) LoggerFactory.getLogger(ComponentScanTest.class);
	
	@Resource(name="boardDao")
	private IBoardDao boardDao;
	
	@Resource(name="boardService")
	private IBoardService boardService;
	
	/**
	* Method : componentScanTest
	* 작성자 : 김지태
	* 변경이력 :
	* Method 설명 :	spring annotation scan을 통해 스프링 빈 생성이
	* 				정상적으로 되었는지 테스트
	*/
	@Test
	public void componentScanTest() {
		/***Given***/

		/***When***/
		List<BoardVO> boardList = boardDao.selectBoardList();
		for(BoardVO boardvo : boardList) {
			logger.debug("{}", boardvo);
		}
		
		/***Then***/
		assertNotNull(boardDao);
		
	}
	
	@Test
	public void boardServiceScanTest() {
		/***Given***/

		/***When***/
		List<BoardVO> boardList = boardService.selectBoardList();
		for(BoardVO boardvo : boardList) {
			logger.debug("{}", boardvo);
		}
		
		/***Then***/
		assertNotNull(boardService);
	}
	
	@Test
	public void beanScanScopeTest() {
		/***Given***/
		

		/***When***/

		/***Then***/

	}
	
}

