<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="kr.or.ddit.util.model.PageVo"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.prod.model.ProdVo"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<title>Jsp</title>
<%@include file="/WEB-INF/view/common/basicLib.jsp"%>
<style>
	.userClick {
		cursor : pointer;
	}
</style>
<script>
	$(document).ready(function(){
		console.log("document.ready");
		
		//tr에 select (class="userClick")
		$(".prodClick").on("click", function(){
			console.log("prodClick");
			var prod_id = $(this).children()[1].innerHTML;
			
			$("#prodId").val(prod_id);
			$("#frm").submit();
		});
		
	});
</script>
</head>
<form id="frm" action="/prod/prodDetail" method="get">
	<input type="hidden" id="prodId" name="prod_id" />
</form>
<body>

	<%-- header --%>
	<%@include file="/WEB-INF/view/common/header.jsp"%>

	<div class="container-fluid">
		<div class="row">

			<%-- left --%>
			<%@include file="/WEB-INF/view/common/left.jsp"%>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<div class="row">
					<div class="col-sm-8 blog-main">
						<h2 class="sub-header">제품</h2>
						<div class="table-responsive">
							<table class="table table-striped table-hover">

								<tr>
									<th>번호</th>
									<th>제품 아이디</th>
									<th>제품명</th>
									<th>제품그룹명</th>
									<th>제품등록일</th>
								</tr>
								
								
								<c:forEach items="${prodList}" var="prodList">
									
								<tr class="prodClick">
									<td>${prodList.rnum }</td>
									<td>${prodList.prod_id }</td>
									<td>${prodList.prod_name }</td>
									<td>${prodList.lprod_nm }</td>
									<td>${prodList.prod_insdate }</td>
<%-- 									<td><fmt:formatDate value="${userList.birth }" pattern="yyyy-MM-dd"/></td> --%>
								</tr>
								</c:forEach>
							</table>
						</div>

						<a class="btn btn-default pull-right"
							href="/user/userForm">사용자 등록</a>
							
						<div class="text-center">
							<ul class="pagination">
								<li><a href="/prod/prodPageList?page=1&pageSize=10"
									aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
								</a></li>

								<c:forEach begin="1" end="${prodCnt }" var="i">
								
									<li><a href="/prod/prodPageList?page=${i }&pageSize=10">${i }</a></li>
								</c:forEach>

								<li><a href="/prod/prodPageList?page=${prodCnt }&pageSize=10"
									aria-label="Next"> <span aria-hidden="true">&raquo;</span>
								</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>

