<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jstl动态创建表格</title>
</head>
<body>
	<%  
		ArrayList<String> stus = new ArrayList<String>();
		stus.add("name1");
		stus.add("name2");
		stus.add("name3");
		stus.add("name4");
		
		request.setAttribute("stusKey", stus);
	%>
	
	<c:if test="${requestScope.stusKey.size()>0}">
		<table>
			<c:forEach begin="0" end="${stusKey.size()}" 
							items="${stusKey}" var="cell">
				<tr>
					<td>${cell}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	
</body>
</html>