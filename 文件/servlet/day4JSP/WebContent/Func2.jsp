<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>循环遍历1-10页面输出</title>
</head>
<body>
	<%! int num = 10; %>
	<%-- 在功能代码区间 添加for循环，
		  每循环一次打印操作需要在静态页面实现.
		 所以：for循环代码被<%%>分割成了两部分jsp，打印输出表达式在静态页面部分--%>
	<%
		for(int i=0;i<num;i++){
 	%> 
		<%=i+1%> <br/>	 
	<% 
		}
	%>
</body>
</html>