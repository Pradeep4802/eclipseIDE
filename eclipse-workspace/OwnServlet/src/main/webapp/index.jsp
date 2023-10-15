<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>BAsic</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	background: linear-gradient(to right, #ff0000, #00ff00, #0000ff);
	overflow-x: hidden;
}

table {
	border-collapse: collapse;
	/* border-spacing: 15px; */
	width: 90%;
	margin: 20px 30px;
	color: white;
	border: 2px solid white;
}

table tbody tr {
	border: 2px solid white;
}

table thead {
	background-color: rgb(221, 32, 32);
}

table td {
	text-align: center;
}
</style>
</head>
<body>
	<h1>Hello World</h1>

	<table border="1">
		<thead>
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Contact</th>
			</tr>
		</thead>

		<tbody>
			<tr>
				<td>Pradeep</td>
				<td>21</td>
				<td>9472347325</td>
			</tr>
			<t>
			<td>Suraj</td>
			<td>22</td>
			<td>9427492374</td>
			</t>
			<tr>
				<td>Abhinay</td>
				<td>21</td>
				<td>3263462343</td>
			</tr>
		</tbody>
	</table>

	<c:out value="Welcome to my course" />
	<br><c:set var="num" value="${12000}" />
	<br><c:out value="${num}" />
	<br><c:if test="${num < 10000 || num > 11500}"><p>My Income is : <c:out value="${num}"/></p></c:if>
</body>
</html>
