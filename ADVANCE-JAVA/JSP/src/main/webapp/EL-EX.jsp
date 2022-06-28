<%@page import="Study.Data.StudentData"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="El-EX2.jsp">
		<input type="text" name="data" /> <input type="submit" />
	</form>

	<%
	
	List<Integer> nums = Arrays.asList(12,13,14,15);
	pageContext.setAttribute("numbers", nums);
	
	request.setAttribute("year", 1947);
	session.setAttribute("message", "Tell About EL");
	application.setAttribute("quotes", "Tit FOR TAT");
	
	StudentData stud = new StudentData("Tejas","NASHIK","MATHS");
	application.setAttribute("s1",stud);

	%>
	
	${pageScope.numbers}
	
	
	 
</body>
</html>