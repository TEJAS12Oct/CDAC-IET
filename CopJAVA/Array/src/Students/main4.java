package Students;

import java.util.Scanner;

public class main4 {

	public static int Male_count(student4[] arr, int count) {
		count = 0;
		System.out.println("--------------------------------------------------------");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getGender() == 'M' || arr[i].getGender() == 'm') {
				count++;
			}
		}
		return count;
	}

	public static int Female_count(student4[] arr, int count) {
		System.out.println("--------------------------------------------------------");

		count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getGender() == 'F' || arr[i].getGender() == 'f') {
				count++;
			}
		}
		return count;
	}

	public static float find_avgAge_male(student4 s[]) {
		System.out.println("--------------------------------------------------------");
		float sum = 0;
		int j = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].getGender() == 'M' || s[i].getGender() == 'm') {
				sum = sum + s[i].getAge();
				j++;
			}
		}
		return (sum / j);
	}

	public static float find_avg_age(student4 s[]) {
		System.out.println("--------------------------------------------------------");
		float sum = 0, j = 0;
		for (int i = 0; i < s.length; i++) {

			sum = sum + s[i].getAge();
			j++;
		}
		return (sum / j);

	}

	public static void print_all_female(student4 s[]) {
		System.out.println("--------------------------------------------------------");
		System.out.println("Female  Student : ");

		for (int i = 0; i < s.length; i++) {
			if (s[i].getGender() == 'F' || s[i].getGender() == 'f') {
				System.out.println(s[i]);
			}
		}
	}

	public static void print_all_male(student4 s[]) {
		System.out.println("--------------------------------------------------------");
		System.out.println("Male  Student : ");

		for (int i = 0; i < s.length; i++) {
			if (s[i].getGender() == 'M' || s[i].getGender() == 'm') {
				System.out.println(s[i]);
			}
		}
	}

	public static int find_youngest(student4[] s) {
		System.out.println("--------------------------------------------------------");
		int young = s[0].getAge(), j = 0;
		for (int i = 0; i < s.length - 1; i++) {
			if (s[i].getAge() < s[i + 1].getAge() && s[i].getAge() <= young) {
				young = s[i].getAge();
				j++;
			}
		}

		return j;
	}

	public static int find_eldest(student4[] s) {
		System.out.println("--------------------------------------------------------");
		int max = 0, j = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].getAge() > max) {
				max = s[i].getAge();
				j = i;
			}
		}
		return j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = sc.nextInt();
		student4[] s1 = new student4[size];

		for (int i = 0; i < s1.length; i++) {
			System.out.println();

			System.out.print("Enter name:");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Enter age:  ");
			int age = sc.nextInt();

			System.out.print("Enter Gender: ");
			char gender = sc.next().charAt(0);

			s1[i] = new student4(name, age, gender);
		}

//		s1[0].find_youngest();

		int young = find_youngest(s1);
		System.out.println("Youngest Student:  " + s1[young]);

		int eldest = find_eldest(s1);
		System.out.println("Eldest Student:  " + s1[eldest]);

		print_all_female(s1);
		print_all_male(s1);

		float avg = find_avg_age(s1);
		System.out.println("Average age of students: " + avg);

		find_avgAge_male(s1);
		System.out.println("Average age of Male: " + avg);
		int c = 0, j = 0;
		int count = Female_count(s1, c);
		System.out.println("Female count: " + count);

		int num = Female_count(s1, j);
		System.out.println("Male count: " + num);

		sc.close();
	}

}
