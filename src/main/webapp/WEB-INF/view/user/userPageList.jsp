<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="kr.or.ddit.util.model.PageVo"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.user.model.UserVo"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<style>
.userClick {
	cursor: pointer;
}
</style>
<script>
	$(document).ready(function(){
		console.log("document.ready");
		
		//tr에 select (class="userClick")
		$("#userList").on("click", ".userClick", function(){
			console.log("userClick");
			var userId = $(this).children()[1].innerHTML;
			
			$("#userId").val(userId);
			$("#frm").submit();
		});
		
		//getUserList(1);
		getUserListHtml(1);
		getUserPagenationHtml(1);
	});

	function getUserListHtml(page){
		var pageSize = 10;
		
		$.ajax({
			url : "/user/userPageListAjaxHtml",
			type : "GET",
			data : "page="+page+"&pageSize="+pageSize,
			success : function(dt){
				$("#userList").html(dt);
			}
		});
	}
	
	function getUserPagenationHtml(page){
		var pageSize = 10;
			
		$.ajax({
			url : "/user/userPagenationHtml",
			type : "GET",
			data : "page="+page+"&pageSize="+pageSize,
			success : function(data){
				var firstHtml = "";
				var lastHtml = "";
				
				firstHtml += "<li><a href='javascript:getUserList(1);' aria-label='Previous'>";
				firstHtml += "<span aria-hidden='true'>&laquo;</span>";
				firstHtml += "</a></li>";
				
				lastHtml += "<li><a href='javascript:getUserList(${pageCnt });'";
				lastHtml += "	aria-label='Next'> <span aria-hidden='true'>&raquo;</span>";
				lastHtml += "</a></li>";
				
				$(".pagination").html(firstHtml + data + lastHtml);

			}
		});
	}
	
	
	//page인자를 받아서
	//해당페이지에 속하는 사용자 리스트 정보를 가져온다
	function getUserList(page){
		var pageSize = 10;
		console.log("page : " + page);
		
		//ajax call
		//사용자 리스트 데이터만 가져오기
		//html(as-is) ==> jsom(to-be) 데이터를 받는 형태로 변경
		$.ajax({
			type: "GET",
			url: "/user/userPageListAjax",
			data: "page="+page+"&pageSize="+pageSize,
			success: function(data){
				//data(사용자 json 데이터)를 바탕으로
				//사용자 리스트를 갱신
				//1. 기존 리스트를 삭제
				//2. data를 이용하여 table 태그(tr)를 작성
				//3. 기존 리스트 위치에다가 붙여넣기
				
				console.log(data);
				var html = "";
				$.each(data.userList, function(idx, user){
					//console.log(user);
					html += "<tr class='userClick'>";
					html += "	<td>" + user.rnum + "</td>";
					html += "	<td>" + user.userId + "</td>";
					html += "	<td>" + user.name + "</td>";
					html += "	<td>" + user.birth + "</td>";
					html += "</tr>";
					
				});	//$.each
				
				$("#userList").html("");
				$("#userList").html(html);
				
			}	//success
		});	//$.ajax
		
	}	//function getUserList(page)
</script>
<form id="frm" action="/user/userDetail" method="get">
	<input type="hidden" id="userId" name="userId" />
</form>

<div class="row">
	<div class="col-sm-8 blog-main">
		<h2 class="sub-header">사용자</h2>
		<div class="table-responsive">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th>번호</th>
						<th>사용자 아이디</th>
						<th>사용자 이름</th>
						<th>생일</th>
					</tr>
				</thead>

				<tbody id="userList">
<%-- 					<c:forEach items="${userList}" var="userList"> --%>
	
<!-- 						<tr class="userClick"> -->
<%-- 							<td>${userList.rnum}</td> --%>
<%-- 							<td>${userList.userId}</td> --%>
<%-- 							<td>${userList.name}</td> --%>
<%-- 							<td>${userList.birth}</td> --%>
<%-- 							<td><fmt:formatDate value="${userList.birth }" pattern="yyyy-MM-dd"/></td> --%>
<!-- 						</tr> -->
<%-- 					</c:forEach> --%>
				</tbody>
			</table>
		</div>

		<a class="btn btn-default pull-right" href="/user/userForm">사용자 등록</a>

		<div class="text-center">
			<ul class="pagination">
				<!-- <li><a href="/user/userPageList?page=1&pageSize=10" -->
				<!-- <li><a href="javascript:getUserList(1);" -->
				<!-- 	aria-label="Previous"> <span aria-hidden="true">&laquo;</span> -->
				<!-- </a></li> -->

				<!-- <c:forEach begin="1" end="${pageCnt }" var="i"> -->

					<!-- <li><a href="/user/userPageList?page=${i }&pageSize=10">${i }</a></li> -->
					<!-- <li id="liList"><a href="javascript:getUserList(${i });">${i }</a></li> -->
				<!-- </c:forEach> -->

				<!-- <li><a href="/user/userPageList?page=${pageCnt }&pageSize=10" -->
				<!-- <li><a href="javascript:getUserList(${pageCnt });" -->
				<!-- 	aria-label="Next"> <span aria-hidden="true">&raquo;</span> -->
				<!-- </a></li> -->
			</ul>
		</div>
	</div>
</div>

