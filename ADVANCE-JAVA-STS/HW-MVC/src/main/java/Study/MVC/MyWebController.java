package Study.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyWebController {

	public MyWebController() {
	}

	@RequestMapping(value = "/Input", method = RequestMethod.GET)
	public String f1() {
		return "Input";
	}

	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String f2() {
		return "Login";
	}
	
	@RequestMapping(value = "/DataInput", method = RequestMethod.GET)
	public String f3() {
		return "DataInput";
	}

}
