package Q2;

public class main1 {

	public static void main(String[] args) {
		Number1 x = new Number1();
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.println(n1);
		System.out.println(n2);

		Number1 n3 = MathOperation1.addition(n1, n2);
		System.out.println("Addition of " + n1 + " and " + n2 + " is : " + n3);

		Number1 n4 = MathOperation1.multiply(n1, n2);
		System.out.println("Multiplication of " + n1 + " and " + n2 + " is : " + n4);

		Number1 n5 = MathOperation1.subtraction(n1, n2);
		System.out.println("Subtraction of " + n1 + " and " + n2 + " is : " + n5);

		Number1 n6 = MathOperation1.division(n1, n2);
		System.out.println("Division of " + n1 + " and " + n2 + " is : " + n6);

	}

}
