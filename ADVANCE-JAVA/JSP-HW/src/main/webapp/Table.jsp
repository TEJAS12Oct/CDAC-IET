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
		<i>TABLE 2</i>
	</h1>

	<%
	for (int i = 1; i <= 100; i++) {
	%>

	<br />2*
	<%=i%>=<%=2 * i%></i>
	</b>

	<%
	} //end of for
	%>

</body>
</html>