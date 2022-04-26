package Study.IsA;

public class Test {

	public static void main(String[] args) {
//		A obj = new A();
//		B obj = new B();
//		C obj = new C();
//		D obj = new D();
		E obj = new E();
	}
} // END OF TEST CLASS

class A {
	private int a;

	public A() {
		System.out.println("A created");
	}

	A(int a) {
		this.a = a;
	}
}

class B extends A {
	int b;

	public B() {
		System.out.println("B created");
	}

	B(int a, int b) {
		super(a);
		this.b = b;
	}
}

class C extends B {
	int c;

	public C() {
		System.out.println("C created");
	}

	C(int n1, int n2, int n3) {
		super(n1, n2);
		this.c = n3;
	}
}

class D extends C {
	public D() {
		System.out.println("D created");
	}
}

class E extends B {
	public E() {
		System.out.println("E created");
	}
}

// A-> B-> C-> D

//A -> B 
//     |
//   --------
//   |      |
//   C      E
//   |
//   D