package FSE_HW;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("UserName");
		String password = request.getParameter("Password");
		String gender = request.getParameter("Gender");
		System.out.println(username + " " + password + " " + gender);
		String CapitalCase = username.substring(0, 1).toUpperCase()
				+ username.substring(1, username.length()).toLowerCase();
		String outputname = "";
		if (gender.equals("Male")) {
			outputname = "Mr. " + CapitalCase;
		} else {
			outputname = "Mrs. " + CapitalCase;

		}

		if (username.equals("Tejas") && password.equals("123")) {
			out.println("Login Succesfully...!!!" + outputname);
		} else {
			out.println("Login Failed...!!!");
		}
	}

}
