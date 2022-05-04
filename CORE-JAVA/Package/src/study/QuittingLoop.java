package study;

import java.util.Scanner;

public class QuittingLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// WHEN u dont know how many times the loop may run
		boolean flag = true;
		while (flag) {
			System.out.println("1.continue \n 2. quit ");
			int choice = sc.nextInt();

			if (choice == 2)
				// return;
				// flag = false;
				// System.exit(0); //terminate the program
				break; // come out of loop

		}

		System.out.println("LOOP KE BAHAR");

	}

}
