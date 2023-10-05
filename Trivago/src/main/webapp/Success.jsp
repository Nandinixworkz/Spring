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
				<td>${TO.name}</td>
				<td>${TO.age}</td>
				<td>${TO.gender}</td>
				<td>${TO.address}</td>
				<td>${TO.phoneNo}</td>
				<td>${TO.dob}</td>
				<td>${TO.emailId}</td>
				<td>${TO.aadharNo}</td>
			</tr>
		</table>
		
</body>
</html>

