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
	<c:if test="${studentData.size()>0}">
		<table>
				<tr>
					<td>姓名</td>
					<td>性别</td>
					<td>成绩</td>
				</tr>
			<c:forEach begin="0" end="${studentData.size()-1}"
				 items="${studentData}" var="cell">
				<tr>
					<td>${cell.name}</td>
					<td>${cell.gender}</td>
					<td>${cell.score}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>