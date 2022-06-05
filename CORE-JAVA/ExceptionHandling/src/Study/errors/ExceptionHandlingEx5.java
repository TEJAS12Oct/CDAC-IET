package Study.errors;

import java.io.IOException;

public class ExceptionHandlingEx5 {
	public static void main(String[] args) throws Exception {
		F1();
		 showSquareNumber("20");
		System.out.println("Programs  Ends Properly");
	}

	public static void F1() {
		try {
			showHeight(-7);
		} catch (Exception e) {
	//		 e.printStackTrace();
			System.out.println("the height cannot be negative");
		}
	}

	public static void showHeight(int x) throws Exception {
		if (x > 0)
			System.out.println("Ht Of Building : " + x);
		else {
			Exception e = new Exception();
			throw e;
		}
	}

	public static void showSquareNumber(String S) {

		int X = Integer.parseInt(S);// UNCHECKED => compiler is not forcing to RETHROW or CATCH
		System.out.println(X * X);
	}

	public static void Test() {
		throw new ArithmeticException(); // UNCHECKED
	}

	public static void Test2() {
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
