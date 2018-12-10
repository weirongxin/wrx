package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.PayData;

/**
 * Servlet implementation class PageServlet
 */
@WebServlet("/PageServlet")
public class PageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		String[] books = request.getParameterValues("book");
		
		//获取session
		HttpSession session = request.getSession();
		//判断session中的购买记录对象是否为空
		PayData payData = (PayData)session.getAttribute("payData");
		if(payData == null){
			payData = new PayData();
		}
		//1.将所选中的数据信息存入 对象的属性中
		payData.setBookName(books);
		session.setAttribute("payData", payData);
		
		request.getRequestDispatcher("Page2.jsp").forward(request, response);
		
		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
