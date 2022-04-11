package ArrayRevision;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size = ");
		int size = sc.nextInt();

		Student[] arr = new Student[size];
		Student s = null;

		for (i = 0; i < arr.length; i++) {
			System.out.println("Enter Name = ");
			String name = sc.next();
			System.out.println("Enter Age = ");
			int age = sc.nextInt();
			System.out.println("Enter Marks = ");
			int marks = sc.nextInt();

			s = new Student(name, age, marks);

			arr[i] = s;
//			System.out.println("In Loop Print  = " + s); // all size getting value one by one
		}
		for (i = 0; i < arr.length; i++) {
			System.out.println("Student Data = " + arr[i]);
		}

		arr[1].setAge(45);
		System.out.println("\nSet Age = " + arr[1]);

		Student.Display(arr); // Class Calling Method = static method

		arr[0].print(arr, 0); // object calling method = non static method
		arr[0].print(arr, 1); // object calling method = non static method

		if (arr[0].getAge() > arr[1].getAge()) {
			arr[0].print(arr, 0);
		} else {
			arr[1].print(arr, 1);
		}
		
		

	}

}
