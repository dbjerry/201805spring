package kr.or.ddit.user.model;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class UserVo implements HttpSessionBindingListener{
	private String userId;	//	아이디
	private String name;	//	이름
	private String pass;	//	비밀번호
	private String addr1;	//	도로주소
	private String addr2;	//	도로주소 상세
	private String zipcd;	//	우편번호
	/*
	 * Date Type이라면
	 * @DateTimeFormat(pattern="yyyy-MM-dd")
	 * private Date birth;
	 */
	private String birth;	//	생일
	private String email;	//	이메일
	private String tel;		//	전화번호
	private String profile;	//	프로필경로
	private String alias;	//	별명
	private int rnum;		//	번호
	
	/* 기본생성자 */
	public UserVo() {}
	
	/* 생성자 */
	public UserVo(String userId, String name) {
		this.userId = userId;
		this.name = name;
	}
	
	/* getter & setter */
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getZipcd() {
		return zipcd;
	}
	public void setZipcd(String zipcd) {
		this.zipcd = zipcd;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	/*
	 * public String getFormattedBirth(){
	 * 	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	 * 	return sdf.format(birth);
	 * }
	 */
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int num) {
		this.rnum = num;
	}
	
	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", name=" + name + ", pass=" + pass
				+ ", addr1=" + addr1 + ", addr2=" + addr2 + ", zipcd=" + zipcd
				+ ", birth=" + birth + ", email=" + email + ", tel=" + tel
				+ ", profile=" + profile + ", alias=" + alias + "]\n";
	}
	
	
	/**
	 * Method : authPass
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param encryptPass
	 * @return
	 * Method 설명 : 비밀번호 검증
	 */
	public boolean authPass(String encryptPass) {
		return getPass().equals(encryptPass);
	}
	
	
	/**
	 * Method : valueBound
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param event
	 * Method 설명 : value들을 묶는다(bound)
	 */
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("uservo : " + event.getName());
	}
	
	
	/**
	 * Method : valueUnbound
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param event
	 * Method 설명 : 
	 */
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		
	}
	
}

