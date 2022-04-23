package study.ParameterPass;

public class Swapping {
	int value;

	public static void main(String[] args) {
		System.out.println("Swapping Object = ");
		SwapObj x = new SwapObj();
		x.value = 10;
		SwapObj y = new SwapObj();
		y.value = 30;
		System.out.println("Before = " + (x.value + " , " + y.value));
		SwapObj(x, y);
		System.out.println("After = " + (x.value + " , " + y.value));

// --------------------------------------------------------------------------------------

		System.out.println("\nSwapping Array = ");
		int[] arr1 = { 20 };
		int[] arr2 = { 40 };
		System.out.println("Before = " + (arr1[0] + " , " + arr2[0]));
		SwapArray(arr1, arr2);
		System.out.println("After = " + (arr1[0] + " , " + arr2[0]));

	}

	public static void SwapArray(int[] arr1, int[] arr2) {
		int tmp = 0;
		tmp = arr1[0];
		arr1[0] = arr2[0];
		arr2[0] = tmp;

	}

	public static void SwapObj(SwapObj x, SwapObj y) {
		int tmp;
		tmp = x.value;
		x.value = y.value;
		y.value = tmp;

	}

}// end of class

class SwapObj {
	int value;
}
