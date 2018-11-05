package kr.or.ddit.file.service;

import kr.or.ddit.file.model.FileVo;

public interface IFileService {

	/**
	* Method : insertFile
	* 작성자 : jerry
	* 변경이력 :
	* @param filevo
	* @return
	* Method 설명 : 파일 정보 저장
	*/
	int insertFile(FileVo filevo);
	
}

