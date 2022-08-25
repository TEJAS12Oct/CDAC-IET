package Study.MVC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyItemController {
	
	
	@RequestMapping(value="/inputitem" , method = RequestMethod.GET)
	public String f1(HttpServletRequest request)
	{
		HttpSession session=request.getSession();
		 if(session.isNew())
		  {
			 List<String> ls1=new ArrayList<String>();
		     session.setAttribute("list", ls1);
		  }
	   return "inputitem";
	}
	
	List<String> ls=new ArrayList<String>();

	@PostMapping(value="/itemcart")
	public ModelAndView getProducts(ModelAndView mv,@RequestParam ("item") String item,HttpServletRequest request)
	{
		
	   HttpSession session=request.getSession();
	   List<String> ls1= ((ArrayList<String>)session.getAttribute("list"));
	   ls1.add(item);
	
	 
	  ls.add(item);
	  session.setAttribute("list", ls1);
	  mv.addObject("globalProduct",ls);
	  mv.setViewName("itemcart");
	  return mv;
		
		
		
	}
	
	

}
