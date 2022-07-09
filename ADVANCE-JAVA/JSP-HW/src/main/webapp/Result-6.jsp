<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%
		double RS = Integer.parseInt(request.getParameter("rupees")) / 78.125;
		%>
		<br>

		<h1>
			Rupee in Dollar :
			<%=RS%>
			$

		</h1>



	</center>

</body>
</html>
<!--
First Run Convertor.jsp 
 -->