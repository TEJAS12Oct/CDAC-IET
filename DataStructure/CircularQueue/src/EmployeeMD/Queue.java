package EmployeeMD;

public class Queue {

	private Employee arr[];
	int R;
	int F;

	Queue(int size) {
		this.arr = new Employee[size];
		this.R = -1;
		this.F = -1;

	}

	public void insert(Employee e1) {
		// Full condition
		if ((this.R + 1 == this.F) || (this.R == arr.length - 1 && this.F == 0)) {
			System.out.println("Queue is Full");
		} else {
			if (this.R != this.arr.length - 1)
				this.R++;
			else
				this.R = 0;
		}
		if (this.F == -1) {
			this.F = 0;
		}
		this.arr[R] = e1;

	}

	public void remove() {
		Employee value = null;

		// Check for empty condition
		if (this.F == -1) {
			System.out.println("Queue is empty =");
		} else {
			value = this.arr[F];
			System.out.println("REMOVE ELEMENT " + this.arr[F]);
			// Check if this is the last value, if yes make F, R to -1. Else F++.
			if (this.F != this.R) {
				if (this.F != this.arr.length - 1)
					this.F++;
				else
					this.F = this.R = -1;
			}

		}
	
	}

	public String toString() {
		String str = "";
		if (this.F == -1)
			str = "Queue is Empty!";
		else {
			for (int i = this.F; i != this.R;) {
				str = str + this.arr[i] + ", ";

				if (i != this.arr.length - 1) {
					i++;
				} else
					i = 0;

			}
			str = str + this.arr[this.R] + " , ";
		}
		return str;

	}
	
	public void print() {
		String str = "";
		if (this.F == -1)
			str = "Queue is Empty!";
		else {
			for (int i = this.F; i != this.R;) {
				str = str + this.arr[i] + ", ";

				if (i != this.arr.length - 1) {
					i++;
				} else
					i = 0;

			}
			str = str + this.arr[this.R] + " , ";
			System.out.println("AFTER REMOVE ELEMENT = " + str);
		}
	}

}