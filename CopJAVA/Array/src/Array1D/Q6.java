//Sorting of Array
package Array1D;

public class Q6 {

	public static void main(String[] args) {
		int arr[] = { 82, 4, 15, 24, 3, 90, 55, 65, 67, 60, 25 };
		String names[] = { "Tanmay", "Hitesh", "Aayasha", "Mandar", "Amita", "Mayur", "Mayura" };
		sort_arr(arr);
		sort_names(names);
		display_arr(arr);
		System.out.println();
		display_names(names);
	}

	static void sort_arr(int a[]) {
		int i, j, temp;
		for (i = 0; i < a.length - 1; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
			//  if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	static void sort_names(String a[]) {
		int i, j;
		String temp;
		for (i = 0; i < a.length - 1; i++) {
			for (j = i + 1; j < a.length; j++) {
				//if (a[i].compareTo(a[j]) < 0) {
			 if (a[i].compareTo(a[j]) > 0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	static void display_arr(int a[]) {
		int i;
		for (i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);
	}

	static void display_names(String[] a) {
		int i;
		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

	}

}
