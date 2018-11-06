package kr.or.ddit.user.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

public interface UserDaoInf {
	
	/**
	 * Method : selectUserAll
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @return
	 * Method 설명 : 회원 전체를 조회하는 메서드
	 */
	public List<UserVo> selectUserAll();
	
	/**
	 * Method : selectUser
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 회원 검색(인자 : String)
	 */
	public UserVo selectUser(String userId);
	
	/**
	 * Method : selectUser
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param userVo
	 * @return
	 * Method 설명 : 회원 검색(인자 : UserVo)
	 */
	public UserVo selectUser(UserVo userVo);
	
	/**
	 * Method : userAllList
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 회원 조회(일부 컬럼만 추출)
	 */
	public List<UserVo> userAllList();
	
	/**
	 * Method : selectUserPageList
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param page
	 * @return
	 * Method 설명 : 페이징처리 메서드
	 */
	public List<UserVo> selectUserPageList(PageVo pageVo);
	
	/**
	 * Method : getUserCnt
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @return
	 * Method 설명 : 사용자 전체 건수 조회
	 */
	public int getUserCnt();
	
	/**
	 * Method : insertUser
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param userVo
	 * @return
	 * Method 설명 : 사용자 등록
	 */
	public int insertUser(UserVo userVo);
	
	/**
	 * Method : deleteUser
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 삭제
	 */
	public int deleteUser(String userId);

	/**
	 * Method : updateUser
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param userVo
	 * @return
	 * Method 설명 : 사용자 수정
	 */
	public int updateUser(UserVo userVo);
	
}

