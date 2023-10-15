<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	int num3 = Integer.parseInt(request.getParameter("num3"));
	int num4 = Integer.parseInt(request.getParameter("num4"));
	int num5 = Integer.parseInt(request.getParameter("num5"));
	%>
	<c:set var="num1" value="<%=num1%>" />
	<c:set var="num2" value="<%=num2%>" />
	<c:set var="num3" value="<%=num3%>" />
	<c:set var="num4" value="<%=num4%>" />
	<c:set var="num5" value="<%=num5%>" />
	<h1>Even Number are : </h1>
	<c:if test="${num1 % 2 == 0}">
		<c:out value="${num1}" />
	</c:if>
	<c:if test="${num2 % 2 == 0}">
		<c:out value="${num2}" />
	</c:if>
	<c:if test="${num3 % 2 == 0}">
		<c:out value="${num3}" />
	</c:if>
	<c:if test="${num4 % 2 == 0}">
		<c:out value="${num4}" />
	</c:if>
	<c:if test="${num5 % 2 == 0}">
		<c:out value="${num5}" />
	</c:if>
	
</body>
</html>