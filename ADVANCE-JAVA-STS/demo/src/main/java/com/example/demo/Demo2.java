package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Study.Beans.MessageBean;

public class Demo2 {

	public static void main(String[] args) {
		// SPRING CONTAINER is INITIATED --- iit will read bean.xml
		// it will find bean info
		// it will create bean object
		// it set bean properties
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//		MessageBean bean = (MessageBean) context.getBean("msg");
//		System.out.println("Message : " + bean.getMessage() + " , Sender Name : " + bean.getSenderName());
	
		
		// Container yaane context , usko bean maang rahe hai --- getBean
		// kaun si bean --- jiska naam msg hai
		// MessageBean bean = (MessageBean)context.getBean("msg");

		// Another way to ask for the bean --- we dont have to typecast
		MessageBean bean1 = context.getBean("msg", MessageBean.class);

		System.out.println("bean1 :" + bean1.getMessage() + "  " + bean1.getSenderName());

		// CALLING getbean second time
		MessageBean bean2 = context.getBean("msg", MessageBean.class);

		System.out.println("bean2 :" + bean2.getMessage() + "  " + bean2.getSenderName());

		bean1.setSenderName("india");

		System.out.println("after changing bean 1");
		System.out.println("bean1 :" + bean1.getMessage() + "  " + bean1.getSenderName());
		System.out.println("bean2 :" + bean2.getMessage() + "  " + bean2.getSenderName());

	}

}
