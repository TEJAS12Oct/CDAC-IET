package Queue;

public class Queue {

	int[] arr;
	int F;
	int R;

	public Queue() {
		arr = new int[5];
		F = -1;
		R = -1;
	}

	public Queue(int i) {
		arr = new int[i];
		F = -1;
		R = -1;
	}

	public void insert(int value) {
		// Full condition
		if (R < arr.length - 1) {
			R++;
			arr[R] = value;

			// If this is the first value, make F++ as well
			if (F == -1)
				F++;
		} else
			System.out.println("Queue is full");
	}

	public int remove() {
		int value = 0;

		// Check for empty condition
		if (F != -1) {
			value = arr[F];

			// Check if this is the last value, if yes make F, R to -1. Else F++.
			if (F != R)
				F++;
			else
				F = R = -1;
		} else
			System.out.println("Queue is empty");

		return value;
	}

	public String toString() {
		String str = "";
		if (F == -1)
			str = "Queue is Empty!";
		else {
			for (int i = F; i <= R; i++) {
				str += arr[i] + ", ";
			}
		}

		return str;
	}

	public Queue concat(Queue q2) {
		Queue res = new Queue(this.arr.length + q2.arr.length);
		for (int i = q2.F; i <= q2.R; i++) {
			res.insert(q2.arr[i]);
		}
		for (int i = this.F; i <= this.R; i++) {
			res.insert(arr[i]);
		}
		return res;

	}

	public boolean equals(Queue q2) {
		// q1.equals(q2)
		// q1 ==> this
		// q2 ==> q2
		System.out.println("q1 length  = " + this.arr.length);
		System.out.println("q2 Length  = " + q2.arr.length);
		if (this.arr.length != q2.arr.length) // (5!=4) = true   //(5!=5) =false
			return false; 					  // khali jana nahi // khali jail

		System.out.println(this.F);
		System.out.println(q2.F);
		if (this.F != q2.F) // (3!=3) khali gela
			return false;

		// iterate on both arr and check each element
		for (int i = 0; i < this.F; i++) {

			if (this.arr[i] != q2.arr[i]) {
				return false;
			}
		}

		return true;
	}
}
