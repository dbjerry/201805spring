package kr.or.ddit.test;

import static org.junit.Assert.assertTrue;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//service, dao에 대한 설정파일만 필요
@ContextConfiguration(locations= {"classpath:kr/or/ddit/config/spring/root-context.xml",
								  "classpath:kr/or/ddit/config/spring/datasource-test-context.xml",
								  "classpath:kr/or/ddit/config/spring/transaction-context.xml",
								  "classpath:kr/or/ddit/config/spring/batch-context.xml"})
public class ServiceDaoTestConfig {
	
	@Resource(name="datasource")
	private DataSource datasource;
	
	@Before
	public void rangersSetup() {
		//데이터 초기화
		//delete query 호출 ==> sql 스크립트를 실행
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		populator.addScript(new ClassPathResource("kr/or/ddit/config/db/dbInit.sql"));
		//populator.addScripts(new ClassPathResource("kr/or/ddit/config/db/dbInit.sql2"));
		DatabasePopulatorUtils.execute(populator, datasource);

	}
	
	@Ignore
	@Test
	public void test() {
		assertTrue(true);
	}

}

