package Study.MVC;

import java.util.List;
import Study.MVCDO.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Study.MVCDO.Birthday;

@Controller
public class DBController {

	@Autowired
	JdbcTemplate template;

	@GetMapping("/add")
	public ModelAndView F1(ModelAndView mv, @RequestParam String Fname, @RequestParam String Lname,
			@RequestParam String DOB) {
		template.update("insert into birthday (Fname , Lname, DOB) values(?,?,?)", Fname, Lname, DOB);
		System.out.println("Add Succesfully...!!!");

		List<Birthday> list = template.query("select id from  birthday where Fname ", (rs, rownum) -> {
			return new Birthday(rs.getInt(1));
		});
		mv.addObject("al", list);
		mv.setViewName("Input");
		return mv;

	}

	@GetMapping("/Welcome")
	public String f2(Model model, @RequestParam String username, @RequestParam String password) {
		String F = "";
		if (username.equals("Tejas") && password.equals("123")) {
			System.out.println("Login Succesfully...!!!");
			return "Home";
		} else {
			model.addAttribute("al", F);
			return "Login";

		}

	}

	@GetMapping(value = "/scan")
	public ModelAndView f3(ModelAndView mv, @RequestParam String dob1, @RequestParam String dob2) {
		System.out.println(dob1);

		List<Birthday> list = template.query(
				"select Fname, Lname from  birthday where DOB between '" + dob1 + "' and '" + dob2 + "' ",
				(rs, rownum) -> {
					return new Birthday(rs.getString(1), rs.getString(2));
				});
		mv.addObject("al", list);
		mv.setViewName("scan");
		return mv;

	}

}
