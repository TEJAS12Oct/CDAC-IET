package EmployeeQueueLLMD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);

		QueueLL Qll = new QueueLL();
		do {
			System.out.println("Enter Choice =");
			System.out.println("1.Insert");
			System.out.println("2.Remove");
			System.out.println("3.print");
			System.out.println("4.Exit");

			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter Name=");
				String name = sc.next();
				System.out.println("Enter id = ");
				int id = sc.nextInt();
				System.out.println("Enter gender = ");
				char gender = sc.next().charAt(0);
				
				Employee E = new Employee(name, id, gender);
				Qll.insert(E);
				break;
			}

			case 2: {
				Qll.Remove();
				System.out.println("Remove = " + Qll);
				break;

			}
			case 3: {
				System.out.println(Qll);
				break;
			}
			}
		} while (choice != 4);

	}

}
