/*
Q1.Create a class in java MyCalculator with two data members int num1,num2 
.Write Parameter less and Parameterized Constructor to initialize your data 
members.
*/

package Assignment1;

public class MyCalculator {
	int n1;
	int n2;

	MyCalculator() {
          n1 = 1;
          n2 = 2;
	}

	MyCalculator(int x, int y) {
		n1 = x;
		n2 = y;

	}

	void display() {
		System.out.println("n1 = " + n1 + " " + "n2 = " + n2 );
	}

	void add() {
		int add = n1 + n2;
		System.out.println("add = " + add);
	}

	void multiply() {
		int multiply = n1 * n2;
		System.out.println("multiply = " + multiply +"\n");
	}

	public static void main(String[] args) {
		MyCalculator m1 = new MyCalculator();
		MyCalculator m2 = new MyCalculator(4, 2);
		m1.display();
		m1.add();
		m1.multiply();
		m2.display();
		m2.add();
		m2.multiply();
	}

}
