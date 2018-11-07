package kr.or.ddit.prod.dao;

import java.util.List;

import kr.or.ddit.config.db.SqlFactoryBuilder;
import kr.or.ddit.prod.model.ProdVo;
import kr.or.ddit.util.model.PageVo;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

@Repository(value="prodDao")
public class ProdDao implements ProdDaoInf {

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
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		
		List<ProdVo> prodList = session.selectList("prod.selectProdPageList", pageVo);
		
		session.close();
		
		return prodList;
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
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		
		int totalProdCnt = session.selectOne("prod.getProdCnt");
		
		session.close();
		
		return totalProdCnt;
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
		SqlSessionFactory factory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = factory.openSession();
		
		ProdVo selectProd = session.selectOne("prod.selectProdDetail", prodId);
		
		session.close();
		
		return selectProd;
	}

}

