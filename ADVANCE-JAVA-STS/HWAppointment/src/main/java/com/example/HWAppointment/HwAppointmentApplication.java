package com.example.HWAppointment;

import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Study.Bean.DAOBeanUsingJDBCTemplate;

public class HwAppointmentApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("Study.Bean", "com.config");
		context.refresh();
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		DAOBeanUsingJDBCTemplate bean = context.getBean(DAOBeanUsingJDBCTemplate.class);
		do {
			System.out.println("1.Add Appointment\n" + "2.Update Appointment purpose\n" + "3.Show all Appointments\n"
					+ "4.show appointments for a given user\n" + "5.quit\n");
			System.out.println("Enter your choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1: {
				System.out.println("Enter id,date(yyyy-mm-dd),purpose,type(official/unofficial),start time,end time");
				String name = sc.next();
				String date = sc.next();
				String purpose = sc.next();
				String type = sc.next();
				String start = sc.next();
				String end = sc.next();

				bean.addApoint(name, date, purpose, type, start, end);
				System.out.println("Your Appointment Saved");
				break;
			}
			case 2: {
				System.out.println("Enter Name and purpose");
				String name = sc.next();
				String purpose = sc.next();

				bean.updateApoint(name, purpose);
				break;

			}
			case 3: {

				bean.showAppoint().stream().forEach((p) -> {
					System.out.println(p);
				});
				break;
			}
			case 4: {
				// show appointment for given user
				System.out.println("Enter Name:");
				String name = sc.next();
				bean.showAppoint(name);
				bean.showAppoint().stream().forEach((p) -> {
					System.out.println(p);
				});
				break;
			}
			case 5: {
				break;
			}

			}// switch closing

		} while (ch != 6); // while closing

	}// psvm

}// Appointment closing
