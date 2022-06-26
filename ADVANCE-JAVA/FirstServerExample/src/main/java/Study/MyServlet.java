package Study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// we are setting the http response header content type property
		response.setContentType("text/html");
	
		// we are connecting the printwriter to the response body
		PrintWriter PW = response.getWriter();
		
		Cookie[] cookies =request.getCookies();
		String color = "";
		for(Cookie cookie : cookies)
		{
			if( cookie.getName().equals("fav"))
			{
				color=cookie.getValue();
			}
		}
		
		//whatever we print here goes to http response body
		PW.println("<html><body bgcolor='"+color+"'>");
		PW.println("<h1>HTML GENERATED FROM SERVLET</h1>");
		PW.println("</body></html>");
		
		PW.close();
	}

}
