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

<form action="findByPhoneNo" method="get">
<input type="search" placeholder="Enter phoneNo" name="phoneNo">
<input type="submit">
<h2>Details</h2>
		<table border="1">
				<c:forEach items="${dto1}" var="dto">
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
			</c:forEach>
		</table>

	</form>

</body>
</html>