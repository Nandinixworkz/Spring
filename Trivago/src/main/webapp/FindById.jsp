<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="findById" method="get">
<input type="search" placeholder="Enter id" name="id">
<input type="submit">
<h2>Details</h2>
		<table border="1">
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
				<td>${dto.name}</td>
				<td>${dto.age}</td>
				<td>${dto.gender}</td>
				<td>${dto.address}</td>
				<td>${dto.phoneNo}</td>
				<td>${dto.dob}</td>
				<td>${dto.emailId}</td>
				<td>${dto.aadharNo}</td>
			</tr>
		</table>
</form>

</body>
</html>