<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	从web应用上下文对象中获取 application域的参数值：<br/>
	<%=pageContext.getAttribute("contextName",
				PageContext.APPLICATION_SCOPE)
	%>
	
	<!-- this对象  指代当前servlet对象-->
	<%=page.getClass().toString() %>
	<br/>
	<!-- out对象 指代PrintWriter对象 -->
	<%  out.write("out对象输出数据"); %>
</body>
</html>