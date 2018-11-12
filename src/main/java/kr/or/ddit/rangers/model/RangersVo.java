package kr.or.ddit.rangers.model;

public class RangersVo {
	private String rangersId;	//레인저스 ID
	private String name;		//레인저스 이름
	
	/* 기본생성자 */
	public RangersVo() {

	}
	
	/* getter & setter */
	public String getRangersId() {
		return rangersId;
	}
	public void setRangersId(String rangersId) {
		this.rangersId = rangersId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

