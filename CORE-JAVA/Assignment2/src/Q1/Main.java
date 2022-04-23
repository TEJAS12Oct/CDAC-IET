package Q1;

import java.util.Scanner;

public class Main {

	static Product[] arr;
	static int Position;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		arr = new Product[10];

		arr[0] = new Product("AAA", "ZZZ", 50, (new MyDate(1, 1, 2001)));
		arr[1] = new Product("BBB", "YYY", 150, (new MyDate(2, 2, 2002)));
		arr[2] = new Product("CCC", "XXX", 250, (new MyDate(3, 3, 2003)));
		arr[3] = new Product("DDD", "WWW", 350, (new MyDate(4, 4, 2004)));
		arr[4] = new Product("EEE", "VVV", 450, (new MyDate(5, 5, 2005)));
		arr[5] = new Product("FFF", "UUU", 550, (new MyDate(6, 6, 2006)));
		arr[6] = new Product("GGG", "TTT", 650, (new MyDate(7, 7, 2007)));
		arr[7] = new Product("HHH", "SSS", 750, (new MyDate(8, 8, 2008)));
		arr[8] = new Product("III", "RRR", 850, (new MyDate(9, 9, 2009)));
		arr[9] = new Product("JJJ", "QQQ", 950, (new MyDate(10, 10, 2010)));

		int choice = 0;

		do {
			System.out.println("0.Exit");
			System.out.println("1.Modify A Product");
			System.out.println("2.Show All Product");
			System.out.println("3.Total Cost Of All Product");
			System.out.println("4.Show Name  OF Product");
			System.out.println("5.Remove Product");
			System.out.println("Enter Choice =  ");

			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {

			case 1: {
				Modify_Product();
				break;
			}
			case 2: {
				Print_Product();
				break;
			}
			case 3: {
				Total_Cost();

				break;
			}
			case 4: {
				Show_Name_Product();
				break;
			}
			case 5: {
				Remove();
				break;
			}
			default: {
				System.out.println("Invalid Choice .....");
			}
			}
		} while (choice != 0);

	}

	private static void Modify_Product() {
		int index, ch, cost;
		String name, desc;
		int DD, MM, YY;
		MyDate dd;

		System.out.println("Enter which product index to modify");
		index = sc.nextInt();

		System.out.println("1.Name");
		System.out.println("2.Description");
		System.out.println("3.price ");
		System.out.println("4. Modify Date ");
		System.out.println("****************************************");
		System.out.println("Enter which property u want to modify");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter name of product");
			sc.nextLine();
			name = sc.nextLine();
			arr[index].setName(name);
			break;
		case 2:
			System.out.println("Enter new description");
			sc.nextLine();
			desc = sc.nextLine();
			arr[index].setDescrip(desc);
			break;
		case 3:
			System.out.println("Enter new cost");
			cost = sc.nextInt();
			arr[index].setCost(cost);
			break;
		case 4:
			System.out.println("Enter date : Day");
			DD = sc.nextInt();
			System.out.println("month: ");
			MM = sc.nextInt();
			System.out.println("Year");
			YY = sc.nextInt();
			dd = new MyDate(DD, MM, YY);
			arr[index].setExpiryDate(dd);
			break;
		default: {
			System.out.println("invalid choice");
			break;
		}
		}

	}

	private static void Print_Product() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null)
				System.out.println(arr[i].getName() + " ," + arr[i].getDescrip() + " , " + arr[i].getCost() + " , "
						+ arr[i].ExpiryDate.getDate() + "-" + arr[i].ExpiryDate.getMonth() + "-"
						+ arr[i].ExpiryDate.getYear());
		}
		System.out.println();
	}

	private static void Total_Cost() {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i].getCost();
		}
		System.out.println("Total Cost = " + total);
	}

	private static void Show_Name_Product() {
		System.out.println("Name Of All Product : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getName() != null)
				System.out.println(arr[i].getName() + " ");
		}
		System.out.println();
	}

	private static void Remove() {
		System.out.println("Enter index of product u want to make null");
		int index = sc.nextInt();
		arr[index] =null;

//		arr[index].setName(null);
//		arr[index].setDescrip(null);
//		arr[index].setCost(0);
//		arr[index].setExpiryDate(null);
//		arr[index].getExpiryDate().setDate(0);
//		arr[index].getExpiryDate().setMonth(0);
//		arr[index].getExpiryDate().setYear(0);
	}

}
