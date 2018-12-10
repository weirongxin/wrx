<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Func5  欢迎来到5页面
	<%=request.getAttribute("message") %>
	
	<br/>
	通过web应用上下文对象 获取request对象
	<%=pageContext.getRequest().getAttribute("message") %><br/>
	<%=pageContext.getResponse() %><br/>
	<%=pageContext.getSession() %><br/>
	<%=pageContext.getPage() %><br/>
	<%=pageContext.getOut() %><br/>
	<%=pageContext.getException() %><br/>
	<%=pageContext.getServletConfig() %><br/>
	<%=pageContext.getServletContext()%><br/>
	
	<!--通过 pageContext 添加参数，页面跳转、请求时可以进行参数传递
		setAttribute方法：param1 参数名
						param2 值
						param3 赋值的作用域
		pageContext的作用域：APPLICATION_SCOPE  “web应用的区域内都可以获取”
						  PAGE_SCOPE  “当前servlet可以获取”
						  REQUEST_SCOPE  "同一个request对象作用域能够获取"
						  SESSION_SCOPE  “同一个session作用域能够获取”
		scope：作用域的顺序 application、session、request、page
						 -->
	<% pageContext.setAttribute("contextName", 
			"xiaohong", PageContext.APPLICATION_SCOPE); %>
	
	<!-- 添加 a 链接标签，跳转到下一个页面  
		在下一个页面中获取存储的"contextName"参数的值 -->
	<a href="Func6-内置对象.jsp">下一个页面</a>
	
</body>
</html>