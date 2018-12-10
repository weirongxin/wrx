package com.qiancheng.servletfunc1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomServlet extends HttpServlet {
	private static final long serialVersionUID = 6643821190762660490L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet...");
		
//		String userName = req.getParameter("username");
//		String pass = req.getParameter("userpass");
		
		//解决方案1：先以ISO-8859-1解码  再以UTF-8编码
		//编码、解码 需要两个类 ,分别解码、编码
//		userName = URLEncoder.encode(userName, "ISO-8859-1");
//		userName = URLDecoder.decode(userName, "UTF-8");
		//解决方案2：将数据使用String的构造方法再次编解码
//		String newName = new String(userName.getBytes("ISO-8859-1"), "UTF-8");
//		System.out.println(newName);
		//解决方案3：请求request对象设置编码格式
		req.setCharacterEncoding("UTF-8");
		String userName = req.getParameter("username");
		System.out.println(userName);
//		System.out.println(userName+pass);
		
		
		/*
		//将数据输出到页面
		//输出数据前，对response设定编码格式
		//1)设置响应的文本类型
		resp.setContentType("text/html");
		//2)设置响应的数据为UTF-8编码
		resp.setCharacterEncoding("UTF-8");
		
		//从response响应对象中 获取输出writer对象
		PrintWriter pw = resp.getWriter();
		//页面写数据
		pw.write("hello world你好Java");
		*/
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 doGet(req, resp);
	}
	
	
}
