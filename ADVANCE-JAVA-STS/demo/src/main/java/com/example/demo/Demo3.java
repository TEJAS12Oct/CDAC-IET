package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Study.Beans.MessageBean;

public class Demo3 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		MessageBean bean = context.getBean(MessageBean.class);
		
		System.out.println(bean.getMessage()+" sender:"+bean.getSenderName());
		System.out.println("city of receiver :"+bean.getReceiverAddress().getCity());

	}

}
// To show error => MessageBean bean = context.getBean(MessageBean.class); 
// Not wtite "msg" in Round Bracket 