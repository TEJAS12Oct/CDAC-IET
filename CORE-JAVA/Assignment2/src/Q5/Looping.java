package Q5;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Balance : ");
		double balance = sc.nextDouble();

		while (true) {
			System.out.println("Press\n1 for Deposite \n2 for withdraw \n3 for show balance \n4 to quit");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("Enter the amount to deposite : ");
				int amount = sc.nextInt();
				balance = balance + amount;
				break;

			case 2:
				System.out.println("Enter the amount to withdraw : ");
				int Amount = sc.nextInt();
				if ((balance - Amount) < 100)
					System.out.println("Not Enough Balance");
				else
					balance = balance - Amount;
				break;

			case 3:
				System.out.println("Balance = " + balance);
				break;

			case 4:
				return; // it does break out of the loop and returns from the method.

			default:
				System.out.println("Wrong Choice Try again...");
				break;
			}
		}
	}

}
