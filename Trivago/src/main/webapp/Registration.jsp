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
	background-color: lightblue;
	 font-size: 20px;
}
.body{
  background-color: grey;
}
.color{
    background-color: lightblue;
    font-size: 20px;
}
</style>
</head>
<body class="body">
	<marquee>
		<h4>Wel come to Trivago</h4>
	</marquee>
	<form action="save" method="post">
		<nav class="navbar navbar-expand-lg ">

			<nav class="navbar navbar-expand-lg bg-Success">
				<div class="container-fluid">
					<img alt="logo"
						src="http://pluspng.com/img-png/trivago-logo-png-file-trivago-svg-1024.png"
						width="100" height="50"> <br> <a class="navbar-brand"
						href="#">Home</a>
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
				</div>
			</nav>
			</nav>
	
	<br>
	<div class="container w-50 border border-dark border-5 mt-5">
	<div class="mb-3">
		<label for="exampleFormControlInput" class="form-label">Name</label> <input
			type="text" class="form-control" name="name" placeholder="name">
	</div>
	<br>
	<div class="mb-3">
		<label for="exampleFormControlInput" class="form-label">Age</label> <input
			type="number" class="form-control" name="age" placeholder="age">
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
		<label for="exampleFormControlInput" class="form-label">DOB</label> <input
			type="text" class="form-control" name="dob" placeholder="dob">
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
	<input type="submit" class="btn btn-dark">
	<input type="reset" class="btn btn-warning">
</div>
</form>
</body>
<footer class="color">
	<div>
		<a><img alt="logo"
			src="https://tse1.explicit.bing.net/th?id=OIP.Ua5AXhtGRgPuisZVmetclQHaFL&pid=Api&P=0&h=180" height="30" width="30"></a>
<a href="https://mail.google.com/mail/u/0/#inbox">
    <img src="https://www.currentschoolnews.com/wp-content/uploads/2019/04/Gmail-Account-Login.jpg" height="30" width="30"></a>
    <a href="https://www.instagram.com/?hl=en"><img alt="logo" src="https://tse4.mm.bing.net/th?id=OIP.bUnn03oLUdm1hqE6AwEdqAHaHa&pid=Api&P=0&h=180"  height="30" width="30"></a>
</div>
<h5>Copyright@2023 AllRightReserved</h5>
</footer>

</html>