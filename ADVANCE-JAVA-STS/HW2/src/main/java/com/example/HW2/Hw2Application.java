package com.example.HW2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import HW2.PersonBean;
import config.MyJavaConfig;

@SpringBootApplication
public class Hw2Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyJavaConfig.class);
		PersonBean bean = context.getBean("per", PersonBean.class);
		System.out.println("Person Details");
		System.out.println("Name:" + bean.getName());
		System.out.println("Age:" + bean.getAge());
		System.out.println("City:" + bean.getCity());
		System.out.println("Pin:" + bean.getPin() + "\n");

		ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
		PersonBean bean1 = (PersonBean) context1.getBean("person");
		System.out.println("Name : " + bean1.getName() + " , Age : " + bean1.getAge() + " , City : " + bean1.getCity()
				+ " , Pin : " + bean1.getPin());

	}
}
