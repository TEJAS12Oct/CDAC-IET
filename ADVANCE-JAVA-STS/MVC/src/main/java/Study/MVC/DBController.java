package Study.MVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DBController {
	
	@Autowired
	JdbcTemplate template;
	
	@GetMapping("/add")
	public String f1(@RequestParam int pid,@RequestParam String name,@RequestParam int cost)
	{
		template.update("insert into product values(?,?,?)",pid,name,cost);
		
		return "Hello";
	}

	
	
	
}
