package kr.or.ddit.file.util;

public class FileUtil {
	
	//FileUtil.getFileExt(String fileName);
	//확장자가 있을 경우 .을 포함한 확장자 값을 리턴
	//확장자가 없을 경우 "" whitespace를 리턴
	// 테스트값 : sally.png ==> .png
	// 테스트값 : sally ==> ""
	//getFileExtension(originalFileName);
	
	/**
	* Method : getFileExtension
	* 작성자 : 김지태
	* 변경이력 :
	* @param originalFileName
	* @return
	* Method 설명 : . + 확장자명 구하는 메서드
	*/
	public static String getFileExtension(String originalFileName) {
		
		int i = originalFileName.lastIndexOf('.');
		
		if(i > 0) {
			String FileExtension = originalFileName.substring(i);
			return FileExtension;
			
		} else {
			return "";
			
		}
	}
}

