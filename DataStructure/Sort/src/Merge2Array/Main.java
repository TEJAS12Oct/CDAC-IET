package Merge2Array;

public class Main {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, };
		int[] brr = new int[] { 11, 15, 1, 8, 21, 35, 40 };
		int[] crr = new int[arr.length + brr.length];

		System.out.print("Arr = ");
		MergeArr.print(arr);

		System.out.print("Brr = ");
		MergeArr.print(brr);

		MergeArr.Merge(arr, brr, crr);
		System.out.print("Merge Crr = ");
		MergeArr.print(crr);
	}

}
