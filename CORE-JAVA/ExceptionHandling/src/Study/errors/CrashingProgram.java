package Study.errors;

import java.util.Scanner;

public class CrashingProgram {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter divident");
		int divident = sc.nextInt();
		
		System.out.println("enter divisor");
		int divisor = sc.nextInt();
		
		int division = divident/divisor;
		
		
		System.out.println("division ="+division);

	}

}
