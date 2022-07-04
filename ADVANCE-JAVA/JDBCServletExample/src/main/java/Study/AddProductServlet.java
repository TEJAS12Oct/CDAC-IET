package Study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// First Go Too Web Xml 
// Check Name Url
// Export war File
// Then Run
// http://localhost:8080/App1/Add
public class AddProductServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println("<html><body>");
		pw.println("<form method='POST' >");

		pw.println("Enter ID : <input type='number' name  ='pid' />");
		pw.println("<br/> Enter Name : <input type='text' name  ='pname' />");
		pw.println("<br/> Enter cost : <input type='number' name  ='pcost' />");
		pw.println("<br/> <input type='Submit' value  ='Add Product' />");

		pw.println("</form></body></html>");
		pw.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pid = request.getParameter("pid");
		String pname = request.getParameter("pname");
		String pcost = request.getParameter("pcost");

		DAO dao = new DAO();
		dao.addProduct(Integer.parseInt(pid), pname, Integer.parseInt(pcost));

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println("<html><body>");
		pw.println("<form action='show'  , method='GET' >");

		pw.println("<br/> <input type='Submit' value  ='SHOW All Product' />");

		pw.println("</form></body></html>");
		pw.close();
	}
	

}
