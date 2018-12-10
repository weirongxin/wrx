/**
 * 
 */
//画面的创建
function initView(bookData) {
	//步骤：获取div 创建table 根据书籍列表创建tr、td 添加功能区
	var div0 = $("#div0");
	div0.empty();
	var table = $("<table border='1px solid black'>" + "<tr>"
			+ "<td>编号</td><td>名字</td><td>作者</td><td>出版时间</td>"
			+ "<td>出版社</td><td>功能</td>" + "</tr>" + "</table>");

	//书籍列表数据
	bookList = bookData.list;
	for (var i = 0; i < bookList.length; i++) {
		//书籍列表中的元素
		var book = bookList[i];
		//书籍idtd
		var idtd = $("<td>" + book.id + "</td>");
		//书籍名字td
		var nametd = $("<td>" + book.name + "</td>");
		//作者td
		var authortd = $("<td>" + book.author + "</td>");
		//出版时间td
		var datetimetd = $("<td>" + book.datetime + "</td>");
		//出版社td
		var publicationtd = $("<td>" + book.publication + "</td>");
		//删除功能按钮
		var functd = $("<td></td>");

		//闭包：给按钮添加点击事件  事件被响应时i已经取到最后一个元素，
		//    循环中的按钮 点击后响应的i一定都为最后一个i值
		//通过闭包，在循环添加点击事件时将循环数值，存入点击事件中
		//格式：(闭包中处理的事件/方法)(循环变量);
		(function(i) {
			//直接创建button
			var delBtn = $("<input type='button' value='删除'/>");
			//将删除按钮对象  添加click点击事件
			delBtn.click(function(){
				$(this).parent().parent().remove();
				delBook(i);
			});
			functd.append(delBtn);
		})(i);
		var tr = $("<tr></tr>");
		tr.append(idtd);
		tr.append(nametd);
		tr.append(authortd);
		tr.append(datetimetd);
		tr.append(publicationtd);
		tr.append(functd);
		table.append(tr);
	}
	div0.append(table);
	//调用页码功能区 方法的调用
	pageFunc(bookData);
}
//添加 页码工具栏
//添加 首页 上一页  页码  下一页 尾页
function pageFunc(pageData){
	var pageDiv = $("#funcDiv");
	pageDiv.empty();
	
	//当前页码、起始页码、结束页码
	var currentPage = pageData.currentPage;
	var startPage = pageData.startPage;
	var endPage = pageData.endPage;
	var totalPage = pageData.totalPage;
	var queryData = pageData.customQueryData;
	 
	//创建 页码功能区
	var firstPage;
	if(queryData==null||queryData.length==0){
		firstPage = $("<a class='spaceA' href='javascript:queryBookList("+1+");'>首页</a>");
	}else{
		firstPage = $('<a class="paceA" href="javascript:queryName(\''+queryData+'\',1);">首页</a>');
	}
	pageDiv.append(firstPage);
	//如果是第一页则不显示 上一页
	if(currentPage!=1){
		var prePage;
		if(queryData==null||queryData.length==0){
			prePage = $("<a class='spaceA' href='javascript:queryBookList("+(currentPage-1)+");'>上一页</a>");
		}else{
			//prePage = $("<a class='spaceA' href='javascript:queryName("+queryData+","+(currentPage-1)+");'>上一页</a>");
			prePage = $('<a class="paceA" href="javascript:queryName(\''+queryData+'\','+(currentPage-1)+');">上一页</a>');

		}
		pageDiv.append(prePage);
	}
	
	//添加页码显示
	console.log(startPage+","+endPage+","+currentPage);
	
	for(var i=startPage;i<=endPage;i++){
		var pageFunc;
		if(i!=currentPage){
			if(queryData==null||queryData.length==0){
				pageFunc = $("<a class='spaceA'  href='javascript:queryBookList("+i+");'>"+i+"</a>");
			}else{
				pageFunc = $('<a class="spaceA"  href="javascript:queryName(\''+queryData+'\','+i+');">'+i+'</a>');

			}
		}else{
			 pageFunc = $("<a class='spaceA currentA' href='javascript:void(0);'>"+i+"</a>");
		}
		pageDiv.append(pageFunc);
	}
	//如果最后一页  则不显示下一页
	if(currentPage!=totalPage){
		var aftPage;
		if(queryData==null||queryData.length==0){
			aftPage = $("<a class='spaceA' href='javascript:queryBookList("+(currentPage+1)+");'>下一页</a>");
		}else{
			aftPage = $('<a class="spaceA" href="javascript:queryName(\''+queryData+'\','+(currentPage+1)+');">下一页</a>');
		}
		pageDiv.append(aftPage);
	}
	//追加尾页
	var lastPage;
	if(queryData==null||queryData.length==0){
		lastPage = $("<a class='spaceA' href='javascript:queryBookList("+endPage+");'>尾页</a>");
	}else{
		lastPage = $('<a class="spaceA" href="javascript:queryName(\''+queryData+'\','+endPage+');">尾页</a>');
	}
	pageDiv.append(lastPage);
}
 