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
	background-color: orange;
	font-size: 20px;
}

.color {
	background-color: orange;
	font-size: 40px;
}
</style>

</head>
<body>

	<nav class="navbar navbar-expand-lg bg-Success">

		<div class="container-fluid">
			<img alt="logo"
				src="http://pluspng.com/img-png/trivago-logo-png-file-trivago-svg-1024.png"
				width="100" height="50"> <a class="navbar-brand" href="#">Home</a>
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
					<li class="nav-item"><a class="nav-link" href="#">Login</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="FindAll.jsp">FindAll</a></li>
						<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="FindById.jsp">FindById</a></li>
						<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="FindByName.jsp">FindByName</a></li>
							<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="FindByEmailId.jsp">FindByEmailId</a></li>
				</ul>
				<form class="d-flex" role="search">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>
	<img alt="logo"
		src="https://skift.com/wp-content/uploads/2018/02/trivago-girl.jpg"
		width="1530" height="620">
</body>
<footer class="color">
	<div>
		<a><img alt="logo"
			src="https://tse1.explicit.bing.net/th?id=OIP.Ua5AXhtGRgPuisZVmetclQHaFL&pid=Api&P=0&h=180"
			height="30" width="30"></a> <a
			href="https://mail.google.com/mail/u/0/#inbox"> <img
			src="https://www.currentschoolnews.com/wp-content/uploads/2019/04/Gmail-Account-Login.jpg"
			height="30" width="30"></a> <a
			href="https://www.instagram.com/?hl=en"><img alt="logo"
			src="https://tse4.mm.bing.net/th?id=OIP.bUnn03oLUdm1hqE6AwEdqAHaHa&pid=Api&P=0&h=180"
			height="30" width="30"></a>
	</div>
	<h5>Copyright@2023 AllRightReserved</h5>
</footer>

</html>