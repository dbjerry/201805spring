<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach begin="1" end="${pageCnt }" var="i">

	<li><a href="javascript:getUserList(${i });">${i }</a></li>
	<%-- <li id="liList"><a href="javascript:getUserList(${i });">${i }</a></li> --%>
</c:forEach>

