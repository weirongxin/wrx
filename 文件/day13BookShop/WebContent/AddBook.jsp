<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addBook.book" method="get">
		书籍名字:<input type="text" name="name"/><br/>
		作者:<input type="text" name="author"/><br/>
		出版时间:<input type="text" name="datetime"/><br/>
		出版社:<input type="text" name="publication"/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>