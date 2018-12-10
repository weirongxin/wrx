<%@page import="bean.PayData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Step3；订单确认</h2><br/>
	<table border="1px solid black">
		<tr>
			<td>顾客姓名</td>
			<td>
				${payData.userName}
			 </td>
		</tr>
		<tr>
			<td>地址</td>
			<td>${payData.address}</td>
		</tr>
		<tr>
			<td colspan="2">付款信息</td>
		</tr>
		<tr>
			<td>信用卡类型</td>
			<td>${payData.cardType}</td>
		</tr>
		<tr>
			<td>卡号</td>
			<td>${payData.cardNum}</td>
		</tr>
		<tr>
			<td colspan="2">订货项目</td>
		</tr>
		<c:forEach items="${payData.bookName}" var="cell">
			<tr>
				<td></td>
				<td>${cell}</td>
			</tr>
		</c:forEach>
		 
	</table>
	
</body>
</html>