package CAFE;

import java.util.Scanner;

public class cafe {
	static int bill;

	public static void main(String[] args) {

		int ch, bill = 0;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("1.Cold Drinks");
			System.out.println("2.Hot Drinks");
			System.out.println("3.Snack");
			System.out.println("4.Ice  Crem");
			System.out.println("5.Exit");
			System.out.println("Enter your choice (1-5) = ");
			ch = sc.nextInt();
			if (ch == 5)
				return;

			switch (ch) {
			case 1: {
				Cold_Drinks(bill);

				break;
			}
			case 2: {
				Hot_Drinks(bill);

				break;
			}
			case 3: {
				snacks(bill);

				break;
			}
			case 4: {
				Iceceram(bill);

				break;
			}

			default: {
				System.out.println("Invalid Choice  Enter Choice (1-5)");
			}

			}

		} while (ch != 5);
		System.out.println("Bye Bye");

	}

	static int Cold_Drinks(int num) {
		int ch, qty = 0;

		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("1.Coke");
			System.out.println("2.Thumbs Up");
			System.out.println("3.Sprite");
			System.out.println("4.Mirinda");
			System.out.println("5.Exit");
			System.out.println("Enter your choice (1-5) = ");
			ch = sc.nextInt();
			if (ch == 5)
				return num;
			if ((ch >= 1) && (ch <= 4)) {
				System.out.println("\nEnter the Quantity =  ");
				qty = sc.nextInt();
			}

			switch (ch) {

			case 1: {
				int Price = 20;
				System.out.println("Price  of Coke " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total Bill = " + bill);

				break;
			}
			case 2: {
				int Price = 25;
				System.out.println("Price  of Thumbs Up " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total Bill = " + bill);

				break;

			}
			case 3: {
				int Price = 22;
				System.out.println("Price  of Sprite " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total Bill = " + bill);

				break;
			}
			case 4: {
				int Price = 15;
				System.out.println("Price  of Mirinda " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Mirinda Bill = " + bill);

				break;
			}
			default: {
				System.out.println("Invalid Choice  Enter Choice (1-5)");
			}

			}

		} while (ch != 5);
		System.out.println("Exit");

		return bill;
	}

	static int Hot_Drinks(int num) {
		int ch, qty = 0;

		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("1.Tea");
			System.out.println("2.Coffee");
			System.out.println("3.Soup");
			System.out.println("4.Exit");
			System.out.println("Enter your choice (1-4) = ");
			ch = sc.nextInt();
			if (ch == 4)
				return num;
			if ((ch >= 1) && (ch <= 3)) {
				System.out.println("\nEnter the Quantity =  ");
				qty = sc.nextInt();
			}

			switch (ch) {

			case 1: {
				int Price = 10;
				System.out.println("Price  of Tea " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total Bill = " + bill);

				break;
			}
			case 2: {
				int Price = 25;
				System.out.println("Price  of Coffee " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total Bill = " + bill);

				break;

			}
			case 3: {
				int Price = 50;
				System.out.println("Price  of Soup " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total = " + bill);

				break;
			}

			default: {
				System.out.println("Invalid Choice  Enter Choice (1-3)");
			}

			}

		} while (ch != 4);
		System.out.println("Exit");

		return bill;

	}

	static int snacks(int num) {
		int ch, qty = 0;

		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("1.Samosa");
			System.out.println("2.Kachori");
			System.out.println("3.VadaPav");
			System.out.println("4.Dabeli");
			System.out.println("5.Idali");
			System.out.println("6.Exit");
			System.out.println("Enter your choice (1-6) = ");
			ch = sc.nextInt();
			if (ch == 6)
				return num;
			if ((ch >= 1) && (ch <= 5)) {
				System.out.println("\nEnter the Quantity =  ");
				qty = sc.nextInt();
			}

			switch (ch) {

			case 1: {
				int Price = 12;
				System.out.println("Price  of Samosa " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total Bill = " + bill);

				break;
			}
			case 2: {
				int Price = 15;
				System.out.println("Price  of Kachori " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total Bill = " + bill);

				break;

			}
			case 3: {
				int Price = 20;
				System.out.println("Price  of VadaPav " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("VadaPav Bill = " + bill);

				break;
			}
			case 4: {
				int Price = 25;
				System.out.println("Price  of Dabeli " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total Bill = " + bill);

				break;
			}
			case 5: {
				int Price = 30;
				System.out.println("Price  of Idali " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total Bill = " + bill);

				break;
			}

			default: {
				System.out.println("Invalid Choice  Enter Choice (1-5)");
			}

			}

		} while (ch != 6);
		System.out.println("Exit");
		return bill;
	}

	static int Iceceram(int num) {
		int ch, qty = 0;

		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("1.Chocolate");
			System.out.println("2.Vanila");
			System.out.println("3.Pista");
			System.out.println("4.Mango");
			System.out.println("5.Exit");
			System.out.println("Enter your choice (1-4) = ");
			ch = sc.nextInt();
			if (ch == 5)
				return num;
			if ((ch >= 1) && (ch <= 4)) {
				System.out.println("\nEnter the Quantity =  ");
				qty = sc.nextInt();
			}

			switch (ch) {

			case 1: {
				int Price = 30;
				System.out.println("Price  of Chocolate " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total Bill = " + bill);

				break;
			}
			case 2: {
				int Price = 20;
				System.out.println("Price  of Vanila " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total Bill = " + bill);

				break;

			}
			case 3: {
				int Price = 25;
				System.out.println("Price  of Pista " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total Bill = " + bill);

				break;
			}
			case 4: {
				int Price = 35;
				System.out.println("Price  of Dabeli " + Price + "\n");

				bill = bill + (qty * Price);
				System.out.println("Total Bill = " + bill);

				break;
			}

			default: {
				System.out.println("Invalid Choice  Enter Choice (1-4)");
			}

			}

		} while (ch != 5);
		System.out.println("Exit");
		return bill;
	}

}
