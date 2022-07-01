package com.cdac.HW30June;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import study.bean.DAOBean;

import study.bean.DAOBeanUsingTemplate;

public class Hw30JuneApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("study.bean", "com.cdac.config");
		context.refresh();

		DAOBeanUsingTemplate bean2 = context.getBean(DAOBeanUsingTemplate.class);
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("----Enter Choice----");
			System.out.println("1.Book Appointment");
			System.out.println("2.Update Appointment");
			System.out.println("3.View Appointment");
			System.out.println("4.Show-User Appointment");
			System.out.println("5.Exit");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Name Password and Reason");
				bean2.insert(sc.next(), sc.next(), sc.next());
				break;

			case 2:
				System.out.println("Enter Name and Reason");
				bean2.update(sc.next(), sc.next());
				break;

			case 3:

				bean2.getAppointment().stream().forEach((p) -> {
					System.out.println(p);
				});
				break;

			case 4:
				System.out.println("Enter User ");
				String username = sc.next();
				bean2.getAppointment().stream().forEach((p) -> {
					if (p.getName().equals(username))
						System.out.println(p);
				});
				break;

			default:
				System.out.println("Invalid Choice........");
				break;

			}

		} while (choice != 5);

	}

}
