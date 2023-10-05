<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="findAll" method="get">
		<input type="submit" class="btn btn-dark">

		<table border="1">
				<c:forEach items="${find}" var="find">
			<tr>
				<td>Name</td>
				<td>Age</td>
				<td>Gender</td>
				<td>Address</td>
				<td>PhoneNo</td>
				<td>Dob</td>
				<td>EmailId</td>
				<td>AadharNo</td>
			</tr>
			<tr>
				<td>${find.name}</td>
				<td>${find.age}</td>
				<td>${find.gender}</td>
				<td>${find.address}</td>
				<td>${find.phoneNo}</td>
				<td>${find.dob}</td>
				<td>${find.emailId}</td>
				<td>${find.aadharNo}</td>
			</tr>
			</c:forEach>
		</table>

	</form>
</body>
</html>