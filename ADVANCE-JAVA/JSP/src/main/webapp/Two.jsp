<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Two.jsp</h1>
	<p>Message from One IS <%=request.getParameter("message") %><br/>
		Today's Date is
		<%=new Date()%>
	</p>
</body>
</html>