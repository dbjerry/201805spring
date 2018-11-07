package kr.or.ddit.util.model;

public class PageVo {
	private int page;		//	page 번호
	private int pageSize;	//	한 페이지의 사이즈(몇 명 나올지)

	/* getter & setter */
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	@Override
	public String toString() {
		return "PageVo [page=" + page + ", pageSize=" + pageSize + "]";
	}
	
}

