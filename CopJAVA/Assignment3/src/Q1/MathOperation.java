package Q1;

public class MathOperation {
	static int n1;
	static int n2;

	public static Number multiply(Number n1, Number n2) {
		Number n = new Number((n1).getNumber() * n2.getNumber());
		return n;
	}

	public static Number addition(Number n1, Number n2) {
		Number n = new Number((n1).getNumber()+ n2.getNumber());
		return n;
	}
	
	public static Number subtraction(Number n1, Number n2) {
		Number n = new Number((n1).getNumber() - n2.getNumber());
		return n;
	}

	public static Number division(Number n1, Number n2) {
		Number n = new Number((n1).getNumber() / n2.getNumber());
		return n;
	}

	

}
