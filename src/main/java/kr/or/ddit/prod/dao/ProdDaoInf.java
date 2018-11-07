package kr.or.ddit.prod.dao;

import java.util.List;

import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.util.model.PageVo;

public interface ProdDaoInf {
	
	/**
	 * Method : selectProdPageList
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param page
	 * @return
	 * Method 설명 : 제품 페이징 조회
	 */
	public List<ProdVo> selectProdPageList(PageVo pageVo);
	
	
	/**
	 * Method : getProdCnt
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @return
	 * Method 설명 : 제품 전체 건수 조회
	 */
	public int getProdCnt();
	
	
	/**
	 * 
	 * Method : selectProdDetail
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param prodId
	 * @return
	 * Method 설명 : 제품 상세 조회
	 */
	public ProdVo selectProdDetail(String prodId);
	
}

