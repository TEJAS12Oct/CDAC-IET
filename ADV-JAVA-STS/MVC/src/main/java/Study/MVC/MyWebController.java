package Study.MVC;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyWebController {

	public MyWebController() {
		System.out.println("the controller is created");
	}

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

	@GetMapping(value = "/input")
	public String f3() {
		return "input.jsp";
		// spring.mvc.view.prefix=WEB-INF/views/
		// spring.mvc.view.suffix=.jsp
		// then add in application property
		// then u dont write in return "input.jsp"only write "input"
	}

	@PostMapping(value = "/showTable")
	public String f4(Model model, @RequestParam int num) {
		ArrayList<String> al = TableGen.getTable(num);
		model.addAttribute("list", al);

		return "table.jsp";
		// spring.mvc.view.prefix=WEB-INF/views/
		// spring.mvc.view.suffix=.jsp
		// then add in application property
		// then u dont write in return "table.jsp"only write "table"

	}

	@GetMapping(value = "/showchars")
	public ModelAndView f5(ModelAndView mv, @RequestParam String line) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < line.length(); i++) {
			al.add("" + line.charAt(i));
		}

		mv.addObject("list", al);
		mv.setViewName("table");
		return mv;
	}

	

}
