<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.spaceA{
		margin-right: 5px;
	}
	.currentA{
		color:black;
		text-decoration: none;
	}
</style>
<script type="text/javascript" 
	src="${pageContext.request.contextPath}/js/jquery-2.1.1.js">
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/BookList.js">
</script>
<script type="text/javascript">
	$(function(){
		queryBookList(1);
	});
	//获取第一页书籍列表数据
	function queryBookList(pageNum){
		var urlData = "${pageContext.request.contextPath}/queryByPage.book?pageNum="+pageNum;	
		$.ajax({
			url:urlData,
			type:"get",
			success:function(data){	 
				var bookData = JSON.parse(data);
				initView(bookData);
			}
		});
	}
	//根据书籍下标 找到数据 删除功能
	function delBook(bookId){
		//获取需要删除的书籍信息，调用ajax执行删除功能
		var bookData = bookList[bookId];
		$.ajax({
			url:"${pageContext.request.contextPath}/deleteBook.book"+
				"?delBookId="+bookData.id,
			type:"get",
			success:function(data){
				alert(data);
			}
		});	
	}
	//根据图书的名字 模糊查询
	function queryByName(){
		var name = $("#searchName").val();
		queryName(name,1);
	}
	//以名字 和 页码 模糊查询
	function queryName(queryName,pageNum){
		var urlData = "${pageContext.request.contextPath}/queryByPageAndName.book"
			+"?pageNum="+pageNum+"&bookName="+queryName;
		$.ajax({
			url:urlData,
			type:"get",
			success:function(data){	 
				var bookData = JSON.parse(data);
				initView(bookData);
			}
		});
	}
</script>
</head>
<body> 			
<div id="div1">

</div>		 

	<input type="button" value="新增图书" onclick='location.href=("AddBook.jsp")'/><br/>
	<input type="text" id="searchName" placeholder="输入书名"/>
	<input type="button" value="搜索" onclick="queryByName()"/>
	<br/>
	
	<div id="div0"></div>
	<div id="funcDiv"></div>
</body>
</html>