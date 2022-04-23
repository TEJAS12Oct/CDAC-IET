package BubbleSort;

public class Main {

	public static void main(String[] args) {

		int[] arr = new int[] { 12, 75, 30, 93, 48, 34, 1 };
		Sort B = new Sort();

		B.print(arr);
		B.BubbleAscending(arr);
		B.print(arr);
		B.BubbleDecending(arr);
		B.print(arr);

	}

}
