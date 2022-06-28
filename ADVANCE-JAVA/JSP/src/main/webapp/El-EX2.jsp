<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Welcome ${param.data}</p>
	<p>
		Welcome
		<%=request.getParameter("data")%></p>
	<p>page level data = ${pageScope.numbers}</p>
	<p>request data = ${requestScope.year}</p>
	<p>request data = ${sessionScope.message}</p>
	<p>request data = ${applicationScope.quotes}</p>

	<p>student data = ${ applicationScope.s1.getName() }</p>
	<p>student data = ${ applicationScope.s1.getAddress() }</p>
	<p>student data = ${ applicationScope.s1.getSubject() }</p>
</body>
</html>