<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">

<style type="text/css">
.navbar {
	background-color: gold;
}
</style>
</head>
<body class="p-3 mb-2 bg-danger-subtle text-emphasis-danger">
	<marquee>
		<h1>Wel come to Trivago</h1>
	</marquee>
	<form action="save" method="post">
		<nav class="navbar navbar-expand-lg ">

			<nav class="navbar navbar-expand-lg bg-Success">
				<div class="container-fluid">
				<img alt="logo" src="http://pluspng.com/img-png/trivago-logo-png-file-trivago-svg-1024.png" width="100" height="50">
					<br>
					<a class="navbar-brand" href="#">Home</a>
					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="navbar-nav me-auto mb-2 mb-lg-0">
							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="Registration.jsp">Registration</a></li>
						</ul>
					</div>
					</br>
			</div>	
			</nav>
			

<br>
			<div class="mb-3">
				<label for="exampleFormControlInput" class="form-label">Id</label> <input
					type="number" class="form-control" name="id" placeholder="id">
			</div>
			<br>
			<div class="mb-3">
				<label for="exampleFormControlInput" class="form-label">Name</label>
				<input type="text" class="form-control" name="name"
					placeholder="name">
			</div>
         <br>
			<div class="mb-3">
				<label for="exampleFormControlInput" class="form-label">Age</label>
				<input type="number" class="form-control" name="age"
					placeholder="age">
			</div>
<br>
			<div class="mb-3">
				<label for="exampleFormControlInput" class="form-label">Gender</label>
				<input type="text" class="form-control" name="gender"
					placeholder="gender">
			</div>
<br>
			<div class="mb-3">
				<label for="exampleFormControlInput" class="form-label">Address</label>
				<input type="text" class="form-control" name="address"
					placeholder="address">
			</div>
<br>
			<div class="mb-3">
				<label for="exampleFormControlInput" class="form-label">PhoneNo</label>
				<input type="number" class="form-control" name="phoneNo"
					placeholder="phoneNo">
			</div>
<br>
			<div class="mb-3">
				<label for="exampleFormControlInput" class="form-label">DOB</label>
				<input type="text" class="form-control" name="dob" placeholder="dob">
			</div>
<br>
			<div class="mb-3">
				<label for="exampleFormControlInput" class="form-label">EmailId</label>
				<input type="text" class="form-control" name="emailId"
					placeholder="emailId">
			</div>
			<br>

			<div class="mb-3">
				<label for="exampleFormControlInput" class="form-label">AadharNo</label>
				<input type="number" class="form-control" name="aadharNo"
					placeholder="aadharNo">
			</div>
<br>
			<input type="submit" class="btn btn-dark"> <input
				type="reset" class="btn btn-warning">
		</nav>
	
	</form>
</body>
</html>