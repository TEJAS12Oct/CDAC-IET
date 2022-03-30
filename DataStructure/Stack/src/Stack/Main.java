package Stack;

public class Main {

	static int[] arr;
	// this will point to last incoming number
	static int topIndex = -1;

	public static void main(String[] args) {

		arr = new int[5];
		push(40);
		push(20);
//			push(30);
//			push(10);
//		    push(10);
//		    push(10);
//			push(10);

		pop();
		pop();
		pop();

		print();

	}

	private static void print() {

		for (int i = topIndex; i >= 0; i--)
			System.out.print(arr[i] + ", ");

	}

	private static int pop() {

		if (topIndex != -1) {
			int value = arr[topIndex];
			topIndex--;
			return value;
		} else
			System.out.println("Underflow...");
		return 0;
	}

	private static void push(int value) {

		// overflow condition
		if (topIndex < arr.length - 1) {
			topIndex++;
			arr[topIndex] = value;
		} else
			System.out.println("Overflow...");

	}

}
