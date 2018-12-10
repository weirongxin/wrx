package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Student;

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 7846483077033842270L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 req.setCharacterEncoding("UTF-8");
		 resp.setContentType("text/html");
		 resp.setCharacterEncoding("UTF-8");
		 
		 ArrayList<Student> stus = new ArrayList<Student>();
		 stus.add(new Student("小明", "F", 90));
		 stus.add(new Student("小红", "F", 80));
		 stus.add(new Student("小白", "M", 78));
		 stus.add(new Student("小黑", "F", 30));
		 //将集合数据添加到请求对象中
		 req.setAttribute("studentData", stus);
		 //转发 同一个request对象 
		 req.getRequestDispatcher("JSTL/Func3.jsp").forward(req, resp);
		 //重定向
		 //resp.sendRedirect(req.getContextPath()+"JSTL/Func3.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
