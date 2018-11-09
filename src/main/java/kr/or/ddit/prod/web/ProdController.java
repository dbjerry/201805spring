package kr.or.ddit.prod.web;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.prod.service.ProdServiceInf;
import kr.or.ddit.util.model.PageVo;

@RequestMapping("/prod")
@Controller
public class ProdController {

	@Resource(name="prodService")
	private ProdServiceInf prodService;
	
	private Logger logger = LoggerFactory.getLogger(ProdController.class);
	
	
	@RequestMapping("/prodPageList")
	public String prodPageList(PageVo pageVo, Model model) {
		logger.debug("pageVo : {}", pageVo);
		
		//Map<String, Object> resultMap = prodService.selectProdPageList(pageVo);
		
		/* 
		 * request.setAttribute("prodList", prodList);
		 * request.setAttribute("pageCnt", pageCnt);
		 */
		//model.addAllAttributes(resultMap);
		
		/*
		 * RequestDispatcher rd = request.getRequestDispatcher("/prod/prodPageList.jsp");
		 * rd.forward(request, response);
		 */
		return "prod/prodPageList";
	}
	
	
	@RequestMapping("/prodPageListAjax")
	public String prodPageListAjax(PageVo pageVo, Model model) {
		logger.debug("pageVo : {}", pageVo);
		
		Map<String, Object> resultMap = prodService.selectProdPageList(pageVo);
		
		model.addAllAttributes(resultMap);
		
		return "jsonView";
	}
	
	
	@RequestMapping("/prodPageListHtml")
	public String prodPageListAjaxHtml(PageVo pageVo, Model model) {
		logger.debug("pageVo : {}", pageVo);
		
		Map<String, Object> resultMap = prodService.selectProdPageList(pageVo);
		
		model.addAllAttributes(resultMap);
		
		return "prod/prodPageListHtml";
	}
	
	
	@RequestMapping("/prodPagenationHtml")
	public String prodPagenationHtml(PageVo pageVo, Model model) {
		logger.debug("pageVo : {}", pageVo);
		
		Map<String, Object> resultMap = prodService.selectProdPageList(pageVo);
		
		model.addAllAttributes(resultMap);
		
		return "prod/pagenationHtml";
	}
	
	
	@RequestMapping("prodDetail")
	public String prodDetail(@RequestParam("prod_id")String prodId, 
								ProdVo prodVo, Model model) {
		
		prodVo = prodService.selectProdDetail(prodId);
		
		model.addAttribute("prodVo", prodVo);
		
		return "prod/prodDetail";
	}
	
}

