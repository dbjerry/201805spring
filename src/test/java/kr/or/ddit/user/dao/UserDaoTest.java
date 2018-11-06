package kr.or.ddit.user.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.test.ServiceDaoTestConfig;
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

public class UserDaoTest extends ServiceDaoTestConfig{
	
	@Resource(name="userDao")
	private UserDaoInf userDao;
	
	private final String TEST_USER_ID = "minions";
	
	@Test
	public void getUserAllTest() {
		/***Given***/
		
		/***When***/
		List<UserVo> testList = userDao.selectUserAll();
		System.out.println(testList);
		
		/***Then : 실제 데이터 count 5와 가져온 사이즈가 같은지 비교***/
		assertEquals(110, testList.size());
	}

	@Test
	public void selectUserTest() {
		/***Given***/
		
		/***When***/
		UserVo userTest = userDao.selectUser("brown");
		System.out.println(userTest);
		
		/***Then***/
		assertNotNull(userTest);
		assertEquals("브라운", userTest.getName());
		assertEquals("brown", userTest.getUserId());
	}
	
	@Test
	public void selectUserByVoTest() {
		/***Given***/
		UserVo userVo = new UserVo();
		userVo.setUserId("sally");
		
		/***When***/
		UserVo userByVo = userDao.selectUser(userVo);
		System.out.println(userByVo);
		
		/***Then***/
		assertNotNull(userByVo);
		assertEquals("샐리", userByVo.getName());
		assertEquals("sally", userByVo.getUserId());
		
	}
	
	@Test
	public void selectUserPageListTest() {
		/***Given***/
		PageVo pageVo = new PageVo();
		pageVo.setPage(1);
		pageVo.setPageSize(10);

		/***When***/
		List<UserVo> pageList = userDao.selectUserPageList(pageVo);

		/***Then***/
		assertEquals(10, pageList.size());
		
	}
	
	@Test
	public void insertUserTest() {
		/***Given***/
		
		
		
		//uservo준비
		UserVo uservo = new UserVo();
		uservo.setUserId("minions2");
		uservo.setPass("pass1234");
		uservo.setName("testUserId");
		uservo.setAddr1("대전광역시");
		uservo.setAddr2("알거없구");
		uservo.setZipcd("31059");
		uservo.setEmail("mi@ni.ons");
		uservo.setTel("042-627-0550");
		uservo.setBirth("1991-08-14");
		uservo.setProfile("");

		/***When***/
		int insertCnt = userDao.insertUser(uservo);

		/***Then***/
		assertEquals(1, insertCnt);

	}
	
	
	
	/**
	 * Method : getUserCntTest
	 * 작성자 : 김지태
	 * 변경이력 :
	 * Method 설명 : 사용자 전체 건수 조회 테스트
	 */
	@Test
	public void getUserCntTest() {
		/***Given***/

		/***When***/
		int totalUserCnt = userDao.getUserCnt();
		
		/***Then***/
		assertEquals(110, totalUserCnt);
		
	}
	
}

