package kr.or.ddit.file.dao;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.file.model.FileVo;
import kr.or.ddit.test.ServiceDaoTestConfig;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations= {"classpath:kr/or/ddit/config/spring/root-context.xml"})
public class FileDaoTest extends ServiceDaoTestConfig{

	@Resource(name="fileDao")
	private IFileDao fileDao;
	
	/**
	* Method : insertFileTest
	* 작성자 : jerry
	* 변경이력 :
	* Method 설명 : 파일정보 입력 테스트
	*/
	@Test
	public void insertFileTest() {
		/***Given***/
		FileVo filevo = new FileVo();
		filevo.setFile_name("16c92f-de87-5c114-4952-&231%.png");
		filevo.setOrg_file_name("sally.png");
		filevo.setFile_ext(".png");
		filevo.setFile_path("C:\\ddit\\A_TeachingMaterial\\6.JspSrpgin\\upload");

		/***When***/
		int insertCnt = fileDao.insertFile(filevo);
		
		/***Then***/
		assertEquals(1, insertCnt);
		
	}

}

