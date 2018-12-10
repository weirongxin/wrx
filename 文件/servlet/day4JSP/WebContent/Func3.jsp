<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>动态创建表格</title>
<script type="text/javascript" src="jq/jquery-2.1.1.js" ></script>
<script>
	$(function(){
		$("tr:odd").css("background-color","red");
		$("tr:even").css("background-color","blue");
		$("td").css("width","200px");
	});
</script>
</head>
<body>
	<%! int rows = 5; %>
	<table>
		<% for(int i=0;i<rows;i++){
			%>
			<tr>
				<td><%=i+1%></td>
			</tr>
			<%
		}%>
	</table>
</body>
</html>