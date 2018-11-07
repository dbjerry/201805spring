<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view.jsp</title>
<style type="text/css">
	*{
		font-family: Consolas;
	}
</style>
</head>
<body>
	<h2>validator/view.jsp</h2>
	<form action="/validator/validate" method="post">
		<input type="text" name="userId" placeholder="id" value="${param.userId }"/><form:errors path="userVo.userId"/><br>
		<input type="text" name="name" placeholder="name" value="${param.name }"/><form:errors path="userVo.name"/><br>
		<input type="password" name="pass" placeholder="pw"/><form:errors path="userVo.pass"/><br>
		<input type="submit" value="전송"/>
	</form>
	
	
	<h2>view.jsp-jsr303</h2>
	<form action="/validator/validateJsr" method="post">
		<input type="text" name="userId" placeholder="id" value="${param.userId }"/><form:errors path="userVoJsr303.userId"/><br>
		<input type="text" name="name" placeholder="name" value="${param.name }"/><form:errors path="userVoJsr303.name"/><br>
		<input type="password" name="pass" placeholder="pw"/><form:errors path="userVoJsr303.pass"/><br>
		<input type="submit" value="전송"/>
	</form>
	
	
</body>
</html>

