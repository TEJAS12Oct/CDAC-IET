package com.cdac.DB;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Study.Bean.DAOBean;
import Study.Bean.DAOBeanUsingJDBCTemplate;

public class DbApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("Study.Bean", "com.cdac.config");
		context.refresh();

		DAOBean bean = context.getBean(DAOBean.class);
//		bean.insert(2, "Laptop", 50000);
		bean.showAllRecords();

//		DAOBeanUsingJDBCTemplate Bean1 = context.getBean(DAOBeanUsingJDBCTemplate.class);
//		Bean1.insert(3, "HeadPhones", 2500);

//		Bean1.getProducts().stream().forEach((p) -> {
//			System.out.println(p);
//		});

	}

}
