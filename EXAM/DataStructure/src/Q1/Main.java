/*

Q1. (28 marks)
Consider we have Employee class with empid, fullname and gender. Implement Queue using Linklist for above Employee class.
Write Menu driven (5 marks) program to perfrom below operations:
A. Insert Employee (3 marks)
B. Remove Employee (3 marks)
C. Print complete Queue using toString() (3 marks)
D. Print all Female employees (3 marks)
E. Print all Male employees (3 marks)
F. Empty Queue using recursion (4 marks)
G. Print Queue in reverse order (4 marks)

*/
package Q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int choice;
		Scanner sc = new Scanner(System.in);

		QueueLL Qll = new QueueLL();

		do {
			System.out.println("Enter Choice => ");
			System.out.println("0.Exit ");
			System.out.println("1.Insert ");
			System.out.println("2.Remove ");
			System.out.println("3.Print Employee ");
			System.out.println("4.Female Employee ");
			System.out.println("5.Male Employee ");
			System.out.println("6.Empty Recursion ");
			System.out.println("7.Reverse Order ");

			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("\nInsert Element  : ");
				System.out.println("Enter Name =");
				String Name = sc.next();
				System.out.println("Enter Id = ");
				int Id = sc.nextInt();
				System.out.println("Enter Gender = ");
				char Gender = sc.next().charAt(0);

				Employee E = new Employee(Name, Id, Gender);
				Qll.Insert(E);
				System.out.println("Employee Information = " + Name + " ," + Id + " ," + Gender + "\n");
				break;
			}

			case 2: {
				Qll.Remove();
				System.out.println("After Remove Information = \n" + Qll + "\n");
				break;

			}
			case 3: {
				System.out.println("Print Employee Information : \n" + Qll + "\n");
				break;
			}

			case 4: {
				System.out.println("Female Employee Information : ");
				Qll.PrintFemale(Qll);
				System.out.println();
				break;
			}

			case 5: {
				System.out.println("Male Employee Information : ");
				Qll.PrintMale(Qll);
				System.out.println();
				break;
			}

			case 6: {
				System.out.println("Empty Recursion : ");
				Qll.EmptyRecursion();
				System.out.println(Qll);
				break;
			}

			case 7: {
				System.out.println("Reverse Order : ");
				Qll.ReversePrint();
				System.out.println(Qll);
				break;
			}
			default: {
				System.out.println("Invalid choice ..");
				break;
			}
			}
		} while (choice != 0);

	}

}
