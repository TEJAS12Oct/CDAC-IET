package DQueue;

public class DQeue {

	private int[] arr;
	private int F;
	private int R;

	public DQeue() {
		this.arr = new int[5];
		this.F = -1;
		this.R = -1;
	}

	public DQeue(int size) {
		this.arr = new int[size];
		this.F = -1;
		this.R = -1;
	}

	public void insertF(int value) {
		// FULL CONDITION
		if (F == 0 && R == arr.length - 1) {
			System.out.println("DQUEUE IS FULL");
		} else {
			// Check if this is the first place
			if (F == -1) {
				F = R = 0;
				// arr[F] = value;
			}

			// CHECK IF WE HAVE SPACE BEFORE F
			else if (F != 0) {
				F--;
				// arr[F] = value;
			}

			// we have space after R
			else {
				R++;
				// Shift all value by 1 place
				for (int x = R; x > F; x--) {
					arr[x] = arr[x - 1];
				}
			}

			arr[F] = value;
		}
	}

	public void insertR(int value) {

		// FULL CONDITION

		if (F == 0 && R == arr.length - 1) {
			System.out.println("DQeue Is  Full");

		} else {

			// Check if this is the first place
			if (F == -1) {
				F = R = 0;
				// arr[R] = value;
			}

			// check if we have space before R
			else if (R != arr.length - 1) {
				R++;
				// arr[R] = value;
			}

			// we have some space before F
			else {
				F--;
				// shift all values by 1 places
				for (int x = F; x < R; x++) {
					arr[x] = arr[x + 1];
				}
			}
			arr[R] = value;

		}

	}

	public void insertNewR(int value) {

		// Check if this is the first place
		if (F == -1) {
			F = R = 0;
			arr[R] = value;
		}

		else {

			// check if we have space before R
			if (R != arr.length - 1) {
				R++;
				arr[R] = value;
			}

			// we have some space before F
			else if (F != 0) {
				F--;
				// shift all values by 1 places
				for (int x = F; x < R; x++) {
					arr[x] = arr[x + 1];
				}
				arr[R] = value;

			} else
				System.out.println("DQeue is Full");
		}
	}

	public int removeF() {
		int value = 0;

		// Check for empty condition.
		if (F != -1) {
			value = arr[F];
			if (F != R)
				F++;
			else
				F = R = -1;
		} else
			System.out.println(" Queue is Empty");
		return value;

	}

	public int removeR() {
		int value = 0;

		// Check for empty condition.
		if (R != -1) {
			value = arr[R];
			if (F != R)
				R--;
			else
				F = R = -1;
		} else
			System.out.println(" Queue is Empty");
		return value;
	}

	public String toString() {
		String str = "";
		if (F == -1)
			str = " Queue is Empty";
		else {
			for (int i = F; i <= R; i++) {
				str = str + arr[i] + " ,";
			}
		}
		return str;
	}
}
