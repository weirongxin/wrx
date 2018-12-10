<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- JSTL 表达式  
	  1. c:out  在页面上输出  --%>
	<c:out value="xiaoming"></c:out>
	
	<%--  2.c:set 设置变量：存在则重新赋值，不存在则创建 --%>
	<c:set var="gender" value="F" ></c:set>
	
	<c:out value="${gender}"></c:out>
	
	<%--3 c:remove  将设置的变量删除移除--%>
	<c:remove var="gender"/>
	性别：${gender}
	
	<%--4  分支语句  c:if --%>
	<c:set var="score" value="80"></c:set>
	
	<c:if test="${score<0}">
		符合条件
	</c:if>
	
	
	<%
		ArrayList<String> lists = new ArrayList<String>();
		lists.add("xiaoming");
		lists.add("xiaowang");
		lists.add("xiaohong");
		request.setAttribute("data", lists);
	%>
	<%--5 遍历   begin:开始下标 
			 end:结束下标 
			 items:需要被遍历的数据
			 var:遍历元素 --%>
	<c:forEach begin="0" end="2" items="${data}" var="cell">
		每个元素数据：  ${cell}
	</c:forEach>
	
	<%--6  定义url变量 --%>
	<c:url var="baidu" value="http://www.baidu.com"></c:url>
	<a href="${baidu}">百度</a>
	
	<%--7  重定向  直接执行重定向功能 --%>
	<c:redirect url="http://www.baidu.com"></c:redirect>
</body>
</html>