package study.aop;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import study.aop.beans.AccountBean;


@SpringBootApplication
public class AopExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =   SpringApplication.run(AopExampleApplication.class, args);
		
		//caller
		AccountBean bean = ctx.getBean(AccountBean.class);
		
		System.out.println("the balance is  "+bean.getBalance());
		
		bean.withdraw(1500);
		
		bean.withdraw(2500);
			
	}
	
	@Bean
	public AccountBean f1()
	{
		AccountBean b = new AccountBean();
		b.setAccountId(123);
		b.setBalance(10000);
		return b;
	}
	
	
	
	
	

}
