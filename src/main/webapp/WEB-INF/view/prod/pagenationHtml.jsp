<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<li><a href="javascript:getProdList(1);" aria-label="Previous">
		<span aria-hidden="true">&laquo;</span>
</a></li>

<c:forEach begin="1" end="${prodCnt }" var="i">

	<!-- <li><a href="/prod/prodPageList?page=${i }&pageSize=10">${i }</a></li> -->
	<li><a href="javascript:getProdList(${i });">${i }</a></li>
</c:forEach>

<li><a href="javascript:getProdList(${prodCnt });"
	aria-label="Next"> <span aria-hidden="true">&raquo;</span>
</a></li>

