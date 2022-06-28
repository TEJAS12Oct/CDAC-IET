<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Logo.jsp" %>

	<%
	int count = 0;
	%>
	<%
	int ucount = 0;
	if (session.isNew()) {
		ucount = 1;
		session.setAttribute("userwise_count", ucount);
	} else {
		ucount = (Integer) session.getAttribute("userwise_count");
		ucount++;
		session.setAttribute("userwise_count", ucount);

	}
	%>
	<p>
		The Total Hit count is
		<%=count%></p>
	<p>
		The User wise count is
		<%=ucount%></p>
</body>
</html>