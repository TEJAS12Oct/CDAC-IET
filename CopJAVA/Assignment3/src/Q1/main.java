/*
1. Write depended java classes to get below Main.java compile, run and get
expected output.
public class Main { public static void main(String [] str) { 
Number n1 = new Number(10); 
Number n2 = new Number(20); 
Number n = new Number(); //Number should init with value 0;
Number n3 = MathOperation.addition(n1, n2);
System.out.println("Addition of " + n1 + " and " + n2 + " is : " + n3);
Number n4 = MathOperation.multiply(n3, n2);
System.out.println("Multiplication of " + n3 + " and " + n2 + " is : " + n4);
if(n4.greaterThan(n1))
{
n1.setNumber(n4.getNumber());
}
System.out.println("Finally n1=" + n1);
}
}

*/
package Q1;

public class main {

	public static void main(String[] args) {
		Number n1 = new Number(10);
		Number n2 = new Number(20);
		Number n = new Number(); // Number should init with value 0;

		Number n3 = MathOperation.addition(n1, n2);
		System.out.println("Addition of " + n1 + " and " + n2 + " is : " + n3);

		Number n4 = MathOperation.multiply(n3, n2);
		System.out.println("Multiplication of " + n3 + " and " + n2 + " is : " + n4);

		if (n4.greaterThan(n1)) {
			n1.setNumber(n4.getNumber());
		}

		System.out.println("Finally n1 = " + n1);

	}
}
