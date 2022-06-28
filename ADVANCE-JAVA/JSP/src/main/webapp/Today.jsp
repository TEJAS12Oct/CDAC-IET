<!DOCTYPE html>

<%@page import="java.util.Random"%>
<%@page import="java.util.Date" session="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p>
		Today's Date is
		<%=new Date()%>
	</p>

	<p>
		Random Number Is
		<%= new Random().nextInt(100)%></p>
</body>
</html>