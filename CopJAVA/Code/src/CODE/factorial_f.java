package CODE;

import java.util.*;

public class factorial_f {
	
	public static void find_fact(int num) {
		int i, fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial = " + fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No = ");
		int num = sc.nextInt();
		System.out.println("num = " + num);
		
		factorial_f.find_fact(num);
		find_fact(num);
	}

}
