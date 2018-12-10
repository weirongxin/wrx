package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = -154176561953216931L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		
		String userName = req.getParameter("userName");
		String saveName = req.getParameter("saveName");
		//判断如果已经勾选了记住用户名 则将用户名信息存入cookie中
		if(saveName!=null && saveName.equals("on")){
			//新创建cookie数据对象  参数1为属性名  参数2为属性值
			Cookie c = new Cookie("userName", userName);
			c.setMaxAge(0);
			resp.addCookie(c);
			
		}
		
		req.getRequestDispatcher("CookieFunc1.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
