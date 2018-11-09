<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="kr.or.ddit.util.model.PageVo"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.prod.model.ProdVo"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
.userClick {
	cursor: pointer;
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
		
		//getProdList(1);
		getProdListHtml(1);
		getProdPagenationHtml(1);
	});
	
	
	function getProdListHtml(page){
		var pageSize = 10;
		
		$.ajax({
			url: "/prod/prodPageListHtml",
			type: "GET",
			data: "page="+page+"&pageSize="+pageSize,
			success: function(data){
				$("#prodList").html(data);
			}
		});
	}

	
	function getProdPagenationHtml(page){
		var pageSize = 10;
		
		$.ajax({
			url: "/prod/prodPagenationHtml",
			type: "GET",
			data: "page="+page+"&pageSize="+pageSize,
			success: function(data){
				$(".pagination").html(data);
			}
		});
	}
	
	
	function getProdList(page){
		var pageSize = 10;
		console.log("page : " + page);
		
		$.ajax({
			type: "GET",
			url: "/prod/prodPageListAjax",
			data: "page="+page+"&pageSize="+pageSize,
			success: function(data){
				console.log(data);
				
				var html = "";
				$.each(data.prodList, function(idx, prod){
					html += "<tr class='prodClick'>";
					html += "	<td>" + prod.rnum + "</td>";
					html += "	<td>" + prod.prod_id + "</td>";
					html += "	<td>" + prod.prod_name + "</td>";
					html += "	<td>" + prod.lprod_nm + "</td>";
					html += "	<td>" + prod.prod_insdate + "</td>";
					html += "</tr>";
					
				});
				
				$("#prodList").html("");
				$("#prodList").html(html);
				
			}
		});
	}
</script>
<form id="frm" action="/prod/prodDetail" method="get">
	<input type="hidden" id="prodId" name="prod_id" />
</form>

<div class="row">
	<div class="col-sm-8 blog-main">
		<h2 class="sub-header">제품</h2>
		<div class="table-responsive">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>번호</th>
						<th>제품 아이디</th>
						<th>제품명</th>
						<th>제품그룹명</th>
						<th>제품등록일</th>
					</tr>
				</thead>

				<tbody id="prodList">
					<%-- <c:forEach items="${prodList}" var="prodList"> --%>

						<!-- <tr class="prodClick"> -->
							<!-- <td>${prodList.rnum }</td> -->
							<!-- <td>${prodList.prod_id }</td> -->
							<!-- <td>${prodList.prod_name }</td> -->
							<!-- <td>${prodList.lprod_nm }</td> -->
							<!-- <td>${prodList.prod_insdate }</td> -->
							<%-- <td><fmt:formatDate value="${userList.birth }" pattern="yyyy-MM-dd"/></td> --%>
						<!-- </tr> -->
					<%-- </c:forEach> --%>
				</tbody>
			</table>
		</div>

		<a class="btn btn-default pull-right" href="/user/userForm">사용자 등록</a>

		<div class="text-center">
			<ul class="pagination">
				<!-- <li><a href="/prod/prodPageList?page=1&pageSize=10" -->
				<!-- <li><a href="javascript:getProdList(1);" aria-label="Previous"> -->
						<!-- <span aria-hidden="true">&laquo;</span> -->
				<!-- </a></li> -->

				<%-- <c:forEach begin="1" end="${prodCnt }" var="i"> --%>

					<!-- <li><a href="/prod/prodPageList?page=${i }&pageSize=10">${i }</a></li> -->
					<!-- <li><a href="javascript:getProdList(${i });">${i }</a></li> -->
				<%-- </c:forEach> --%>

				<!-- <li><a href="/prod/prodPageList?page=${prodCnt }&pageSize=10" -->
					<!-- aria-label="Next"> <span aria-hidden="true">&raquo;</span> -->
				<!-- </a></li> -->
			</ul>
		</div>
	</div>
</div>

