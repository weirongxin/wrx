<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp 声明、功能</title>
</head>
<body>
	<%--  1.声明：js中变量、方法的实现 都需要在声明块中进行声明 ，
		      	声明块 可以出现多对
		  		 声明块 中可以声明多个数据--%>
	<%! int num = 10; %>
	<%! int count = 100;
		public void func(int a){
			System.out.println(a);
		}
	%>
	<%--  2.功能：	在功能区  进行变量的获取、方法调用 --%>
	<%  
		System.out.println(num);
		func(count);
	%>
	<%-- 3.表达式     等于号后的内容可以在页面直接输出 --%>
	 
	<%=num %>
	 
	<!-- 
	<div>div0</div>
	 -->
</body>
</html>