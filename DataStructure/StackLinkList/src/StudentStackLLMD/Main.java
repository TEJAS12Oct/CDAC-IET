package StudentStackLLMD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);

		StackLL Sll = new StackLL();
		do {
			System.out.println("Enter Choice =");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.print");
			System.out.println("4.Exit");

			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter Name=");
				String Name = sc.next();
				System.out.println("ENter Age = ");
				int age = sc.nextInt();
				System.out.println("Enter Marks = ");
				int Marks = sc.nextInt();
				Student E = new Student(Name, age, Marks);
				Sll.push(E);
				break;
			}

			case 2: {
				Sll.pop();
				System.out.println("Pop = " + Sll);
				break;

			}
			case 3: {
				System.out.println(Sll);
				break;
			}
			}
		} while (choice != 4);

	}

}
