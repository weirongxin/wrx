<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Step2:请输入寄送地址与信用卡信息</h2><br/>
	<form action="UserServlet" method="post">
		<table>
			<tr>
				<td colspan="2">基本信息</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="username"/></td>
			</tr>
			<tr>
				<td>寄送地址</td>
				<td><input type="text" name="address"/></td>
			</tr>
			<tr>
				<td colspan="2">信用卡信息</td>
			</tr>
			<tr>
				<td rowspan="2">种类</td>
				<td>visa<input type="radio" name="cardType" value="visa"/><br/>
					Master<input type="radio" name="cardType" value="Master"/>  
				</td>
			</tr>
			<tr>
				<td>卡号</td>
				<td><input type="text" name="cardNum"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="继续"/></td>
			</tr>
		</table>
	</form>
</body>
</html>