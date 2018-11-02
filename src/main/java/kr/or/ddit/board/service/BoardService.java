package kr.or.ddit.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.ddit.board.dao.IBoardDao;
import kr.or.ddit.board.model.BoardVO;


@Service("boardService")
public class BoardService implements IBoardService{
	@Resource(name="boardDao")
	//@Resource(name="getBoardDao") ==> JavaConfigTest.java용
	private IBoardDao boardDao;
	
	/* 생성자 */
	public BoardService(IBoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	/* 기본생성자 */
	public BoardService() {}

	/* getter & setter */
	public IBoardDao getBoardDao() {
		return boardDao;
	}
	public void setBoardDao(IBoardDao boardDao) {
		this.boardDao = boardDao;
	}

	@Override
	public List<BoardVO> selectBoardList() {
		return boardDao.selectBoardList();
	}

}

