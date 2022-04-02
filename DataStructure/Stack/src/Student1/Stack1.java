package Student1;

public class Stack1 {

	private Student1[] arr;
	private int top;

	public Stack1(int size) {
		this.arr = new Student1[size];
		this.top = -1;
	}

	public void push(Student1 S) {

		if (this.top < this.arr.length - 1) {
			this.top++;
			this.arr[this.top] = S;
		} else
			System.out.println("Overflow...");

	}

	public void pop() {

		if (this.top != -1) {
			System.out.println("Remove Element = " +this.arr[this.top]);
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

		return str;
	}

}
