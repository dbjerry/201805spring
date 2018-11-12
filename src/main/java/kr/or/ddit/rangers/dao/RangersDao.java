package kr.or.ddit.rangers.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.rangers.model.RangersVo;

@Repository
public class RangersDao implements IRangersDao{

	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	/**
	* Method : selectAllRangers
	* 작성자 : jerry
	* 변경이력 :
	* @return
	* Method 설명 : 레인저스 정보 전체 조회
	*/
	@Override
	public List<RangersVo> selectAllRangers() {
		return template.selectList("rangers.selectAllRangers");
	}

	
	/**
	* Method : insertRangers
	* 작성자 : jerry
	* 변경이력 :
	* @return
	* Method 설명 : 레인저스 정보 입력
	*/
	@Override
	public int insertRangers(RangersVo rangers) {
		return template.insert("rangers.insertRangers", rangers);
	}

	
	
}

