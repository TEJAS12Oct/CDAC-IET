package Stack1;

public class Stack {

	// attributes and field
	private int[] arr;
	private int top;

	public Stack() { // Parameterless Constructor
		this.arr = new int[5]; // Create Array And give Size
		this.top = -1; // Top value Assign
	}

	public Stack(int size) { // Parameterized Constructor
		this.arr = new int[size]; // Create Array , Size Pass in Object Creation
		this.top = -1; // Top value Assign
	}

	public void push(int value) {
		// overflow condition
		if (this.top < this.arr.length - 1) {
			this.top++;
			this.arr[this.top] = value;
		} else
			System.out.println("Overflow...");
	}

	public int pop() {
		if (this.top != -1) {
			int value = this.arr[this.top];
			this.top--;
			return value;
		} else
			System.out.println("Underflow...");
		return 0;
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

	public boolean equals(Stack s2) {
		// s1.equals(s2)
		// s1 ==> this
		// s2 ==> s2
		System.out.println("s1 length  = " + this.arr.length);
		System.out.println("s2 Length  = " + s2.arr.length);
		if (this.arr.length != s2.arr.length) // (5!=4) = true //(5!=5) =false
			return false; // khali jana nahi // khali jail

		System.out.println(this.top);
		System.out.println(s2.top);
		if (this.top != s2.top) // (3!=3) khali gela
			return false;

		// iterate on both arr and check each element
		for (int i = 0; i < this.top; i++) {

			if (this.arr[i] != s2.arr[i]) {
				return false;
			}
		}

		return true;
	}

	public Stack concat(Stack s2) {
		Stack res = new Stack(this.arr.length + s2.arr.length);  // in Res Store Size Of (S1 and S2) Array
		for (int i = 0; i <= this.top; i++) {
			res.push(this.arr[i]);
		}
		for (int i = 0; i <= s2.top; i++) {
			res.push(s2.arr[i]);
		}
		return res;

	}

}
