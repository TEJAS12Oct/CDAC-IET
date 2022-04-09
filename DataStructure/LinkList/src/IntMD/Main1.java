package IntMD;

import java.util.Scanner;

public class Main1 {
	static Scanner sc = new Scanner(System.in);
	static LinkList1 l = new LinkList1();

	public static void main(String[] args) {

		Menu_Operation();

	}

	public static void Menu_Operation() {
		int ch;
		do {
			System.out.println("*****************************************");
			System.out.println("0.Exit.....");
			System.out.println("1.Insert first");
			System.out.println("2.Insert last");
			System.out.println("3.Insert By Position");
			System.out.println("4.Delete first");
			System.out.println("5.Delete last");
			System.out.println("6.Delete By Position");
			System.out.println("7.Print  forward");
			System.out.println("8.Print  Reverse");
			System.out.println("9.Reverse linkedlist");
			System.out.println("10.Largest Elements");
			System.out.println("11.Smallest Elements");
			System.out.println("12.Even Elements");
			System.out.println("13.Odd elements");
			System.out.println("14.Display");
			System.out.println("15.Insert by value");
			System.out.println("----------------------------------------------");
			System.out.println("enter  your choice");
			ch = sc.nextInt();
			System.out.println("\n*********************************************");
			int data, pos;
			switch (ch) {
			case 1:
				System.out.print("enter element");
				data = sc.nextInt();
				l.insert(data);
				break;
			case 2:
				System.out.print("enter element");
				data = sc.nextInt();
				l.append(data);
				break;
			case 3:
				System.out.print("enter element");
				data = sc.nextInt();
				System.out.print("enter position");
				pos = sc.nextInt();
				l.Insert_By_Position(pos, data);
				break;

			case 4:
				l.deletefirst();
				break;
			case 5:
				l.delete_last();
				break;

			case 6:
				System.out.print("enter position");
				pos = sc.nextInt();
				l.Delete_By_Position(pos);
				break;

			case 7:
				l.print_forward();
				break;

			case 8:
				l.print_reverse();
				break;

			case 9:
				l.Reverse_likedlist();
				System.out.println(l);
				break;

			case 10:
				l.Biggest_Element();
				break;

			case 11:
				l.Smallest_Elements();
				break;

			case 12:
				l.even_elements();
				break;

			case 13:
				l.odd_elements();
				break;

			case 14:
				System.out.println(l);
				break;

			case 15:
				System.out.println("enter data ");
				data = sc.nextInt();
				System.out.println("After which element you want added new data");
				int nd = sc.nextInt();
				l.Insert_by_value(nd, data);
				break;

			default:
				System.out.println("Invalid Choice..Good Bye....!!");
				break;
			}

		} while (ch != 0);

	}

}
