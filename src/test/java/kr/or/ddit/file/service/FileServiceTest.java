package kr.or.ddit.file.service;

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
public class FileServiceTest extends ServiceDaoTestConfig{
	
	@Resource(name="fileService")
	private IFileService fileService;
	
	@Test
	public void insertFileTest() {
		/***Given***/
		FileVo filevo = new FileVo();
		filevo.setFile_name("16c92f-de87-5c224-4952-&231%.png");
		filevo.setOrg_file_name("james.png");
		filevo.setFile_ext(".png");
		filevo.setFile_path("C:\\ddit\\A_TeachingMaterial\\6.JspSrpgin\\upload");
		
		/***When***/
		int insertCnt = fileService.insertFile(filevo);
		
		/***Then***/
		assertEquals(1, insertCnt);
		
	}

}
