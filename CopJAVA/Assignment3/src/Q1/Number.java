package Q1;

public class Number {

	private int n;

	public Number(int n) {
		this.n = n;

	}

	public Number() {

	}

	public int getNumber() {
		return this.n =n;
	}

	public void setNumber(int n) {
		this.n = n;
	}

	public String toString() {
		String str = "n = " + n;
		return str;
	}

	public boolean greaterThan(Number n) {
		if (this.n > n.getNumber()) {

			return true;
		} else {
			return false;
		}
	}

}
