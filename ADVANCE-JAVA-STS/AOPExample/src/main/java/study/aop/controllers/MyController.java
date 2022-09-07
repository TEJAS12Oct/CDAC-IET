package study.aop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/hi")
	public String f1()
	{
		return "Hello...";
	}
}
