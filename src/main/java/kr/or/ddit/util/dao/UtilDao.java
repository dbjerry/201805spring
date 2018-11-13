package kr.or.ddit.util.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UtilDao implements IUtilDao{

	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	/**
	* Method : makeMonthlyCalendar
	* 작성자 : jerry
	* 변경이력 :
	* @param ym
	* @return
	* Method 설명 : 월 단위 달력 생성
	*/
	@Override
	public int makeMonthlyCalendar(String ym) {
		return template.insert("util.makeMonthlyCalendar", ym);
	}
	
}

