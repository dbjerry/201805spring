package kr.or.ddit.mvc;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch.qos.logback.classic.Logger;

//@ModelAttribute에 의해 저장된 속성이 있을 경우
// 재요청시 @ModelAttribute가 적용된 메서드를 재실행하지 않고
// 세선에 저장하여 값을 재활용
// (잘 변경되지 않는 값을 저장할 경우 메서드가 매 번 호출되는 과부하를 줄일 수 있다.)
@SessionAttributes("minions")
@Controller
public class MvcController {
	
	private Logger logger = (Logger) LoggerFactory.getLogger(MvcController.class);
	
	/* 
	 * @RequestMapping이 붙은 메서드가 실행되기 전에 먼저 실행됨
	 * 해당 컨트롤러에서 공통적으로 사용될 속성이 있을 경우
	 * 중복을 피하기 위해 @ModelAttribute 어노테이션을 적용한
	 * 메서드를 통해 코드 중복을 막을 수 있음
	 */
	
	@ModelAttribute(value="minions")
	public List<String> setup(Model model) {
		logger.debug("{}", "setup");
		
		List<String> minions = new ArrayList<String>();
		minions.add("kevin");
		minions.add("bob");
		minions.add("jerry");
		
		//model.addAttribute("minions", minions);
		return minions;
	}
	
	@RequestMapping("/mvc/view")
	public String mvcView(@ModelAttribute("minions")List<String> minions) {
//		for(String minion : minions) {
//			logger.debug("minion : {}", minion);
//		}
		
		minions.add("villain");
		
		return "mvc/view";
	}
	
	@RequestMapping("/mvc/view2")
	public String mvcView2() {
		return "mvc/view";
	}
	
	
	//@pathvariable : 요청 url의 일부를 메서드 인자로 쉽게 받을 수 있는 어노테이션
	// http://localhost:8081/mvc/central : logger central
	// http://localhost:8081/mvc/left : logger left
	@RequestMapping("/mvc/{libcd}")
	public String pathvariable(@PathVariable("libcd") String libcd) {
		logger.debug("libcd : {}", libcd);
		return "mvc/view";
	}
}

