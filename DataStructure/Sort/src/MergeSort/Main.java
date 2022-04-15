package MergeSort;

public class Main {

	public static void main(String[] args) {

		int[] arr = new int[] { 50, 20, 47, 37, 87};
		int[] brr = new int[] { 11, 91, 30, 21, 50 };
		int[] crr = new int[arr.length + brr.length];

//		int[] crr = new int[] { 11, 91, 30, 21, 50, 50, 20, 97, 37, 87 };

		System.out.print("Arr = ");
		MergeSort.print(arr);

		System.out.print("Brr = ");
		MergeSort.print(brr);

		MergeSort.Merge(arr, brr, crr);
		System.out.print("Merger Crr =");
		MergeSort.print(crr);

//		System.out.print("Crr =");
//		MergeSort.print(crr);

		MergeSort.MSort(crr, 0, 1, 4);
		System.out.print("Sort By Index =  ");
		MergeSort.print(crr);

		MergeSort.MergeS(crr, 0, crr.length - 1);
		System.out.print("Merge Sorting = ");
		MergeSort.print(crr);

	}

}
