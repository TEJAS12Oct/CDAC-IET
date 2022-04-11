/* Program to print histogram of vowels from user input string .
	Separate the vowels & count that vowels nd print its histogram.*/

package Histogram_Vowel;

import java.util.Scanner;

public class Vowel {
	public static void print_histogram(int n, char T) {
		System.out.print(T + ":");
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  String Name : ");
		String name = sc.next();
		int i=0;
		char ch=name.charAt(i);
		int a = 0, e = 0, ii = 0, o = 0, u = 0;
		for (i=0; i < name.length(); i++) {
			if ((name.charAt(i) == 'A') || name.charAt(i) == 'a') {
				a++;
			}

			if ((name.charAt(i) == 'E') || name.charAt(i) == 'e') {
				e++;
			}

			if ((name.charAt(i) == 'I') || name.charAt(i) == 'i') {
				ii++;
			}

			if ((name.charAt(i) == 'O') || name.charAt(i) == 'o') {
				o++;
			}

			if ((name.charAt(i) == 'U') || name.charAt(i) == 'u') {
				u++;
			}

		}
		System.out.println("----------Histogram Vowel--------------------");
		print_histogram(a, 'a');
		print_histogram(e, 'e');
		print_histogram(ii, 'i');
		print_histogram(o, 'o');
		print_histogram(u, 'u');

		sc.close();

	}

}
