<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>页面显示三角形星星</title>
</head>
<body>
	<%
		for(int row = 0;row<4;row++){
			for(int clo = 0;clo<=row;clo++){
				%>
					*
				<% 
			}
			%>
				<br/>
			<% 
		}
	
	%>
</body>
</html>