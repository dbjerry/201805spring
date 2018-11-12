package kr.or.ddit.rangers.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import kr.or.ddit.rangers.model.RangersVo;
import kr.or.ddit.test.ServiceDaoTestConfig;

public class RangersDaoTest extends ServiceDaoTestConfig{

	@Resource(name="rangersDao")
	private IRangersDao rangersDao;
	
	/**
	* Method : selectAllRangersTest
	* 작성자 : jerry
	* 변경이력 :
	* Method 설명 : 레인저스 정보 전체 조회
	*/
	@Test
	public void selectAllRangersTest() {
		/***Given***/
		

		/***When***/
		List<RangersVo> rangersList = rangersDao.selectAllRangers();
		
		/***Then***/
		assertEquals(3, rangersList.size());
		
	}

	/**
	* Method : insertRangersTest
	* 작성자 : jerry
	* 변경이력 :
	* Method 설명 : 레인저스 입력 테스트
	*/
	@Test
	public void insertRangersTest() {
		/***Given***/
		RangersVo rangers = new RangersVo();
		rangers.setRangersId("moon");
		rangers.setName("문");

		/***When***/
		int insertCnt = rangersDao.insertRangers(rangers);

		/***Then***/
		assertEquals(1, insertCnt);

	}
	
}

