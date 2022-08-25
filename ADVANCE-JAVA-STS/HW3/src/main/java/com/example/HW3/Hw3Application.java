package com.example.HW3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import HW3.AccountBean;;

public class Hw3Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("HW3");
		context.refresh();

		AccountBean bean1 = context.getBean(AccountBean.class);
		bean1.setAccNo("1234");
		bean1.setBalance(10);

		System.out.println("Accocut No:" + bean1.getAccNo());
		System.out.println("Balance:" + bean1.getBalance());

		AccountBean bean2 = context.getBean(AccountBean.class);
		bean2.setAccNo("300");
		bean2.setBalance(56);

		System.out.println("Accocut No:" + bean2.getAccNo());
		System.out.println("Balance:" + bean2.getBalance());
	}

}
