<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty studentsList}">
		<table>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>PASSWORD</th>
			</tr>
			<c:forEach items="${studentsList}" var="student">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.pass}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>






</html>