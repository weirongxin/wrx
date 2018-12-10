<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 当前页面为错误处理页面   在上方添加配置信息：
		errorPage="true"  -->
	报错啦！！！
	<!-- 根据上下文对象，获取异常对象，再次 获取 异常信息 -->
	<%= pageContext.getException().getMessage()%>
</body>
</html>