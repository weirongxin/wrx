package bean;

import java.util.List;
public class PageBean <T>{
	private int totalCount;//总记录数
	private int currentPage;//当前查询页数
	
	private int totalPage;//总页数
	private int startPage;//起始页数
	private int endPage;//结束页数
	private List<T> list;//数据列表
	public static final int pageSize = 10;//一页的记录数
	public static final int pageShow = 5;//显示几个页码
	
	//增加模糊查询的条件
	private String customQueryData;
	
	public PageBean() {
		super();
	}
	public PageBean(int totalCount, int currentPage) {
		super();
		this.totalCount = totalCount;
		this.currentPage = currentPage;
		
		//根据总记录数、当前查询页数  
		//计算其他属性
		//1.计算一共有多少页数据
		totalPage = totalCount/pageSize;
		if(totalCount%pageSize!=0){
			totalPage++;
		}
		//2.根据当前查询页数  计算开始页数、结束页数
		if(totalPage<pageShow){
			startPage = 1;
			endPage = totalPage;
		}else{
			startPage = currentPage-pageShow/2;
			endPage = currentPage+pageShow/2;
			//起始页码超范围时计算
			if(startPage<1){
				startPage = 1;
				endPage = startPage+pageShow-1;
			}
			//结束页码超范围时计算
			if(endPage>totalPage){
				endPage = totalPage;
				startPage = endPage-pageShow+1;
			}
		}
	}
	
	public String getCustomQueryData() {
		return customQueryData;
	}
	public void setCustomQueryData(String customQueryData) {
		this.customQueryData = customQueryData;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	
	
}
