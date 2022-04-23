package SelectionStudentMD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i, choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();

		Student[] students = new Student[size];

		for (i = 0; i < size; i++) {
			System.out.println("Enter Name = ");
			String Name = sc.next();

			System.out.println("Enter Age = ");
			int age = sc.nextInt();

			System.out.println("Enter  Gender = ");
			char gender = sc.next().charAt(0);

			System.out.println("Enter Marks = ");
			int Marks = sc.nextInt();

			Student s1 = new Student(Name, age, gender, Marks);
			students[i] = s1;
		}

		do {
			System.out.println("1.Display");
			System.out.println("2.Name Ascending");
			System.out.println("3.Name Decending");
			System.out.println("4.Age Ascending");
			System.out.println("5.Age Decending");
			System.out.println("6.Marks Ascending");
			System.out.println("7.Marks Decending");
			System.out.println("8.Exit");

			System.out.println("ENter Your Choice 1 To 7 = ");
			choice = sc.nextInt();

			switch (choice) {

			case 1: {
				System.out.println("******************Display Information Student **************");
				Student.print(students);
				break;
			}

			case 2: {
				Student.NameAscending(students);
				Student.print(students);
				break;
			}

			case 3: {
				Student.NameDecending(students);
				Student.print(students);
				break;
			}

			case 4: {
				Student.AgeAscending(students);
				Student.print(students);
				break;
			}
			case 5: {
				Student.AgeDecending(students);
				Student.print(students);
				break;
			}

			case 6: {
				Student.MarksAscending(students);
				Student.print(students);
				break;
			}

			case 7: {
				Student.MarksDecending(students);
				Student.print(students);
				break;
			}

			default: {
				System.out.println(" Invalid Choice ");
			}

			}

		} while (choice != 8);

	}

}
