package kr.or.ddit.file.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.or.ddit.file.dao.IFileDao;
import kr.or.ddit.file.model.FileVo;

@Service
public class FileService implements IFileService{

	@Resource(name="fileDao")
	IFileDao fileDao;
	
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
		int insertCnt = fileDao.insertFile(filevo);
		return insertCnt;
	}

}

