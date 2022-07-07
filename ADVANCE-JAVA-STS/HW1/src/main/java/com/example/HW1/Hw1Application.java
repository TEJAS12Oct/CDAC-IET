package com.example.HW1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import HW1.ProductBean;

public class Hw1Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		ProductBean bean1 = (ProductBean) context.getBean("HW1");

		System.out.println("Product : " + bean1.getName() + " , Description : " + bean1.getDescription() + " , Cost : "
				+ bean1.getCost());

		bean1.setCost(90);
		System.out.println("Change Cost Of Product : " + bean1.getCost());
		System.out.println("Product : " + bean1.getName() + " , Description : " + bean1.getDescription() + " , Cost : "
				+ bean1.getCost());
		System.out.println();

		ProductBean bean2 = (ProductBean) context.getBean("HW1");
		bean2.setCost(100);
		System.out.println("Change Cost Of Product  Bean2: " + bean2.getCost());
		System.out.println("Product : " + bean2.getName() + " , Description : " + bean2.getDescription() + " , Cost : "
				+ bean2.getCost());
		System.out.println();

		ProductBean bean3 = (ProductBean) context.getBean("HW1");
		bean3.setCost(120);
		System.out.println("Change Cost Of Product  Bean3: " + bean3.getCost());
		System.out.println("Product : " + bean3.getName() + " , Description : " + bean3.getDescription() + " , Cost : "
				+ bean3.getCost());
	}

}
