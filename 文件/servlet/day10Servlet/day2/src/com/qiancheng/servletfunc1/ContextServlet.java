package com.qiancheng.servletfunc1;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextServlet extends HttpServlet {
	private static final long serialVersionUID = -339899046727451628L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1)取web应用的配置信息
		//1.先获取servletContext（可以直接获取该对象）  web应用的全局对象 
		ServletContext context = getServletContext();
		//2.根据参数名 获取当前web应用的配置数据
		String value = context.getInitParameter("username");
		//3.从响应对象中获取 输出流对象
		PrintWriter pw = resp.getWriter();
		//4.调用输出流对象的写方法 写数据到页面
		pw.write(value);
		
		//2)获取文件的真实路径（web应用发布后的路径）
		String path = context.getRealPath("test.txt");
		System.out.println(path);
		
		//3)获取文件中的数据流
		//根据web应用对象，获取加载类对象
		ClassLoader loader = context.getClassLoader();
		//从加载类中 读取文件流对象
		InputStream in = loader.getResourceAsStream("db.properties");
		//创建properties文件对象
		Properties pro = new Properties();
		//使文件对象加载流
		pro.load(in);
		//从properties中获取数据：
		String getNameData = pro.getProperty("username");
		System.out.println(getNameData);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
