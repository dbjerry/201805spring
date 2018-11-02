package kr.or.ddit.user.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;
import kr.or.ddit.user.model.UserVo;

@RequestMapping("/user")
@Controller
public class UserController {
	final String db_userId = "brown";
	final String db_pass = "brownpass";
	
	private Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/loginView")
	public String login(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String password = request.getParameter("pass");
		
		return "login/login";
	}
	
	
	@RequestMapping("/loginProcess")
	public String process(UserVo uservo) {
		
		String getUserId = uservo.getUserId();
		String getUserPass = uservo.getPass();
		
		if(check(getUserId, getUserPass)) {
			return "main";
		
		} else {
			return "login/login";
		
		}
	}
	
	
	/**
	* Method : check
	* 작성자 : 김지태
	* 변경이력 :
	* @param userid
	* @return
	* Method 설명 : 아이디 비번 체크
	*/
	public boolean check(String userid, String userpass) {
		
		if(db_userId.equals(userid) && db_pass.equals(userpass)) {
			return true;
			
		} else {
			return false;
			
		}
	}
	
}

