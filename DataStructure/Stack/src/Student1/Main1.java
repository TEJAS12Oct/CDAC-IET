package Student1;

import java.util.Scanner;

import Student.Stack;
import StudentMenuDriven.Student;

public class Main1 {

	public static void main(String[] args) {

		String name = "";
		int i = 0, age = 0;
		char gender = 0;

		Student1 s = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Size = ");
		int size = sc.nextInt();

		for (i = 0; i < size; i++) {

			System.out.println("ENTER NAME = ");
			name = sc.next();

			System.out.println("ENTER AGE = ");
			age = sc.nextInt();

			System.out.println("ENTER GENDER = ");
			gender = sc.next().charAt(0);

			s = new Student1(name, age, gender);
			s.setname(name);
			s.setage(age);
			s.setgender(gender);

		}

		Stack1 S1 = new Stack1(size);
		S1.push(s);
		S1.push(s);
		S1.push(s);
		//System.out.println(S1);
		System.out.println(" after push " + S1);

		S1.pop();
		System.out.println(" after pop " + S1);

	}

}
