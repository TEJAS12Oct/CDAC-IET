package config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import HW2.PersonBean;

//name,age,city,pin
@ConfigurationProperties

public class MyJavaConfig {
	@Bean(value = "per")
	public PersonBean getper() {
		PersonBean bean = new PersonBean();
		bean.setName("Krishna");
		bean.setAge("25");
		bean.setCity("Madhura");
		bean.setPin("123456");

		return bean;
	}

}
