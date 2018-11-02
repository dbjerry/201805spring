package kr.or.ddit.ioc;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ch.qos.logback.classic.Logger;
import kr.or.ddit.board.dao.IBoardDao;
import kr.or.ddit.board.model.BoardVO;
import kr.or.ddit.board.service.IBoardService;

public class IocMain {
	
	private static Logger logger = (Logger) LoggerFactory.getLogger(IocMain.class);
	
	public static void main(String[] args) {
		
		//Spring Container 생성, 배열 상태로 설정상태 문자열을 넘기는걸 많이 씀
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
				"classpath:kr/or/ddit/ioc/application-context.xml"//설명서 파일, src/main/resources에 패키지 생성
		});
		
		//Spring Container에서 boardDao spring bean을 요청 : DL(Dependency Lookup)
		IBoardDao boardDao = context.getBean("boardDao", IBoardDao.class); //그 이름을 갖는 스피링 빈을 호출, <bean id="">
		List<BoardVO> boardVOs1 = boardDao.selectBoardList();
		for(BoardVO boardVO : boardVOs1) {
			logger.debug("boardVO : {}", boardVO);
			//System.out.println("boardVO : " + boardVO);
		}
		
		
		//Spring Container에서 boardService 스프링 빈을 요청후 selectBoardList 결과를 logger를 이용해 console에 출력
		IBoardService boardService = (IBoardService) context.getBean("boardService", IBoardService.class);
		List<BoardVO> boardVOs2 = boardService.selectBoardList();
		for(BoardVO boardVO : boardVOs2) {
			logger.debug("boardVO : {}", boardVO);
		}

		
		//생성자 주입을 통해 생성된 boardService spring bean을 요청
		IBoardService boardServiceConst = (IBoardService) context.getBean("boardServiceConst", IBoardService.class);
		List<BoardVO> boardVOs3 = boardServiceConst.selectBoardList();
		for(BoardVO boardVO : boardVOs3) {
			logger.debug("boardVO : {}", boardVO);
		}
		
		//spring scope-prototype test
		IBoardDao boardDaoSingleton1 = 
				context.getBean("boardDaoSingleton", IBoardDao.class);
		
		IBoardDao boardDaoSingleton2 = 
				context.getBean("boardDaoSingleton", IBoardDao.class);
		
		logger.debug("spring singleton bean test : {}",
				boardDaoSingleton1 == boardDaoSingleton2);
	}
}

