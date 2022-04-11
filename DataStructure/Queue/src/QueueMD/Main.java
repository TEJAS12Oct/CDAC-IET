package QueueMD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of  Q1 = ");
		int size = sc.nextInt();
		Queue q1 = new Queue(size);

		int choice = 0, N;

		do {
			System.out.println("1.INSERT");
			System.out.println("2.REMOVE");
			System.out.println("3.DISPLAY");
			System.out.println("4.EXIT");
			System.out.println("Enter Your Choice = ");
			choice = sc.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("ENTER ELEMENT");
				N = sc.nextInt();
				q1.insert(N);

				break;
			}
			case 2: {
				q1.remove();

				break;
			}
			case 3: {
				//System.out.println(q1);
				q1.print();
			}

			default: {
				System.out.println("INVALID");
			}
			}
		} while (choice != 4);

	}
}
