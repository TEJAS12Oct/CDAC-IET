package com.example.db2;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Study.Bean.DAOBean;
import Study.Bean.DAOBeanUsingJDBCTemplate;

public class Db2Application {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		DAOBean bean = context.getBean("b1", DAOBean.class);
//		bean.insert(4, "Battery", 750);
		bean.show();

		DAOBeanUsingJDBCTemplate Bean1 = context.getBean("t1", DAOBeanUsingJDBCTemplate.class);
//		Bean1.insert(5, "Mouse", 1500);
//		Bean1.show();

	}

}
