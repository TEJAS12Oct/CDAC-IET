package QuickSort;

public class Main {

	public static void main(String[] args) {

		int[] arr = new int[] { 12, 75, 30, 93, 48, 34, 1 };
		QuickSort QS = new QuickSort();

		System.out.print("Original Array = ");
		QS.print(arr);
		
		QS.QuickS(arr, 0, arr.length - 1);
		
		System.out.print("\nAfter  Quick Sort =  ");
		QS.print(arr);
	}

}
