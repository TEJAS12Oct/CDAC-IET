package study.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {

//	http://localhost:8080/ex1?name=abc
	@GetMapping("/ex1")
	public String f1(Model m,@RequestParam String name)
	{
		if(name.equals("abc"))
		    return "first.html";
		else {
			m.addAttribute("name", name);
			return "second.html";
		}
	}
	
	
// http://localhost:8080/showchars?line=Tejas Jawale
	@GetMapping(value="/showchars")
	public ModelAndView f5(ModelAndView mv,@RequestParam String line)
	{
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<line.length();i++)
		{
			al.add(""+line.charAt(i));
		}
		
		mv.addObject("list",al);
		mv.setViewName("ex.html");
		return mv;
	}
	
// http://localhost:8080/tryif?num=49	
	@GetMapping("/tryif")
	public String f3(Model m,@RequestParam int num)
	{
		m.addAttribute("num", num);
		return "ifex.html";
	}
	
	@GetMapping("/thex")
	public String thex(Model m, @RequestParam String uname, @RequestParam String pass) {
		User u = new User(uname, pass);
		m.addAttribute("user", u);
		return "test2.html";
	}
	
	
	
	
	
	
}
