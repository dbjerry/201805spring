package kr.or.ddit.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.or.ddit.board.dao.BoardDao;
import kr.or.ddit.board.dao.IBoardDao;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.IBoardService;

@Configuration
public class javaConfig {
	
	//boardDao spring bean 등록
	// <bean id="boardDao" class="kr.or.ddit.board.dao.BoardDao"/>
	@Bean
	public IBoardDao getBoardDao() {
		return new BoardDao();
	}
	
	//boardService spring bean 등록
	@Bean(name= {"boardServiceBean"})
	public IBoardService boardService() {
		IBoardService boardService = new BoardService();
		boardService.setBoardDao(getBoardDao());
		
		return boardService;
	}
	
}

