package kr.or.ddit.user.web;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import ch.qos.logback.classic.Logger;
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.user.service.UserServiceInf;
import kr.or.ddit.util.model.PageVo;

@RequestMapping("/user")
@Controller
public class UserController {
	
	//userService 스프링 빈 주입
	@Resource(name="userService")
	private UserServiceInf userService;
	
	final String db_userId = "brown";
	final String db_pass = "brownpass";
	
	private Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/loginView")
	public String login(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String password = request.getParameter("pass");
		
		return "login/login";
	}
	
	
	@RequestMapping(value="/loginProcess", method=RequestMethod.POST)
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
	* Method : userAllList
	* 작성자 : jerry
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 전체 조회
	*/
	@RequestMapping("/userAllList")
	public String userAllList(Model model) {
		List<UserVo> userList = userService.userAllList();
		
		//request.setAttribute("userList", userList);
		model.addAttribute("userList", userList);
		
		//RequestDispatcher rd = request.getRequestDispatcher("/user/userAllList.jsp");
		//rd.forward(request, response);
		
		return "user/userAllList";
	}
	
	
	@RequestMapping("/userPageList")
	public String userPageList(PageVo pageVo, Model model) {
		
		//Map<String, Object> resultMap = userService.selectUserPageList(pageVo);
		
		//키값을 지정하지 않아도 알아서 Map객체 내의 Key값으로 받아옴
		//model.addAllAttributes(resultMap);
		
		return "user/userPageList";
	}
	
	
	@RequestMapping("/userPageListAjax")
	public String userPageListAjax(PageVo pageVo, Model model) {

		Map<String, Object> resultMap = userService.selectUserPageList(pageVo);
		
		model.addAllAttributes(resultMap);
		
		return "jsonView";
	}
	
	
	@RequestMapping("/userPageListAjaxHtml")
	public String userPageListAjaxHtml(PageVo pageVo, Model model) {

		Map<String, Object> resultMap = userService.selectUserPageList(pageVo);
		
		model.addAllAttributes(resultMap);
		
		return "user/pageListHtml";
	}
	
	
	@RequestMapping("/userPagenationHtml")
	public String userPagenationHtml(PageVo pageVo, Model model) {

		Map<String, Object> resultMap = userService.selectUserPageList(pageVo);
		
		model.addAllAttributes(resultMap);
		
		return "user/pagenationHtml";
	}
	
	
	@RequestMapping("/userDetail")
	public String userDetail(@RequestParam("userId")String userId, Model model) {
		/*
		 * String userId = request.getParameter("userId");
		 */
		//@RequestParam 어노테이션을 통해 설정
		
		// 사용자 아이디에 해당하는 사용자 정보 조회
		//UserVo userVo = service.selectUser(userId);
		UserVo userVo = userService.selectUser(userId);
		
		/*
		 * request.setAttribute("userVo", userVo);
		 */
		model.addAttribute("userVo", userVo);
		
		/*
		 * RequestDispatcher rd = request.getRequestDispatcher("/user/userDetail.jsp");
		 * rd.forward(request, response);
		 */
		return "user/userDetail";
	}
	
	
	@RequestMapping(value="/userForm", method=RequestMethod.GET)
	public String userFormView() {
		return "user/userForm";
	}
	
	
	@RequestMapping(value="/userForm", method=RequestMethod.POST)
	public String userForm(@RequestPart("profilePic") MultipartFile part, 
							HttpServletRequest request, 
							UserVo userVo) {
		
		try {
			if(part.getSize() > 0) {
				//String path = getServletContext().getRealPath("/profile");
				String path = request.getServletContext().getRealPath("/profile");
				
				String fileName = part.getOriginalFilename();
				
				part.transferTo(new File(path + File.separator + fileName));

				//String profile = "/profile/" + fileName;
				userVo.setProfile("/profile/" + fileName);

			} else {
				userVo.setProfile("");
			
			}
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
		int insertCnt = userService.insertUser(userVo);
		
		//response.sendRedirect("/userPageList?page=1&pageSize=10");
		return "redirect:/user/userPageList?page=1&pageSize=10";
	}
	
	
	@RequestMapping(value="/userUpdateForm", method=RequestMethod.GET)
	public String userUpdateFormView(@RequestParam("userId") String userId, UserVo userVo, Model model) {
		userVo = userService.selectUser(userId);

		//request.setAttribute("userVo", userVo);
		model.addAttribute("userVo", userVo);
		
		//request.getRequestDispatcher("/user/userUpdateForm.jsp").forward(request, response);
		return "user/userUpdateForm";
	}
	
	
	@RequestMapping(value="/userUpdateForm", method=RequestMethod.POST)
	public String userUpdateForm(@RequestParam("userId") String userId, 
									@RequestPart("profilePic") MultipartFile part, 
									UserVo userVo, HttpServletRequest request) {
		
		org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class);
		
		try {
			if(part.getSize() > 0) {
				//String path = getServletContext().getRealPath("/profile");
				String path = request.getServletContext().getRealPath("/profile");
				
				String fileName = part.getOriginalFilename();
				
				part.transferTo(new File(path + File.separator + fileName));

				//String profile = "/profile/" + fileName;
				userVo.setProfile("/profile/" + fileName);

			} else {
				userVo.setProfile("");
			
			}
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		logger.debug("userVo : {}", userVo);
		
		int updateCnt = userService.updateUser(userVo);
		
		return "user/userDetail";
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

