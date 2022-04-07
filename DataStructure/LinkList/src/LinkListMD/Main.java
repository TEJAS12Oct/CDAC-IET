package LinkListMD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		Scanner sc = new Scanner(System.in);

		int Choice;

		do {
			System.out.println("Enter Your Choice   = ");
			System.out.println("1.Insert");
			System.out.println("2.Append");
			System.out.println("3.InserByPosition");
			System.out.println("4.Delete First");
			System.out.println("5.Delete Last");
			System.out.println("6.DeleteByPositon");
			System.out.println("7.Reverse");
			System.out.println("8.Samllest No");
			System.out.println("9.Biggest No");
			System.out.println("10.Even No");
			System.out.println("11.Odd No");
			System.out.println("12.Exit");
			Choice = sc.nextInt();

			switch (Choice) {
			case 1: {
				System.out.println("Enter  N =");
				int N = sc.nextInt();
				list.insert(N);
				System.out.println("Insert = " + list + "\n");
				break;
			}

			case 2: {
				System.out.println("Enter  N =");
				int N = sc.nextInt();
				list.append(N);
				System.out.println("Append  = " + list + "\n");
				break;
			}

			case 3: {
				System.out.println("Enter  N =");
				int N = sc.nextInt();
				System.out.println("Enter Position = ");
				int pos = sc.nextInt();
				list.insertByPosition(N, pos);
				System.out.println("Insert By Position = " + list + "\n");

			}

			case 4: {
				list.deleteFirst();
				System.out.println("DeleteFirst = " + list + "\n");
				break;
			}

			case 5: {
				list.deleteLast();
				System.out.println("Delete Last = " + list + "\n");
				break;
			}

			case 6: {
				System.out.println("Enter Position = ");
				int pos = sc.nextInt();
				list.deleteByPosition(pos);
				System.out.println("Delete By Position  = " + list + "\n");
			}

			case 7: {
				list.reverse();
				System.out.println("Reverse  = " + list + " \n");
				break;
			}

			case 8: {
				list.SmallestNo();
				break;
			}
			case 9: {
				list.biggestNo();
				break;
			}
			case 10: {
				list.even();
				System.out.println();
				break;
			}
			case 11: {
				list.odd();
				System.out.println();
				break;
			}

			default: {
				System.out.println("Invallid Choice ");
			}

			}

		} while (Choice != 12);

	}

}
