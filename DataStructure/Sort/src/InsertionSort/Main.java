package InsertionSort;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 75, 30, 93, 48, 4 };

		Sort I = new Sort();

		I.print(arr);
		I.InsertionAscending(arr);
		I.print(arr);
		I.InsertionDecending(arr);
		I.print(arr);
		;
	}

}
