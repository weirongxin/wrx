<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Step1:选择要购买的书籍</h2><br/>
	<form action="PageServlet" method="post">
		<table border="1px solid black">
			<tr>
				<td>书籍</td>
				<td>购买</td>
			</tr>
			<tr>
				<td>java</td>
				<td><input type="checkbox" value="java" name="book"/></td>
			</tr>
			<tr>
				<td>Oracle</td>
				<td><input type="checkbox" value="oracle" name="book"/></td>
			</tr>
			<tr>
				<td>Struts</td>
				<td><input type="checkbox" value="struct" name="book"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="继续"/></td>
			</tr>
	</table>
	</form>
	
</body>
</html>