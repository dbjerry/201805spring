package kr.or.ddit.prod.model;

public class ProdVo {
	
	/* db에서 넘어온 값을 담을 변수들 */
	private String prod_id;		//	제품아이디
	private String prod_name;	//	제품명
	private String lprod_nm;	//	제품그룹명
	private String prod_insdate;//	제품등록일
	private String buyer_name;	//	바이어이름
	private String buyer_mail;	//	바이어이메일
	private int rnum;			//	번호
	
	
	/* 각 변수들의 getter & setter */
	public String getProd_id() {
		return prod_id;
	}
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getLprod_nm() {
		return lprod_nm;
	}
	public void setLprod_nm(String lprod_nm) {
		this.lprod_nm = lprod_nm;
	}
	public String getProd_insdate() {
		return prod_insdate;
	}
	public void setProd_insdate(String prod_insdate) {
		this.prod_insdate = prod_insdate;
	}
	public String getBuyer_name() {
		return buyer_name;
	}
	public void setBuyer_name(String buyer_name) {
		this.buyer_name = buyer_name;
	}
	public String getBuyer_mail() {
		return buyer_mail;
	}
	public void setBuyer_mail(String buyer_mail) {
		this.buyer_mail = buyer_mail;
	}
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	
}

