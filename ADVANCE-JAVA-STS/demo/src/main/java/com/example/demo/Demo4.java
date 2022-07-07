package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Study.Beans.MessageBean;
import config.MyJavaConfig;

public class Demo4 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyJavaConfig.class);

		// MessageBean bean1 = context.getBean("msg",MessageBean.class);
		MessageBean bean1 = context.getBean("msg2", MessageBean.class);

		System.out.println(bean1.getMessage() + "  " + bean1.getSenderName());
		System.out.println("Address : " + bean1.getReceiverAddress().getCity());

		// MessageBean bean2 = context.getBean("msg",MessageBean.class);

	}

}
