package service;

import java.util.List;

import bean.Book;
import dao.BookDao;
import dao.BookDaoImpl;

public class BookService {
	BookDao dao = new BookDaoImpl();
	
	//以书籍名字的模糊查询做分页
	public List<Book> queryByPageAndName(int page,int pageSize,String bookName){
		return dao.queryByPage(page, pageSize, bookName);
	}
	//以模糊查询搜索书籍的数量
	public int queryByNameCount(String bookName){
		return dao.queryBookSum(bookName);
	}
	
	//按页查询 书籍集合
	public List<Book> queryByPage(int page,int pageSize){
		return dao.queryByPage(page, pageSize,null);
	}

	// 增加图书
	public void addBook(Book book) {
		dao.insertBook(book);
	}

	// 删除图书
	public void delBook(Book book) {
		dao.delBook(book);
	}

	// 查询书籍的数量
	public int queryBookSum() {
		return dao.queryBookSum(null);
	}

	// 查询参数书名是否存在
	public boolean queryBookByName(String name) {
		return dao.queryBookByName(name);
	}
		
}
