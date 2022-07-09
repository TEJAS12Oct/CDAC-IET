<%@page import="Study.Dao.DAO" isErrorPage="false"
	errorPage="myerror.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="Logo.jsp"%>
	<form>

		Enter ID : <input type="number" name="id" /><br /> Enter Name : <input
			type="text" name="name" /><br /> Enter Cost : <input type="number"
			name="cost" /><br /> <input type="submit" value="add" />
	</form>
	<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String cost = request.getParameter("cost");

	if (id != null) {
		int pid = Integer.parseInt(id);
		int pcost = Integer.parseInt(cost);
		DAO dao = new DAO();
		dao.addProduct(pid, name, pcost);

	}
	%>
</body>
</html>

<!--  First war file generated using export 
then Browser Put http://localhost:8080/App1/AddProduct.jsp
 -->