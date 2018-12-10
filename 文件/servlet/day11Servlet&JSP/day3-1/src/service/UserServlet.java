package service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.UserCon;
import entity.User;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 3165093994456922674L;
	UserCon usercon = new UserCon();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//先设置请求和响应的编码格式
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		
		//获取请求的uri数据
		String reqURI = req.getRequestURI();
		//先以/拆分
		String[] uris1 = reqURI.split("/");
		//再以.拆分
		String[] uris2 = uris1[uris1.length-1].split("\\.");
		String reqName = uris2[0];
		if(reqName.equals("register")){
			register(req, resp);
		}else if(reqName.equals("login")){
			
		}
	}
	public void register(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException{
		// req.getParameter从请求对象中，根据标签的name属性值 获取标签的value值
		String userName = req.getParameter("username");
		String userPass = req.getParameter("userpass");
		String tel = req.getParameter("tel");
		String gender = req.getParameter("gender");
		// 获取页面上多选标签的数据
		String[] likeValues = req.getParameterValues("like");
		StringBuffer likeBuffer = new StringBuffer();
		for (String cell : likeValues) {
			likeBuffer.append(cell);
			likeBuffer.append(",");
		}
		String like = likeBuffer.toString();

		// 根据获取的数据 实例化User对象
		User user = new User(null, userName, userPass, gender, tel, like);
		// 调用controller增加用户，根据返回值 判断新增用户的状态
		boolean status = usercon.addUser(user);
//		PrintWriter pw = resp.getWriter();
		// 新增用户 打印
		if (!status) {
//			pw.write("新用户添加成功");
			String webName = req.getContextPath();
			resp.sendRedirect(webName+"/Login.html");
		} else {
//			pw.write("该用户名已经存在");
			//从请求对象中获取转发对象
//			RequestDispatcher rd = req.getRequestDispatcher("Failed.html");
			RequestDispatcher rd = req.getRequestDispatcher("forwardServlet");
			//在request对象中添加message属性
			req.setAttribute("message", "用户名已经存在了！！！！！");
			
			rd.forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	
}
