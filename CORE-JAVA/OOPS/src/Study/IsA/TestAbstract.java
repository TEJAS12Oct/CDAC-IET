package Study.IsA;

public class TestAbstract {

	public static void main(String[] args) {
		// Globe Obj = new Globe(); // abstract class can't be instantiated
		Globe obj = new Earth();
		obj.F2();
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

	abstract void F2(); // no impl method

	abstract void F4();
}

class Earth extends Globe {
	@Override
	void F2() {
		System.out.println("Hello");

	}

	@Override
	void F4() {
		System.out.println("Hi");
	}

}

abstract class Moon extends Globe {
}