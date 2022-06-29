<%@page import="java.sql.ResultSet"%>
<%@page import="APPOINTMENT.DAO"%>
<div>
	<%
	String date = request.getParameter("date");//2022-06-01
	String purpose = request.getParameter("purpose");
	String category = request.getParameter("category");
	String from = request.getParameter("from");
	String to = request.getParameter("to");//01:31

	DAO dao = new DAO();

	dao.addAppointment(date, purpose, category, from, to);
	%>

	<jsp:forward page="homepage.jsp">
		<jsp:param value="added" name="message" />
	</jsp:forward>
</div>