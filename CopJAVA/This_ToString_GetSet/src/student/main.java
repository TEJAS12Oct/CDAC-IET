package student;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name = ");
		String name = sc.next();

		System.out.println("Enter age = ");
		int age = sc.nextInt();
		
		System.out.println("Enter gender = ");
		char gender = sc.next().charAt(0);

		// student s1 = new student (name,age,gender);
		// s1.print();

		student s1 = new student(name, age, gender);
		System.out.println(s1);
		student s2 = new student("Tejas", 22, 'm');
		System.out.println(s2);

	}

}
