package Students;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of student = ");
		int Student_size = sc.nextInt();

		student2[] arr = new student2[Student_size];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter student name  = ");
			String name = sc.next();
			System.out.println("Enter student age  = ");
			int age = sc.nextInt();
			System.out.println("Enter student gender  = ");
			char gender = sc.next().charAt(0);

			arr[i] = new student2(name, age, gender);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\n");
		}

		arr[0].CheckElder(arr);
		arr[0].CheckYounger(arr);

		arr[0].checkMale(arr);
		arr[0].checkFemale(arr);

		arr[0].avgAge(arr);
		arr[0].avgMale(arr);
		arr[0].avgFemale(arr);

	}
}
