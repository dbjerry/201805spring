<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
	login.jsp
	<form action="/user/loginProcess" method="post">
		<input type="text" name="userId"/>
		<input type="password" name="pass"/>
		<input type="submit" value="전송"/>
	</form>
</body>
</html>
