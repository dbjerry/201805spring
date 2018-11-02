package kr.or.ddit.board.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.or.ddit.board.model.BoardVO;

/** annotation을 통한 bean 등록
 * bean annotation :  @Controller, @Service, @Repository, @Component
 * 
 * @Controller : controller
 * @Service : service
 * @Repository : dao
 * @Component : 일반적인 객체
 * 
 * @Controller, @Service, @Repository 어노테이션은 @Component 어노테이션을 기반으로 확장
 * 
 * 어노테이션 자체가 특별한 기능을 담고 있는 것은 아님
 * 개발에 자주 사용되는 모듈을 분리하여 명명한 것에 불과
 */

/**
* BoardDao.java
*
* @author 김지태
* @version 1.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정자 수정내용
* ------ ------------------------
* pc 최초 생성
*
* </pre>
*/
@Repository(value="boardDao")
public class BoardDao implements IBoardDao{

	@Override
	public List<BoardVO> selectBoardList() {
		
		// db에서 조회해 온 데이터라고 가정하자
		BoardVO boardvo = new BoardVO(1, "자유게시판", "brown");
		BoardVO boardvo2 = new BoardVO(2, "공지사항", "cony");
		BoardVO boardvo3 = new BoardVO(3, "FAQ", "sally");
		
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		boardList.add(boardvo);
		boardList.add(boardvo2);
		boardList.add(boardvo3);
		
		return boardList;
	}
	
	
}

