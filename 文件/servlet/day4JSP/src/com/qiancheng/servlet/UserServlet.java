package com.qiancheng.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = -7829383273792391939L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 req.setCharacterEncoding("UTF-8");
		 resp.setContentType("text/html");
		 resp.setCharacterEncoding("UTF-8");
		 //往请求对象中赋属性值
		 req.setAttribute("message", "小明登录成功！");
		 //设置 转发的位置
		 RequestDispatcher rd = req.getRequestDispatcher("Func5-内置对象.jsp");
		 //转发
		 rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
