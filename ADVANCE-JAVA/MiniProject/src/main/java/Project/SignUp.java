package Project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class SignUp extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println(
				"<html><body style=\"background-image:url('1.0_register_online.webp');background-repeat:no-repeat;background-attachment: fixed;background-size:cover;\"> ");

		pw.println("<center><h1>Sign Up PAGE</h1>");

		pw.println("<form method='POST'>");

		pw.println("<table>" + "<tr>" + "<td><b>UserName : </b></td>"
				+ "<td><input type\"Text\" placeholder=\"UserName\" name  ='Name'></td>" + "</tr>");

		pw.println("<tr>" + "<td><b>LastName :</b></td>"
				+ "<td><input type\"Text\" placeholder=\"LastName\" name  ='LName'> </td>" + "</tr>");

		pw.println("<tr>" + "<td><b>DOB :</b></td>" + "<td> <input type=\"date\" name  ='DOB'></td>" + "</tr>");

		pw.println("<tr>" + "<td> <b>Gender :</b></td>" + "<td>" + "<input type=\"radio\" name=\"gender\" value=\"Male \">Male"
				+ "<input type=\"radio\" name=\"gender\" value=\"Female \">Female" + "<input type=\"radio\" name=\"gender\"value=\"Other \">Other"
				+ "</td>" + "</tr> ");

		pw.println("<tr>" + "<td> <b>Contact : </b></td>"
				+ "<td>  <input type\"Contact No\" placeholder=\"*********\" name  ='Contact'> </td>" + "</tr>");

		pw.println("<tr>" + "<td> <b>Password :</b></td>"
				+ "<td><input type\"Password\" placeholder=\"**********\" name  ='UserName'> </td>" + "</tr>");

		pw.println("<tr>" + "<td><b>Re-enterPassword :</b> </td>"
				+ "<td><input type\"Re-enterPassword\" placeholder=\"**********\" name  ='Password'> </td>" + "</tr> ");

		pw.println("</table><br/>" + "<b><u>Submission Confirmation : </u></b><br/>"
				+ "Are you Sure:<input type=\"checkbox\" name=\"Are you sure\" />"
				+ "<br/>(Please Click on the checkbox for Confirmation.)" + "<br/>"
				+ "<input type=\"submit\" name = \"CONFIRM SUBMISSION\" value=\" SUBMIT \" />");

		pw.println(" </form></center></body></html>");

		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		String Name = request.getParameter("Name");
		String LName = request.getParameter("LName");
		String DOB = request.getParameter("DOB");
		String Gender = request.getParameter("gender");
		String Contact = request.getParameter("Contact");
		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("Password");

		DAO dao = new DAO();
		dao.addUser(Name, LName, DOB, Gender, Contact, UserName, Password);
		pw.println("<h1>User Add Succesfully...!!!</h1>");

		pw.close();

	}
}
