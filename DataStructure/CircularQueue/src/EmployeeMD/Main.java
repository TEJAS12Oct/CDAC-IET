package EmployeeMD;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter size");
		int size = sc.nextInt();

		Employee e1 = null;
		int ch;
		Queue q1 = new Queue(size);

		do {

			System.out.println("1.Insert");
			System.out.println("2.Remove");
			System.out.println("3.Display");
			System.out.println("0.exit");
			System.out.println("Enter your choice between 0-3");
			ch = sc.nextInt();

			switch (ch) {
			case 1:

				System.out.println("Emplyee name");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("enter id");
				int id = sc.nextInt();
				System.out.println("enter salary");
				int sal = sc.nextInt();
				e1 = new Employee(id, sal, name);
				q1.insert(e1);
				break;

			case 2:
				q1.remove();
				
				break;
			case 3:
				System.out.println(q1);
				q1.print();
				break;

			default:
				System.out.println("Invalid choice");
				break;

			}
		} while (ch != 0);
	}
}
