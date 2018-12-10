package com.qiancheng.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qiancheng.bean.User;

import net.sf.json.JSONArray;
 
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		if(name.equals("xiaoming")&&pass.equals("123456")){
			ArrayList<User> users = new ArrayList<User>();
			users.add(new User("小明1", "18", "F"));
			users.add(new User("小明2", "28", "F"));
			users.add(new User("小明3", "38", "M"));
			users.add(new User("小明4", "48", "F"));
			
			String userStr =  JSONArray.fromObject(users).toString();
			response.getWriter().write(userStr);
		}else{
			response.getWriter().write("登录失败");
		}
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
