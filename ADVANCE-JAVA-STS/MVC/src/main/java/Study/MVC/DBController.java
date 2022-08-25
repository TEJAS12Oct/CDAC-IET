package Study.MVC;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DBController implements ApplicationContextAware {

	 @Autowired
	 JdbcTemplate template;
//  http://localhost:8080/add?pid=12&name=PD&cost=300
	@GetMapping("/add")
	public String f1(@RequestParam int pid, @RequestParam String name, @RequestParam int cost) {
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		template.update("insert into product values(?,?,?)", pid, name, cost);

		return "Hello";
	}

	ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;

	}

}