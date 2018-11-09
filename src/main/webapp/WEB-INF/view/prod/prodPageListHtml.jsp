<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:forEach items="${prodList}" var="prod">

	<tr class="prodClick">
		<td>${prod.rnum }</td>
		<td>${prod.prod_id }</td>
		<td>${prod.prod_name }</td>
		<td>${prod.lprod_nm }</td>
		<td>${prod.prod_insdate }</td>
		<%-- <td><fmt:formatDate value="${userList.birth }"
				pattern="yyyy-MM-dd" /></td> --%>
	</tr>
</c:forEach>

