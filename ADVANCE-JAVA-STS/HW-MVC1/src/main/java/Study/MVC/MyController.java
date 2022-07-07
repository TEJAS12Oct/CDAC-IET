package Study.MVC;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController 
{
	
	@GetMapping("/inputitem")
	public String f1(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		if(session.isNew())
		{
			ArrayList<String> al = new ArrayList<>();
			session.setAttribute("list", al);
		}
		return "inputitem";
	}
	
	
	@GetMapping("/save")
	public String f2(HttpServletRequest request, @RequestParam String item)
	{
		HttpSession session = request.getSession();
		ArrayList<String> al = (ArrayList) session.getAttribute("list");
		
		al.add(item);
		session.setAttribute("list", al);
		return "show";
	}
}
