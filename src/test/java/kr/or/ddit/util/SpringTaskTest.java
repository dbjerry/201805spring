package kr.or.ddit.util;

import static org.junit.Assert.assertTrue;

import javax.annotation.Resource;

import org.junit.Test;

import kr.or.ddit.test.ServiceDaoTestConfig;

public class SpringTaskTest extends ServiceDaoTestConfig{

	@Resource(name="springTask")
	private SpringTask springTask;
	
	@Test
	public void makeMonthlyCalendarTest() {
		/***Given***/

		/***When***/
		springTask.makeMonthlyCalendar();

		/***Then***/
		assertTrue(true);

	}

}

