// Write a function to find out weather Array elements are distinct or not? public class Is Distinct

package Array1D;

public class Q4 {

	public static void main(String[] args) {

		int arr[] = { 12, 23, 44, 55, 77, 77, 89, 90 };
		if (isDistinct(arr))
			System.out.println("Array has all distinct elements");
		else
			System.out.println("Array has some duplicate elements");
	}

	static boolean isDistinct(int a[]) {
		int i, j;
		for (i = 0; i < a.length - 1; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					return false;
			}
		}
		return true;

	}

}
