package Study.MethodLocalInner;

public class Test3 {

	int Alpha = 888;

	public void M1() {

		final int x = 100;
		int y = 200;

//		LocalEx obj2 = new LocalEx(); // Give Error Because its create Object Before Class Declaration

		class LocalEx {
			int z = 99;

			public void show() {
				System.out.println("Z = " + z + " , X = " + x + " , Y = " + y + " , Alpha = " + Alpha);
			}

		}

		LocalEx obj = new LocalEx();
		obj.show();

	} // EO M1 MEthod

	public static void main(String[] args) {
		Test3 T3 = new Test3();
		T3.M1();

	}

}
