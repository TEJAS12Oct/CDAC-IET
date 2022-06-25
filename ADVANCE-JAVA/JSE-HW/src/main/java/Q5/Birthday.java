package Q5;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Birthday")
public class Birthday extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		pw.println("<form method='POST'>");
		pw.println("<center><h1>BIRTHDAY</h1>");
		pw.println("<br/>Firstname : <input type='text' name='fname' />");
		pw.println("<br/><br/>Lastname : <input type='text' name='lname' />");
		pw.println("<br/><br/>Date : <input type='date' name='Date' />");
		pw.println("<br/><br/><input type='submit'  name='Submit' />");
		pw.println("</form></center></body></html>");

		pw.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body><table border='1'>");
		pw.println("<center><h1>BIRTHDAY Added Succesfully...!!!<h1><center>");
		DAO dao = new DAO();
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String dob = request.getParameter("Date");
		/*
		 * java.util.Date date=null; try { date = new
		 * SimpleDateFormat("dd-mm-yy").parse(dob); System.out.println("convert"+date);
		 * } catch (ParseException e1) { // TODO Auto-generated catch block
		 * e1.printStackTrace(); }
		 */

		dao.addBirthday(fname, lname, dob);
		ResultSet rs = dao
				.getRows("select * from birthday where month( date)>month(curdate())||day( date)>day(curdate());");

		try {
			while (rs.next()) {
				System.out.println(rs.getString(1) + " ");
				pw.println(" <tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getDate(3)
						+ "</td></tr>");

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		pw.println("</table></center></body></center></html>");
	}

}