package Study.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyWebController {

	public MyWebController() {
	}
// Birthday Goes to Add in DBController
//  http://localhost:8080/Input	
	@RequestMapping(value = "/Input", method = RequestMethod.GET)
	public String f1() {
		return "Input";
	}
// http://localhost:8080/Login
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String f2() {
		return "Login";
	}
// // http://localhost:8080/DataInput	
	@RequestMapping(value = "/DataInput", method = RequestMethod.GET)
	public String f3() {
		return "DataInput";
	}

}
