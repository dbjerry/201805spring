package kr.or.ddit.rangers.dao;

import java.util.List;

import kr.or.ddit.rangers.model.RangersVo;

public interface IRangersDao {

	/**
	* Method : selectAllRangers
	* 작성자 : jerry
	* 변경이력 :
	* @return
	* Method 설명 : 레인저스 정보 전체 조회
	*/
	List<RangersVo> selectAllRangers();

	
	/**
	* Method : insertRangers
	* 작성자 : jerry
	* 변경이력 :
	* @return
	* Method 설명 : 레인저스 정보 입력
	*/
	int insertRangers(RangersVo rangers);

}

