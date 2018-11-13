package kr.or.ddit.util;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.util.dao.IUtilDao;

public class SpringTask {

	@Resource(name="utilDao")
	private IUtilDao utilDao;
	
	private Logger logger = LoggerFactory.getLogger(SpringTask.class);
	
	public void logging() {
		logger.debug("SpringTask.logging()");
	}
	
	/**
	* Method : makeMonthlyCalendar
	* 작성자 : jerry
	* 변경이력 :
	* Method 설명 : 매 달 마지막날 월 단위 달력 생성
	*/
	//이 메서드가 실행되는 시점은 매 달 마지막날 생성됨
	//다음 달 년월 파라미터를 생성하여 실행(2018년 11월 30일 실행 ==> 201812)
	public void makeMonthlyCalendar() {
		
		//내일 날짜
		GregorianCalendar gc = new GregorianCalendar(Locale.KOREA);
		gc.add(GregorianCalendar.DAY_OF_MONTH, 1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String ym = sdf.format(gc.getTime());
		
		logger.debug("ym : {}", ym);
		
		utilDao.makeMonthlyCalendar(ym);
	}
	
}

