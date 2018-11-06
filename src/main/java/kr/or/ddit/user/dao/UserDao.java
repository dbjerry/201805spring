package kr.or.ddit.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import kr.or.ddit.config.db.SqlFactoryBuilder;
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

@Repository(value="userDao")
public class UserDao implements UserDaoInf{
	
	// jspuser 테이블 데이터 전체 조회 쿼리
	// select query id : selectUserAll
	public List<UserVo> selectUserAll(){
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		
		List<UserVo> userList = session.selectList("jspuser.selectUserAll");
		
		session.close();
		// selectOne : 데이터가 한 건일 때
		// selectList : 여러건의 데이터를 조회
		// 메서드 인자 : 문자열 = 네임스페이스(모듈명).쿼리아이디 
		return userList;
//		return session.selectOne("jspUser.selectUserAll");
	}
	
	/* 회원정보조회 */
	public UserVo selectUser(String userId){
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		
		UserVo selectUser = session.selectOne("jspuser.selectUser", userId);
		
		session.close();
		
		// selectOne : VO객체로 받으면 컬럼의 갯수와 상관없이 selectOne을 사용할 수 있다.
		return selectUser;
	}
	
	public UserVo selectUser(UserVo userVo){
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		
		UserVo selectUser = session.selectOne("jspuser.selectUserByVo", userVo);
		
		session.close();
		
		// selectOne : VO객체로 받으면 컬럼의 갯수와 상관없이 selectOne을 사용할 수 있다.
		return selectUser;
	}

	@Override
	public List<UserVo> userAllList() {
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		
		List<UserVo> userAllList = session.selectList("jspuser.userAllList"); 
		
		session.close();
		
		return userAllList;
	}

	@Override
	public List<UserVo> selectUserPageList(PageVo pageVo) {
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		
		List<UserVo> pageList = session.selectList("jspuser.selectUserPageList", pageVo);
		
		System.out.println("pageList.size() : " + pageList.size());
		
		session.close();
		
		return pageList;
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
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		
		int totalUserCnt = session.selectOne("jspuser.getUserCnt");
		
		session.close();
		// selectOne : 데이터가 한 건일 때
		// selectList : 여러건의 데이터를 조회
		// 메서드 인자 : 문자열 = 네임스페이스(모듈명).쿼리아이디 
		return totalUserCnt;
//		return session.selectOne("jspUser.selectUserAll");
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
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		
		int insertCnt = session.insert("jspuser.insertUser", userVo);
		
		session.commit();
		session.close();
		
		return insertCnt;
		
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
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		
		int deleteCnt = session.delete("jspuser.deleteUser");
		
		session.commit();
		session.close();
		
		return deleteCnt;
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
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		
		int updateCnt = session.update("jspuser.updateUser");
		
		session.commit();
		session.close();
		
		return updateCnt;
	}
	
}

