package kr.or.ddit.file.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import kr.or.ddit.config.db.SqlFactoryBuilder;
import kr.or.ddit.file.model.FileVo;

//spring bean으로 등록 : 
//@Repository(이름을 안붙이면 class명에서 앞글자만 소문자로 변경되어 spring bean이름으로 사용)
@Repository	//(name={fileDao})
public class FileDao implements IFileDao{
	private SqlSessionFactory sessionFactory;
	
	public FileDao(){
		sessionFactory = SqlFactoryBuilder.getSqlSessionFactory();
	}
	
	/**
	* Method : insertFile
	* 작성자 : jerry
	* 변경이력 :
	* @param filevo
	* @return
	* Method 설명 : 파일 정보 저장
	*/
	@Override
	public int insertFile(FileVo filevo) {
		SqlSession session = sessionFactory.openSession();
		
		//sql 호출
		int insertCnt = session.insert("file.insertFile", filevo);
		
		//트랜잭션 commit, session close
		session.commit();
		session.close();
		
		return insertCnt;
	}
	
}

