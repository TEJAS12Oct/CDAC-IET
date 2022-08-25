
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		Enter UserName:<input type="text" name="name"><br> Enter
		Password:<input type="password" name="pwd"><br> <input
			type="submit" value="Login">

		<%
		String uname = request.getParameter("name");
		String upwd = request.getParameter("pwd");
		if (uname != null && upwd != null) {
			if (uname.equals("iet") && upwd.equals("123")) {
		%>
		<%
		session.setAttribute("name", uname);
		%>
		<jsp:forward page="homepage.jsp">
			<jsp:param value="home" name="message" />
		</jsp:forward>
		<%
		} else {
		%>
		<p style="color: red">Invalid value</p>
		<%
		}
		}
		%>
	</form>
</body>
</html>