package Q4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddCost")
public class TotalCost extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		DAO dao = new DAO();
		ResultSet rs = dao.getRows("select * from product");

		pw.println("<html><body>");
		pw.println("<form method='POST'>");
		pw.println("<table border='2'>");

		int TotalCost = 0;
		try {
			while (rs.next()) {
				int cost = rs.getInt(3);
				TotalCost = TotalCost + cost;
			}
			pw.println("<h1>Toatl Cost is : "+ TotalCost);

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		pw.close();

	}

}
