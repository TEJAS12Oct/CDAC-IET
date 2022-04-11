package Q2;

public class MathOperation1 {
	static int n1;
	static int n2;

	public static Number1 addition(Number1 n1, Number1 n2) {
		Number1 x = new Number1((n1).getNumber1() + n2.getNumber1());
		return x;
	}

	public static Number1 subtraction(Number1 n1, Number1 n2) {
		Number1 x = new Number1((n1).getNumber1() - n2.getNumber1());
		return x;
	}

	public static Number1 multiply(Number1 n1, Number1 n2) {
		Number1 x = new Number1((n1).getNumber1() * n2.getNumber1());
		return x;
	}

	public static Number1 division(Number1 n1, Number1 n2) {
		Number1 x = new Number1((n1).getNumber1() / n2.getNumber1());
		return x;
	}

}
