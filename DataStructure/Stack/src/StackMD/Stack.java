package StackMD;

public class Stack {

	private int[] arr;
	private int top;

	public Stack(int size) {
		this.setArr(new int[size]);
		this.top = -1;
	}

	public Stack() {
		this.setArr(arr);
		this.top = top;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public void push(int value) {
		// overflow condition
		if (this.top < arr.length - 1) {
			this.top++;
			this.arr[this.top] = value;
		} else
			System.out.println("Overflow...");
	}

	public void pop() {
		if (this.top != -1) {
			int value = this.arr[this.top];
			System.out.println("DELETED ELEMENT = " + this.arr[this.top]);
			this.top--;

		} else
			System.out.println("Underflow...");

	}

	public String toString() {

		String str = "";
		if (this.top == -1)
			str = "Stack is empty";
		else {
			for (int i = this.top; i >= 0; i--)
				str = str + (this.arr[i] + ", ");
		}
		System.out.println("DISPLAY ELEMENT  = " + str);

		return str;
	}

	public void print() {
		String str = "";
		if (this.top == -1)
			str = "Stack is empty";
		else {
			for (int i = this.top; i >= 0; i--)
				str = str + (this.arr[i] + " ");
		}
		System.out.println("DISPLAY ELEMENT  = " + str);

	}

}
