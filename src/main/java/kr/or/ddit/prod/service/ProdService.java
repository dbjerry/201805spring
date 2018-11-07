package kr.or.ddit.prod.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.ddit.prod.dao.ProdDaoInf;
import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.util.model.PageVo;

@Service
public class ProdService implements ProdServiceInf{

	@Resource(name="prodDao")
	ProdDaoInf dao;
	
	/**
	 * Method : selectProdPageList
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param page
	 * @return
	 * Method 설명 : 제품 페이징 조회
	 */
	@Override
	public Map<String, Object> selectProdPageList(PageVo pageVo) {
		
		List<ProdVo> prodList = dao.selectProdPageList(pageVo);
		
		int totalProdCnt = dao.getProdCnt();
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("prodList", prodList);
		resultMap.put("prodCnt", 
				(int)Math.ceil((double)totalProdCnt / pageVo.getPageSize()));

		return resultMap;
	}

	/**
	 * Method : getProdCnt
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @return
	 * Method 설명 : 제품 전체 건수 조회
	 */
	@Override
	public int getProdCnt() {
		return dao.getProdCnt();
	}

	/**
	 * 
	 * Method : selectProdDetail
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param prodId
	 * @return
	 * Method 설명 : 제품 상세 조회
	 */
	@Override
	public ProdVo selectProdDetail(String prodId) {
		return dao.selectProdDetail(prodId);
	}
	
}

