package Study.IsA;

public class TestAbstract {

	public static void main(String[] args) {
		// Globe Obj = new Globe(); // abstract class can't be instantiated
		Globe obj = new Earth();
		obj.F2();
		obj.F1();
		obj.F3();
	} // EOM

} // EOC

abstract class Globe {
	// concrete method
	void F1() {
		System.out.println("Good Morning");
	}

	void F3() { // concrete method
		System.out.println("Good Bye");
	}

	 void F2() { // no impl method
	 System.out.println("I am From Globe Hello");
	 }
	abstract void F4();
}

class Earth extends Globe {

	/*
	 * void F1() { System.out.println("I am from Earth , Good Morning"); }
	 */
	/*
	 * @Override void F2() { System.out.println("Hello");
	 * 
	 * }
	 */

	@Override
	void F4() {
		System.out.println("Hi");
	}

}

abstract class Moon extends Globe {
}