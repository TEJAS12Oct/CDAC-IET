package Stack;

public class Stack {

	static int[] arr;
//	 this will point to last incoming number
	static int topIndex = -1;

	public static void main(String[] args) {

		arr = new int[5];
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		push(60);
		push(70);
		System.out.println("Push  = ");
		print();

		System.out.println("Pop = ");
		pop();      // 50
		pop();      // 40
//		pop();      // 30

		print();
		
//		System.out.println();
//		push(80);
//		print();

	}

	private static void print() {
		if (topIndex == -1) {  // Check Stack Is empty
			System.out.println(" Stack is Empty");
		} else {
			for (int i = topIndex; i >= 0; i--)
				System.out.println(arr[i] + ", ");
		}
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

//		 overflow condition
		if (topIndex < arr.length - 1) {
			topIndex++;    
			arr[topIndex] = value;
		} else
			System.out.println("Overflow...");

	}

}
