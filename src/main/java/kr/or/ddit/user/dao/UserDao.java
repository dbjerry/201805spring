package kr.or.ddit.user.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

@Repository(value="userDao")
public class UserDao implements UserDaoInf{
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	// jspuser 테이블 데이터 전체 조회 쿼리
	// select query id : selectUserAll
	public List<UserVo> selectUserAll(){
		return template.selectList("jspuser.selectUserAll");
		
		//session.close();
		// selectOne : 데이터가 한 건일 때
		// selectList : 여러건의 데이터를 조회
		// 메서드 인자 : 문자열 = 네임스페이스(모듈명).쿼리아이디 
		//return userList;
		//return session.selectOne("jspUser.selectUserAll");
	}
	
	/* 회원정보조회 */
	public UserVo selectUser(String userId){
		return template.selectOne("jspuser.selectUser", userId);
		
		// selectOne : VO객체로 받으면 컬럼의 갯수와 상관없이 selectOne을 사용할 수 있다.
		//return selectUser;
	}
	
	public UserVo selectUser(UserVo userVo){
		return template.selectOne("jspuser.selectUserByVo", userVo);
		
		// selectOne : VO객체로 받으면 컬럼의 갯수와 상관없이 selectOne을 사용할 수 있다.
		//return selectUser;
	}

	@Override
	public List<UserVo> userAllList() {
		
		return template.selectList("jspuser.userAllList"); 
	}

	@Override
	public List<UserVo> selectUserPageList(PageVo pageVo) {

		return template.selectList("jspuser.selectUserPageList", pageVo);
	}

	/**
	 * Method : getUserCnt
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @return
	 * Method 설명 : 사용자 전체 건수 조회
	 */
	@Override
	public int getUserCnt() {
		return template.selectOne("jspuser.getUserCnt");
		
		// selectOne : 데이터가 한 건일 때
		// selectList : 여러건의 데이터를 조회
		// 메서드 인자 : 문자열 = 네임스페이스(모듈명).쿼리아이디 
		//return totalUserCnt;
		//return session.selectOne("jspUser.selectUserAll");
	}

	/**
	 * Method : insertUser
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param userVo
	 * @return
	 * Method 설명 : 사용자 등록
	 */
	@Override
	public int insertUser(UserVo userVo) {

		return template.insert("jspuser.insertUser", userVo);
	}

	/**
	 * Method : deleteUser
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 삭제
	 */
	@Override
	public int deleteUser(String userId) {
		
		return template.delete("jspuser.deleteUser");
	}

	/**
	 * Method : updateUser
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param userVo
	 * @return
	 * Method 설명 : 사용자 수정
	 */
	@Override
	public int updateUser(UserVo userVo) {
		
		return template.update("jspuser.updateUser", userVo);
	}
	
}

