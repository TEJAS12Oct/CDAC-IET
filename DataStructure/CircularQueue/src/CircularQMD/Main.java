package CircularQMD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int choice, N;

		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Your Size of  = ");

//		int size = sc.nextInt();
//
//		CircularQ Q = new CircularQ(size);
		CircularQ Q = new CircularQ();

		do {
			System.out.println("1.Insert");
			System.out.println("2.Remove");
			System.out.println("3.PRINT");
			System.out.println("4.EXIT");
			System.out.println("ENTER YOUR CHOICE");
			choice = sc.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("ENTER ELEMENT");
				N = sc.nextInt();
				Q.insert(N);

				break;
			}

			case 2: {

				Q.remove();
				break;
			}

			case 3: {
				// System.out.println(Q);
				Q.print();
				break;
			}

			default: {
				System.out.println("Invalid");
			}

			}

		} while (choice != 4);
	}

}
