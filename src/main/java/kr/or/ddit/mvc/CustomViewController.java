package kr.or.ddit.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

import kr.or.ddit.mvc.view.TimesTablesView;

@Controller
public class CustomViewController {
	
	//http://localhost:8081/customView
	@RequestMapping("/customView")
	public View customView() {
		
		return new TimesTablesView();
	}
	
	//http://localhost:8081/customView
	@RequestMapping("/customViewBeanName")
	public String customViewBeanName() {
		
		return "TimesTablesView";
	}
	
}

