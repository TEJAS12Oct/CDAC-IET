package Part2.MVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan({"study.iet.controller","cdac.test"})
@ImportResource({"classpath:beans.xml"})
public class Mvc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Mvc1Application.class, args);
	}

}
