package service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.UserController;
import entity.User;

public class UserService extends HttpServlet {
	private static final long serialVersionUID = -7871118767651385673L;
	UserController userCon = new UserController();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//根据请求request对象 设置编码
		req.setCharacterEncoding("UTF-8");
		//从请求对象中获取用户名参数
		String userName = req.getParameter("username");
		//从数据库中请求数据
		User user = userCon.queryUser(userName);
		//判断如果用户为空 则输出失败、否则输出成功
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		
		PrintWriter pw = resp.getWriter();
		if(user==null){
			pw.write("不存在该用户");
		}else{
			pw.write("登录成功，用户存在");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
