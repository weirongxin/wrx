package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Book;
import bean.PageBean;
import net.sf.json.JSONObject;
import service.BookService;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet(name="BookServlet",urlPatterns="*.book")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//获取书籍业务层对象
    public BookService service = new BookService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取请求的地址  "BookShop/queryByPage.book"
		String requestURI = request.getRequestURI();
		String[] data1 = requestURI.split("/");
		String[] data2 = data1[data1.length - 1].split("\\.");
		String questName = data2[0];
		
		switch (questName) {
		case "queryByPage":
			queryByPage(request, response);
			break;
		case "deleteBook":
			deleteBook(request, response);
			break;
		case "addBook":
			addBook(request, response);
			break;
		case "queryByPageAndName":
			queryByPageAndName(request, response);
			break;
		}
	}
	/**
	 * 按照模糊查询条件  分页请求书籍信息
	 */
	protected void queryByPageAndName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookName = request.getParameter("bookName");
		int pageNum = Integer.valueOf(request.getParameter("pageNum"));
		int sum = service.queryByNameCount(bookName);
		//实例化pagebean对象
		PageBean<Book> bean = new PageBean<Book>(sum, pageNum);
		//CustomQueryData中存储 模糊查询的关键字条件
		bean.setCustomQueryData(bookName);
		// 按照页数从业务层获取当页的书籍集合
		List<Book> books = service.queryByPageAndName(pageNum, PageBean.pageSize,bookName);
		bean.setList(books);

		// 将bean对象转换为json格式字符串
		String beanStr = JSONObject.fromObject(bean).toString();
		// 响应回客户端
		response.getWriter().write(beanStr);
	}
	/**
	 * 根据页数查询数据列表
	 */
	protected void queryByPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取当前查询的页数
		int pageNum = Integer.valueOf(request.getParameter("pageNum"));
		//获取总记录数
		int sum = service.queryBookSum();
		//实例化pagebean对象
		PageBean<Book> bean = new PageBean<Book>(sum, pageNum);
		//按照页数从业务层获取当页的书籍集合
		List<Book> books = service.queryByPage(pageNum, PageBean.pageSize);
		bean.setList(books);
		//CustomQueryData中存储 模糊查询的关键字条件
		//(非模糊查询时清空)
		bean.setCustomQueryData(null);
		
		//将bean对象转换为json格式字符串
		String beanStr =  JSONObject.fromObject(bean).toString();
		//响应回客户端
		response.getWriter().write(beanStr);
		
	}
	/**
	 * 删除书籍
	 */
	protected void deleteBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取删除的书籍id
		String bookID = request.getParameter("delBookId");
		service.delBook(new Book(bookID, null, null, null, null));
		response.getWriter().write("删除成功");
	}
	/**
	 * 添加书籍
	 */
	protected void addBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookName = request.getParameter("name");
		String author = request.getParameter("author");
		String time = request.getParameter("datetime");
		String publisher = request.getParameter("publication");
		Book book = new Book(null, bookName, author, time, publisher);
		service.addBook(book);
		//添加书籍完成后，重定向到书籍列表页面
		response.sendRedirect(request.getContextPath()+"/BookList.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
