package HeapSort;

public class Main {

	public static void main(String[] args) {

//		int[] arr = new int[] { 5, 20, 100, 5, 76, 75, 11, 4000, 6, 7, 3, 9, 223 };
		int[] arr = new int[] { 12, 34, 15, 6, 89, 10, 14 };
// 		int arr[] = { 1, 12, 9, 5, 6, 10 };		
		Heap HS = new Heap();

		HS.print(arr);
		HS.HeapSort(arr);
		System.out.print("Heap Sorted array is = ");
		HS.print(arr);
	}

}
