<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Hiii from jsp</h1>

	<%
	for (int i = 0; i < 10; i++) {
	%>

	<br />
	<b><i>Hello hiiii <%=i%></i></b>
	<%
	} //end of for
	%>

</body>
</html>