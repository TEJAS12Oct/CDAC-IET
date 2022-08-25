package Study.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyWebController {

	public MyWebController() {
		System.out.println("the controller is created");
	}
//   http://localhost:8080/Hello
//   Then Page Go To  Hello.jsp then enter Name Then Page go to  Welcome url then go to  Hi.jsp
	@RequestMapping(value = "/Hello", method = RequestMethod.GET)
	public String f1() {
		System.out.println("mapping function f1 is called");
		return "Hello";
	}

	@GetMapping(value = "/welcome")
	public String f2(@RequestParam("uname") String name) {
		System.out.println("server got " + name);
		return "Hi";
	}
// //   http://localhost:8080/input
	@GetMapping(value = "/input")
	public String f3() {
		return "input";
	}

	@PostMapping(value = "/showTable")
	public String f4(Model model, @RequestParam int num) {
		ArrayList<String> al = TableGen.getTable(num);
		model.addAttribute("list", al);

		return "table";
	}

// http://localhost:8080/showchars?line=TejasJawale	
	@GetMapping(value = "/showchars") //
	public String f5(Model model, @RequestParam String line) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < line.length(); i++) {
			al.add("" + line.charAt(i));
		}
		model.addAttribute("list", al);
		return "table";
	}

	
// http://localhost:8080/showchars?line=Tejas
//	@GetMapping(value = "/showchars")
//	public ModelAndView f5(ModelAndView mv, @RequestParam String line) {
//		ArrayList<String> al = new ArrayList<String>();
//		for (int i = 0; i < line.length(); i++) {
//			al.add("" + line.charAt(i));
//		}
//
//		mv.addObject("list", al);
//		mv.setViewName("table");
//		return mv;
//	}

	/*
	 * public MyWebController() { System.out.println("the controller is created"); }
	 * 
	 * @RequestMapping(value = "/Hello", method = RequestMethod.GET) public String
	 * f1() { System.out.println("mapping function f1 is called"); return "Hello"; }
	 * 
	 * @GetMapping(value = "/welcome") public String f2(@RequestParam("uname")
	 * String name) { System.out.println("server got " + name); return "Hi"; }
	 * 
	 * @GetMapping(value = "/input") public String f3() { return "input.jsp"; }
	 * 
	 * @PostMapping(value = "/showTable") public String f4(Model
	 * model, @RequestParam int num) { ArrayList<String> al =
	 * TableGen.getTable(num); model.addAttribute("list", al);
	 * 
	 * return "table.jsp"; }
	 * 
	 * @GetMapping(value = "/showchars") public ModelAndView f5(ModelAndView
	 * mv, @RequestParam String line) { ArrayList<String> al = new
	 * ArrayList<String>(); for (int i = 0; i < line.length(); i++) { al.add("" +
	 * line.charAt(i)); }
	 * 
	 * mv.addObject("list", al); mv.setViewName("test.html"); return mv; }
	 * 
	 * @GetMapping("/thex") public String thex(Model m, @RequestParam String
	 * uname, @RequestParam String pass) { User u = new User(uname, pass);
	 * m.addAttribute("user", u); return "test2.html"; }
	 */

}
