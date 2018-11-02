package kr.or.ddit.board.model;

public class BoardVO {

	private int boardId;	//
	private String boardNm;	//
	private String regId;	//
	
	/* 생성자 */
	public BoardVO(int boardId, String boardNm, String regId) {
		super();
		this.boardId = boardId;
		this.boardNm = boardNm;
		this.regId = regId;
	}

	/* 기본생성자 */
	public BoardVO() {}
	
	/* getter & setter */
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getBoardNm() {
		return boardNm;
	}
	public void setBoardNm(String boardNm) {
		this.boardNm = boardNm;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	
	@Override
	public String toString() {
		return "BoardVO [boardId=" + boardId + ", boardNm=" + boardNm + ", regId=" + regId + "]";
	}
	
}

