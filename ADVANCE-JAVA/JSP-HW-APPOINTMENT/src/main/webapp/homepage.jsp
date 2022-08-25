<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Home</h1>
<form action="addDetails.jsp">
<table>
<tr>
<td>Date</td><td>:</td><td><input type="date" name="date"></td>
</tr>
<tr>
<td>Purpose</td><td>:</td><td><input type="text" name="purpose"></td>
</tr>
<tr>
<td>Category</td><td>:</td><td>&nbsp&nbsp&nbsp&nbsp<input type="radio" name="category" value="official">Official</td>
				<td><input type="radio" name="category" value="personal">Personal</td>
</tr>
<tr>
<td>From</td><td>:</td><td><input type="time" name="from"></td>
</tr>
<tr>
<td>To</td><td>:</td><td><input type="time" name="to"></td>
</tr>
<tr>
<td></td><td></td><td><input type="submit" value="submit"></td>
</tr>
</table>

${sessionScope.uname}



<center><a href="ShowAppointment.jsp">Show Appointmnet Link</a></center>
</form>
</body>
</html>