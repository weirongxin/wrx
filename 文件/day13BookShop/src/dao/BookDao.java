package dao;

import java.util.List;

import bean.Book;

public interface BookDao {
	//按页查询 书籍集合
	public abstract List<Book> queryByPage(int page,int pageSize,String bookName);
	//增加图书
	public abstract void insertBook(Book book);
	//删除图书
	public abstract void delBook(Book book);
	//查询书籍的数量
	public abstract int queryBookSum(String bookName);
	//查询参数书名是否存在
	public abstract boolean queryBookByName(String name);

}
