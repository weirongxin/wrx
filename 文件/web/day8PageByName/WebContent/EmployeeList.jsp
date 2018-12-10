<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-2.1.1.js" ></script>

<script type="text/javascript">
	function searchEmp(){
		//用户录入搜索的用户名
		var searchValue = $("#searchInput").val();
		//根据参数 拼接请求串
		var questStr = "EmployeeServlet?pageNum=1&searchName="+searchValue;
		//设定请求
		location.href = questStr;
	}
</script>
</head>
<body>
	<input id="searchInput" type="text" placeholder="请输入员工的名字"/>
	<input type="button" value="搜索" onclick="searchEmp()"/><br/>
	

	<!-- 当前页的员工列表数据 从bean中获取list属性 ${empData.list}-->
	<!--  判断 员工列表集合是否为空，为空则页面不显示，不为空 显示员工分页数据-->
	<c:if test="${empData.list!=null}">
		<table border="1px solid black">
				<tr>
					<td>员工编号</td>
					<td>员工名字</td>
					<td>邮箱地址</td>
				</tr>
				<!-- 遍历员工结果集中的数据   每个元素存入cell中 -->
			<c:forEach items="${empData.list}" var="cell">
				<tr>
					<!-- 每个元素的属性 在td中显示 -->
					<td>${cell.employee_id}</td>
					<td>${cell.last_name}</td>
					<td>${cell.email}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	共${empData.totalCount}位员工，共 ${empData.totalPage}页<br/>
	<!-- 首页 为可点击 跳转第一页 -->
	<c:if test="${searchName!=null}">
		<a href="EmployeeServlet?pageNum=1&searchName=${searchName}">首页</a>
	</c:if>
	<c:if test="${searchName==null}">
		<a href="EmployeeServlet?pageNum=1">首页</a>
	</c:if>
	
	<!-- 如果当前页为第一页 则不显示"上一页" -->
	<c:if test="${empData.currentPage!=1}">
		<c:if test="${searchName!=null}">
			<a href="EmployeeServlet?pageNum=${empData.currentPage-1}&searchName=${searchName}">上一页</a>
		</c:if>
		<c:if test="${searchName==null}">
			<a href="EmployeeServlet?pageNum=${empData.currentPage-1}">上一页</a>
		</c:if>
	</c:if>
	<!-- 遍历页数   从开始到结束页  当前页不使用a标签 -->
	<c:forEach begin="${empData.startPage}" end="${empData.endPage}" var="i">
		<c:if test="${empData.currentPage == i}">
			${i}
		</c:if>
		<c:if test="${empData.currentPage != i}">
			<c:if test="${searchName!=null}">	
				<a href="EmployeeServlet?pageNum=${i}&searchName=${searchName}">${i}</a>
			</c:if>
			<c:if test="${searchName==null}">
				<a href="EmployeeServlet?pageNum=${i}">${i}</a>
			</c:if>
			
		</c:if>
	</c:forEach>
	<!-- 如果是最后一页则不显示"下一页" -->
	<c:if test="${empData.currentPage!=empData.endPage}">
		<c:if test="${searchName!=null}">	
			<a href="EmployeeServlet?pageNum=${empData.currentPage+1}&searchName=${searchName}">下一页</a>
		</c:if>
		<c:if test="${searchName==null}">	
			<a href="EmployeeServlet?pageNum=${empData.currentPage+1}">下一页</a>
		</c:if>
	</c:if>
	<c:if test="${searchName!=null}">	
		<a href="EmployeeServlet?pageNum=${empData.endPage}&searchName=${searchName}">尾页</a>
	</c:if>
	<c:if test="${searchName==null}">	
		<a href="EmployeeServlet?pageNum=${empData.endPage}">尾页</a>
	</c:if>
</body>
</html>