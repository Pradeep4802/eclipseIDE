<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="heading mb-5 p-4">
		<h1>Login Page</h1>
	</div>
	<div class="container">
		<form action="loginserv" method="post">
			<div class="mb-3">
				<label for="accountno" class="form-label">Account Number</label> <input type="text" class="form-control"
					id="exampleInputEmail1" aria-describedby="emailHelp" name="accountno" >	
			</div>
			<div class="mb-3">
				<label for="passworduser" class="form-label">Password</label>
				<input type="text" class="form-control"
					id="exampleInputPassword1" name="passworduser" >
			</div>
			<input type="submit" class="btn btn-primary" value="login" />
		</form>
	</div>
</body>
</html>