<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>msg/view.jsp</title>
<!-- <script src="/js/jquery-3.3.1.min.js"></script> -->
<!-- <script type="text/javascript"> -->
<!-- $(document).ready(function(){ -->
<!--	 document.getElementsByTagName("select")[0].value="${lang}"; -->
<!-- }); -->
<!-- </script> -->
</head>
<body>
	hello : <spring:message code="hello"/><br>
	visitor : <spring:message code="visitor" arguments="brown"/><br>
	
	<!-- <c:set var="lang" value="${param.lang == null ? 'ko' : param.lang}"/> -->
	
	<!-- lang : ${param.lang }<br> -->
	
<form id="frm" action="/messageView" method="post">
	<select name="lang">
		<option value="ko" ${param.lang == "ko" ? 'selected' : ""}>한국어</option>
		<option value="ja" ${param.lang == "ja" ? 'selected' : ""}>日本語</option>
		<option value="en" ${param.lang == "en" ? 'selected' : ""}>English</option>
	</select>
	<input type="submit" value="전송"/>
</form> 
</body>
</html>