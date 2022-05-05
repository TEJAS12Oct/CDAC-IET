package Generics;

public class User {

	public static void main(String[] args) {
		Integer[] arr = new Integer[3];

//		Integer is Actual Type Parameter
		MyStack<Integer> Stack = new MyStack<Integer>(arr);

		Stack.push(20);
		Stack.push(30);
//		Stack.push("40");
		Stack.push(40);

		add(Stack);

//		MyDate is Actual Type Parameter
		MyDate[] arr2 = new MyDate[2];
		MyStack<MyDate> Stack2 = new MyStack<MyDate>(new MyDate[2]);
		Stack2.push(new MyDate(12, 12, 1999));
		Stack2.push(new MyDate(22, 3, 2012));

		add1(Stack2);

		// Thread is Actual Type Parameter
		MyStack<Thread> Stack3 = new MyStack<Thread>(new Thread[2]);
		Stack3.push(new Thread());
		Stack3.push(new Thread());

		add2(Stack3);

	}

	private static void add2(MyStack<Thread> stack3) {
//		System.out.println((Thread) stack3.pop());
		stack3.show();
	}

	private static void add1(MyStack<MyDate> stack2) {
//		System.out.println((MyDate) stack2.pop());
//		stack2.pop();
		stack2.show();

	}

	public static void add(MyStack<Integer> St) {
		int sum = 0;
		sum = sum + St.pop();
		sum = sum + St.pop();
		sum = sum + St.pop();

		System.out.println("Sum : " + sum);

	}

}
