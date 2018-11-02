<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	* {
		font-family: Consolas;
		margin-left: 65px;
	}
</style>
<title>hello.jsp</title>
</head>
<body>
	<h2>hello.jsp</h2>
	
	<h3>minions member</h3>
	<c:forEach items="${minions }" var="minion">
		${minion }
	</c:forEach>
	
	<h3>1. /hello/request : Logger</h3>
	<form action="/hello/request" method="post">
		Identi.. : <input type="text" name="userId" value="jerry"/><br>
		Password : <input type="password" name="pass" value="jerry"/><br>
		<input type="submit" value="전송">
	</form>
	
	
	<h3>2. /hello/vo : Logger</h3>
	<form action="/hello/vo" method="post">
		Identi.. : <input type="text" name="userId" value="제리"/><br>
		Password : <input type="password" name="pass" value="jerry"/><br>
		<input type="submit" value="전송">
	</form>
	
	
	
</body>
</html>