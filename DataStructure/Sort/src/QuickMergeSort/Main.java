package QuickMergeSort;

public class Main {

	public static void main(String[] args) {

		int[] arr = new int[] { 12, 97, 37, 87, 50 };
		int[] brr = new int[] { 11, 91, 21, 81, 40 };
		int[] crr = new int[arr.length + brr.length];

		System.out.print("Arr = ");
		QuickMS.print(arr);

		System.out.print("Brr = ");
		QuickMS.print(brr);

		QuickMS.QuickSort(arr, 0, arr.length - 1);
		System.out.print("Quick  Sort Arr = ");
		QuickMS.print(arr);

		QuickMS.QuickSort(brr, 0, arr.length - 1);
		System.out.print("Quick  Sort Brr = ");
		QuickMS.print(brr);

		QuickMS.MergeSort(arr, brr, crr);
		System.out.println("Merge Sort = ");
		QuickMS.print(crr);
	}

}
