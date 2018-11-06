<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="kr.or.ddit.util.model.PageVo"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.user.model.UserVo"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<%-- <% UserVo user = (UserVo) request.getAttribute("userVo"); %> --%>
<script>
	$(document).ready(function(){
		console.log("document.ready");
		
		//tr에 select (class="userClick")
		$(".setId").on("click", function(){
			console.log("userId");
			var userId = $("#userId").text(); //$(this).children()[1].innerText;
			
			$("#userId").val(userId);
			$("#frm").submit();
		});
		
	});
</script>

</head>
<!-- <form id="frm" action="/userUpdateForm" method="get"> -->
<%-- 	<%System.out.println(user.getUserId()); %> --%>
<%-- 	<input type="hidden" id="userId2" name="userId" value="<%=user.getUserId() %>"/> --%>
<!-- </form> -->
<body>

	<%-- header --%>
	<%@include file="/WEB-INF/view/common/header.jsp"%>

	<div class="container-fluid">
		<div class="row">

			<%-- left --%>
			<%@include file="/WEB-INF/view/common/left.jsp"%>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<form id="frm" action="/user/userUpdateForm" method="get" class="form-horizontal" role="form">
					<input type="hidden" id="userId2" name="userId" value="${userVo.userId }"/>
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">사용자 사진</label>
						<div class="col-sm-10">
							<%-- <%
								String profilePath = user.getProfile();
								profilePath = profilePath == null ? "/profile/minions.jpg" : profilePath;
							%> --%>
							
							<c:set value="${userVo.profile }" var="profilePath"/>
							<c:choose>
								<c:when test="${profilePath == null}">
									<img alt="" src="/profile/minions.jpg">
								</c:when>
								<c:otherwise>
									<!-- <img src=${profilePath }> -->
									<img alt="" src=${userVo.profile }>
								</c:otherwise>
							</c:choose>
						</div>
					</div>
				
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">사용자 아이디</label>
						<div class="col-sm-10">
							<label id="userId">${userVo.userId }</label>
						</div>
					</div>
					
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">이름</label>
						<div class="col-sm-10">
							${userVo.name }
						</div>
					</div>
					
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">도로명주소</label>
						<div class="col-sm-10">
							${userVo.addr1 }
						</div>
					</div>
					
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">상세주소</label>
						<div class="col-sm-10">
							${userVo.addr2 }
						</div>
					</div>
					
					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">우편번호</label>
						<div class="col-sm-10">
							${userVo.zipcd }
						</div>
					</div>

					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">생년월일</label>
						<div class="col-sm-10">
							${userVo.birth }
						</div>
					</div>

					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">이메일</label>
						<div class="col-sm-10">
							${userVo.email }
						</div>
					</div>

					<div class="form-group">
						<label for="pass" class="col-sm-2 control-label">연락처</label>
						<div class="col-sm-10">
							${userVo.tel }
						</div>
					</div>

					<div class="form-group" class="userClick">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default setId">사용자 수정</button>
							<!-- 
								button type = submit이면 form태그 안에 보내려는 값의 input태그가 있어야하고
								type이 button이면 form태그 밖이어도 되지만 id값 중복되지않고 script로 보내야한다.
							-->
						</div>
					</div>
					
				</form>
			</div>
		</div>
	</div>
</body>
</html>

