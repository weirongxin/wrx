package dao;

import java.sql.*;
import java.util.*;

import bean.Book;
import common.DBUtil;

public class BookDaoImpl extends DaoImpl implements BookDao {

	/**
	 * 按页查询书籍列表
	 */
	@Override
	public List<Book> queryByPage(int page, int pageSize,String bookName) {
		List<Book> books = new ArrayList<Book>();
		String sql;
		if(bookName==null){
			sql = "select id,name,author,datetime,publication "
					+"from (select rownum r,id,name,author,datetime,publication,function "
							+" from(select id,name,author,datetime,publication,function "
									+ "from book where function <> '1')"
					+")where r>=? and r<=?";
		}else{
			sql = "select id,name,author,datetime,publication "
					+"from (select rownum r,id,name,author,datetime,publication,function "
							+" from(select id,name,author,datetime,publication,function "
									+ "from book where function <> '1' and name like ?)"
					+")where r>=? and r<=?";
		}
		
		//计算起始行号、结束行号
		int startRow = (page-1)*pageSize+1;
		int endRow =startRow+pageSize-1;
		if(bookName==null){
			books = query(sql, Book.class, startRow,endRow);
		}else{
			books = query(sql, Book.class, "%"+bookName+"%",startRow,endRow);
		}
		return books;
	}

	/**
	 * 往数据库插入一本新书
	 */
	@Override
	public void insertBook(Book book) {
		String sql = "insert into book( id,name,author,datetime,publication) "
				+ "values(book_seq.nextval,?,?,?,?)";
		update(sql, book.getName(),book.getAuthor(),
				book.getDatetime(),book.getPublication());
	}
	/**
	 * 删除指定的书籍
	 * 根据图书的id 逻辑删除（将删除状态字段变更为1）
	 */
	@Override
	public void delBook(Book book) {
		String sql = "update book set function=1 where id = ?";
		update(sql, book.getId());
	}
	/**
	 * 查询图书的总数量
	 */
	@Override
	public int queryBookSum(String bookName) {
		String sql = "select count(id) from book";
		if(bookName!=null){
			sql = sql+" where name like ?";
		}
		Connection con = DBUtil.getConn();
		int count = 0;
		try {
			ResultSet rs;
			if(bookName!=null){
				PreparedStatement st = con.prepareStatement(sql);
				st.setObject(1, "%"+bookName+"%");
				rs = st.executeQuery();
			}else{
				Statement st = con.createStatement();
				rs = st.executeQuery(sql);
			}
			while(rs.next()){
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConn(con);
		}
		return count;
	}

	/**
	 * 根据书名查询该书是否存在
	 */
	@Override
	public boolean queryBookByName(String name) {
		String sql = "select count(id) from book where name=?";
		Connection con = DBUtil.getConn();
		boolean exit = false;
		try {
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()){
				int count = rs.getInt(1);
				if(count>0){
					exit = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.closeConn(con);
		}
		return exit;
	}

}
