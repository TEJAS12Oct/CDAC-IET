<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>
		<i>Squares and Cubes</i>
	</h1>
	<table border="1">
		<tr>
			<th>Number</th>
			<th>Square</th>
			<th>Cube</th>
		</tr>
		<%
		for (int i = 1; i <= 100; i++) {
		%>
		<tr>
			<td><%=i%></td>
			<td><%=i * i%></td>
			<td><%=i * i * i%></td>
		</tr>
		<%
		} //end of for
		%>
	</table>

</body>
</html>

<!--
First war file generated using export 
then Browser Put http://localhost:8080/App1/SqCube.jsp 
 -->