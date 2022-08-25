<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	int n1 = Integer.parseInt(request.getParameter("num1"));
	int n2 = Integer.parseInt(request.getParameter("num2"));
	String s = request.getParameter("op");
	int x = 0;
	switch (s) {
	case "+":
		x = n1 + n2;
		break;

	case "-":
		x = n1 - n2;
		break;
	case "*":
		x = n1 * n2;
		break;
	case "/":
		x = n2 / n1;
		break;

	}
	%>
	<h1>
		The Answer :
		<%=x%></h1>


</body>
</html>
<!--  First Run Calculator.jsp -->