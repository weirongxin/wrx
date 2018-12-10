<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<%
		request.setAttribute("username", "xiaoming");
		request.removeAttribute("username");
		
		session.setAttribute("age", 11);
		session.removeAttribute("age");
		
		request.getServletContext().setAttribute("gender", "F");
		request.getServletContext().removeAttribute("gender");
	%>

	网站的访问量：<%=session.getAttribute("count") %>
</body>
</html>