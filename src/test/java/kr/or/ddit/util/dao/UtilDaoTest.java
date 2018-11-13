package kr.or.ddit.util.dao;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;

import kr.or.ddit.test.ServiceDaoTestConfig;

public class UtilDaoTest extends ServiceDaoTestConfig {

	@Resource(name="utilDao")
	private IUtilDao utilDao;
	
	/**
	* Method : makeMonthlyCalendar
	* 작성자 : jerry
	* 변경이력 :
	* @param ym
	* @return
	* Method 설명 : 월 단위 달력 생성 테스트
	*/
	@Test
	public void makeMonthlyCalendarTest() {
		/***Given***/
		String ym = "201811";

		/***When***/
		int insertCnt = utilDao.makeMonthlyCalendar(ym);
		
		/***Then***/
		assertEquals(30, insertCnt);

	}

}
