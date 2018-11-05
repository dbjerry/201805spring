package kr.or.ddit.mvc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import ch.qos.logback.classic.Logger;
import kr.or.ddit.file.model.FileVo;
import kr.or.ddit.file.service.IFileService;
import kr.or.ddit.file.util.FileUtil;

//@ModelAttribute에 의해 저장된 속성이 있을 경우
// 재요청시 @ModelAttribute가 적용된 메서드를 재실행하지 않고
// 세선에 저장하여 값을 재활용
// (잘 변경되지 않는 값을 저장할 경우 메서드가 매 번 호출되는 과부하를 줄일 수 있다.)
@SessionAttributes("minions")
@Controller
public class MvcController {
	
	private Logger logger = (Logger) LoggerFactory.getLogger(MvcController.class);
	
	@Resource(name="fileService")
	IFileService fileService;
	
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
	
	
	//fileupload 테스트를 위한 view (get)
	@RequestMapping(value="/mvc/fileupload", method= {RequestMethod.GET})
	public String fileuploadView() {
		return "mvc/fileuploadView";
	}
	
	
	//fileupload (파일전송)을 처리하기 위한 controller method (post)
	@RequestMapping(value="/mvc/fileupload", method= {RequestMethod.POST})
	public String fileupload(@RequestPart("uploadFile") MultipartFile part) {
		
		logger.debug("partSize : {}", part.getSize());
		logger.debug("OriginalFileName : {}", part.getOriginalFilename());
		
		//1. File객체 생성 
		//(경로 + 파일명 ==> 파일명 충돌 방지를 위해 유니크한 임의의 파일명을 생성)
		String path = "C:\\ddit\\A_TeachingMaterial\\6.JspSrpgin\\upload";
		String originalFileName = part.getOriginalFilename();			//	사용자가 업로드한 실제 파일명
		String fileExt = FileUtil.getFileExtension(originalFileName);
		String fileName = UUID.randomUUID().toString() + fileExt;		//	충돌 방지를 위한 임의의 파일명
		File file = new File(path + File.separator + fileName);
		
		FileVo filevo = new FileVo();
		filevo.setFile_name(fileName);
		filevo.setFile_path(path);
		filevo.setOrg_file_name(originalFileName);
		filevo.setFile_ext(fileExt);
		
		try {
			if(part.getSize() > 0) {
				//정해진 path에 업로드 파일을 작성
				part.transferTo(file);
				
				//데이터베이스에 첨부파일 정보 저장
				//1. fileService
				
				//2. 로직 호출
				int insertCnt = fileService.insertFile(filevo);

			}
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
		return "mvc/fileuploadView";
	}
	
}

