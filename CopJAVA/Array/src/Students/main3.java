package Students;

import java.util.Scanner;

public class main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of student = ");
		int Student_size = sc.nextInt();

		student3[] arr = new student3[Student_size];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter student name  = ");
			String name = sc.next();
			System.out.println("Enter student age  = ");
			int age = sc.nextInt();
			System.out.println("Enter student gender  = ");
			char gender = sc.next().charAt(0);

			arr[i] = new student3(name, age, gender);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Display Male = ");
		{
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].getGender() == 'm') {
					count++;
					System.out.println("Male = " + arr[i] + "\n");
				}

			}
			System.out.println("Total Male = " + count);
		}
		System.out.println("Display Female = ");
		{
			int count = 0;
			for (int i = 0; i < arr.length; i++) {

				if (arr[i].getGender() == 'f') {

					count++;
					System.out.println("Female = " + arr[i] + "\n");
				}
			}
			System.out.println("Total Female = " + count);
		}
		System.out.println("Display Elder = ");
		{
			int age = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].age > age) {
					age = arr[i].age;
				}

			}
			System.out.println("Elder = " + age + "\n");
		}
		System.out.println("Display Younger = ");
		{
			int age = arr[0].age;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].age < age) {
					age = arr[i].age;
				}

			}
			System.out.println("Younger = " + age + "\n");
		}
		System.out.println("Display Average Age = ");
		{
			float sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i].getAge();

			}
			float avgAge = (sum / arr.length);
			System.out.println("avgAge = " + avgAge + "\n");

		}
		System.out.println("Dissplay Average MaleAge = ");
		{
			float sum = 0;
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].getGender() == 'm' || arr[i].getGender() == 'm') {
					sum = sum + arr[i].getAge();
					count++;
				}

			}
			float avgMale = (sum / count);
			System.out.println("avgAge = " + avgMale + "\n");

		}
		System.out.println("Display Average FemaleAge = ");
		{
			float sum = 0;
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].getGender() == 'f' || arr[i].getGender() == 'f') {
					sum = sum + arr[i].getAge();
					count++;
				}

			}
			float avgFemale = (sum / count);
			System.out.println("avgAge = " + avgFemale + "\n");

		}
	}
}
