package ArrayRevision1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size  = ");
		int size = sc.nextInt();
		Student[] S = new Student[size];

		int i;
		for (i = 0; i < size; i++) {
			System.out.println("Enter Name  = ");
			String name = sc.next();

			System.out.println("Enter Age = ");
			int age = sc.nextInt();

			System.out.println("Enter Marks = ");
			int marks = sc.nextInt();

			System.out.println("Enter Gender = ");
			char gender = sc.next().charAt(0);

			S[i] = new Student(name, age, marks, gender);

		}

		Student.Display(S);
		S[0].youngerStudent(S);

		int younger = S[0].youngStudentReturn(S);
		if (S[0].getAge() == younger) {
			System.out.println(S[0]);
		}

		S[0].AvgAge(S);

	}

}
