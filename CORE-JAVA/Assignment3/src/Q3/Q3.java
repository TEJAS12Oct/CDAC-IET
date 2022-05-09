/*
 Q3.Write a program that accepts numbers from command line 
show the following
1.Sum of all numbers.
2.all numbers in sorted order.
3.Maximum number from all numbers .
4.Minimum value from all numbers.
Handle non-number input exception using exception handling code. and skip it.

 */

package Q3;

import java.util.ArrayList;
import java.util.Collections;

public class Q3 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("Enter numbers are");
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " "); // accepting the value from command line
		}
		System.out.println();
		System.out.println("Sum of all numbers : ");
		int sum = 0;
		int j = 0;
		for (int i = 0; i < args.length; i++) {
			try {
				j = Integer.parseInt(args[i]); // converting string into array on command line
				arr.add(j);                    // this will add integer in Arraylist
			} catch (NumberFormatException e) {
			}
			sum = sum + j;
		}
		System.out.println(sum);
		System.out.println("Sorted Numbers : ");
		Collections.sort(arr);

		System.out.println(arr);
		System.out.println("\nLargest Number:" + Collections.max(arr));
		System.out.println("\nSmallest Number:" + Collections.min(arr));

	}

}
