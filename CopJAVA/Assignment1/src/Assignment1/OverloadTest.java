/*
Q2.Write a Java program to Overload add() function
In class OverloadTest .
Atleast create 3 overloaded versions of add() function.
*/
package Assignment1;

class OverloadTest {

	void add() {

	}

	void add(int a, int b) {
		System.out.println("a = " + a + "  b = " + b + "   add = " + (a + b));
	}

	void add(int a, int b, int c) {

		System.out.println("a = " + a + "  b = " + b + "  c = " + c + "  add = " + (a + b + c));
	}

	public static void main(String[] args) {
		OverloadTest o1 = new OverloadTest();

		o1.add();
		o1.add(11, 11);
		o1.add(11, 11, 11);

	}
}
