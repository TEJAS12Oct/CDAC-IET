package StudentMenuDriven;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size of stack");
		int size = sc.nextInt();
		Student s1;
		int ch;
		Stack st1 = new Stack(size);
		do {

			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.Display");
			System.out.println("0.exit");
			System.out.println("Enter your choice between 0-3");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("enter name of student");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("enter gender");
				char g = sc.next().charAt(0);
				s1 = new Student(name, age, g);
				st1.push(s1);
				break;

			case 2:
				st1.pop();
				break;
			case 3:
				System.out.println(st1);
				break;

			default:
				System.out.println("Invalid choice");
				break;

			}
		} while (ch != 0);
		sc.close();

	}
}
