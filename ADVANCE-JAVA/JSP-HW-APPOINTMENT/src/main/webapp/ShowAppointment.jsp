<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="APPOINTMENT.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST">
		Enter Date of Appointment:<input type="date" name="Date"><br>
		<input type="submit" value="Show">
	</form>
	<%
	String date = request.getParameter("Date");
	System.out.println("Date: " + date);
	if (date != null) {
		DAO dao = new DAO();
		ResultSet rs = dao.getRows("select * from appointment where date=str_to_date('" + date + "','%Y-%m-%d')");
	%>
	<table border=1>
		<tr>
			<th>Sr no.</th>
			<th>Date</th>
			<th>Purpose</th>
			<th>Category</th>
			<th>From</th>
			<th>To</th>
		</tr>
		<%
		while (rs.next()) {
			int id = rs.getInt(1);
			String _date = rs.getString(2);
			String _purpose = rs.getString(3);
			String _category = rs.getString(4);
			String _from = rs.getString(5);
			String _to = rs.getString(6);
		%>

		<tr>
			<td><%=id%></td>
			<td><%=_date%></td>
			<td><%=_purpose%></td>
			<td><%=_category%></td>
			<td><%=_from%></td>
			<td><%=_to%></td>
		</tr>


		<%
		System.out.println("" + id);
		}
		}
		%>
	</table>
</body>
</html>