package kr.or.ddit.prod.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.util.model.PageVo;

@Repository(value="prodDao")
public class ProdDao implements ProdDaoInf {

	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate template;
	
	/**
	 * Method : selectProdPageList
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param page
	 * @return
	 * Method 설명 : 제품 페이징 조회
	 */
	@Override
	public List<ProdVo> selectProdPageList(PageVo pageVo) {
		
		return template.selectList("prod.selectProdPageList", pageVo);
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

		return template.selectOne("prod.getProdCnt");
	}

	/**
	 * Method : selectProdDetail
	 * 작성자 : 김지태
	 * 변경이력 :
	 * @param prodId
	 * @return
	 * Method 설명 : 제품 상세 조회
	 */
	@Override
	public ProdVo selectProdDetail(String prodId) {

		return template.selectOne("prod.selectProdDetail", prodId);
	}

}

