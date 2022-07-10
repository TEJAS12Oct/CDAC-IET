package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Study.Beans.MessageBean;

public class demo6 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//		MessageBean bean = context.getBean("msg2", MessageBean.class);
//		System.out.println(bean.getMessage() + " , " + bean.getSenderName() + " , " + bean.getReceiverAddress().getCity());
//
//		MessageBean bean1 = context.getBean("msg3", MessageBean.class);
//		System.out.println(bean1.getMessage() + " , " + bean1.getSenderName() + " , " + bean1.getReceiverAddress().getCity());

		MessageBean bean1 = context.getBean("msg4", MessageBean.class);
		System.out.println("Msg : " + bean1.getMessage() + " , Sender : " + bean1.getSenderName() + " , City : "
				+ bean1.getReceiverAddress().getCity());

	}

}
