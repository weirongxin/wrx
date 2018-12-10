<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//从request请求中获取cookies数组
		Cookie[] cookies = request.getCookies();
		if(cookies==null||cookies.length==0){
			out.write("没有取到cookie数据" + "<br/>");
		}else{
			//遍历得 到的cookie数组   
			for(Cookie coo : cookies){
				//在页面输出 每个cookie的name和value值
				String cooName = coo.getName();
				String cooValue = coo.getValue();
				out.write("cookie的name:" +cooName + "<br/>");
				out.write("cookie的value:" +cooValue + "<br/>");
				//判断 当前遍历到的这个cookie对象是否为存储用户名数据
				if(cooName.equals("userName")){
					//将用户名数据  存入request对象中，给标签的value属性赋值
					request.setAttribute("saveName", cooValue);
				}
			}
		}
		
	%>
	
	<form action="user.login" method="post">
						<!-- 通过EL表达式 给标签的value赋值          -->
		用户名：<input type="text" name="userName" value="${saveName}"/><br/>
		密码:<input type="password" name="usePass"/><br/>
		记住用户名:<input type="checkbox" name="saveName"/>
		<input type="submit" value="登录"/>
	</form>
</body>
</html>