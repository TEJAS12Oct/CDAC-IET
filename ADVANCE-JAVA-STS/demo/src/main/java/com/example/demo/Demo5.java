package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Study.Beans.BookBean;
import Study.Beans.MessageBean;

public class Demo5 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("study.beans","some.other");  //this will search the package classes and see if any class is annotated by @Component
		context.refresh();
		
		
		BookBean bean = context.getBean(BookBean.class);
		System.out.println(bean.getName()+"  "+bean.getCost());

	}

}
