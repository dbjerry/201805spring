<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax/view.jsp</title>
<%@ include file="/WEB-INF/view/common/basicLib.jsp" %>
<style type="text/css">
	*{
		font-family: Consolas;
	}
	h2{
		text-align: center;
	}
	.container{
		margin-left: 90px;
	}
</style>
<script type="text/javascript">
	$(document).ready(function(){
		var userVo = {userId:"brown", alias:"곰", name:"브라운", pass:"brownpass"};
		
		//자바스크립트 객체를 문자열로 변환 메서드: stringify
		$("#sendData").html(JSON.stringify(userVo));

		$("#send").on("click", function(){
			$.ajax({
				contentType: "application/json; charset=utf-8",
				url: "/ajax/getRangers",
				type: "post",
				data: JSON.stringify(userVo),	//json
				success: function(data){
					$("#result").html(JSON.stringify(data));
				}
			});
		});
	});
</script>
</head>
<body>
	<h2>view.jsp</h2>
	<div class="container">
		<button id="send">전송</button><br>
		전송데이터 : <span id="sendData"></span><br>
		응답결과 : <span id="result"></span>
	</div>
</body>
</html>