package Q2;

public class Number {
	int value;

	Number(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		String str = "";
		str = str + value;
		return str;
	}

}
