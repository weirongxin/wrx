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
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		
		String name = request.getParameter("username");
		String address = request.getParameter("address");
		String cardType = request.getParameter("cardType");
		String cardNum = request.getParameter("cardNum");

		HttpSession session = request.getSession();
		//判断session中的购买记录对象是否为空
		PayData payData = (PayData)session.getAttribute("payData");
		if(payData == null){
			System.out.println("page2 数据为null");
			payData = new PayData();
		}
		session.setAttribute("payData", payData);

		payData.setUserName(name);
		payData.setAddress(address);
		payData.setCardType(cardType);
		payData.setCardNum(cardNum);
		
		request.getRequestDispatcher("Page3.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
