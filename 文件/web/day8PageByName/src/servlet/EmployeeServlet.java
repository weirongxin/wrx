package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Employee;
import bean.PageBean;
import service.EmployeeService;

/**
 @WebServlet ： 注解
  标识当前设置servlet的url的配置功能
  在注解后 配置url，则可以不在web.xml文件中配置
  (注解和web.xml文件    以xml为准)
 */
//@WebServlet("/EmployeeServlet")
@WebServlet(name="emp",urlPatterns="/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EmployeeService service = new EmployeeService();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//根据用户请求的页数，从dao层将员工列表取到
		//根据总记录数、当前查询页数、查询列表数据，生成pageBean在前端显示
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		//1.当前请求的页数
		int queryPage 
			= Integer.valueOf(request.getParameter("pageNum"));
		//判断是否存在模糊查询条件
		String searchName = request.getParameter("searchName");
		//将请求过来的查询用户名 条件 增加属性设定，给前端页面使用
		request.setAttribute("searchName", searchName);
		
		//2.取一共有多少条数据
		int sumCount = 0;
		if(searchName==null){
			//非条件查询
			sumCount = service.queryEmployeeSum();
		}else{
			//条件查询
			sumCount = service.queryCountByName(searchName);
		}
		 
		//3.创建PageBean对象 （构造方法中需要两个参数：数据总行数、请求的页数）
		PageBean<Employee> bean 
			= new PageBean<Employee>(sumCount, queryPage);
		//4.根据请求的页数 从 service层获取，当前页对应的数据结果集
		List<Employee> list =null;
		if(searchName==null){
			//非条件查询
			list 
			= service.queryByPage(bean.getCurrentPage(), PageBean.pageSize);
		}else{
			//条件查询
			list 
			= service.queryByNameByPage(bean.getCurrentPage(), PageBean.pageSize,searchName);
		}
		
		
		bean.setList(list);
		request.setAttribute("empData", bean);
		request.getRequestDispatcher("EmployeeList.jsp").forward(request, response);		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
