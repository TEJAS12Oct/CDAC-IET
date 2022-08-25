package Study.UsingInner;

public class Test2 {

	private int x = 20;
	private static int y = 200;

	// it Does not get the this of outer class Implicitly
	// Only static properties can be Accessed
	public static class Inner {
		private int A = 99;
		private static int B = 199;

		public void show() {
			// X is Not Available Because Of its have non Static field
			System.out.println("X = Not avavilable "  + " , Y = " + y + " , A = " + A + " , B = " + B);
		}
	} // EOIC

	public static void main(String[] args) {
		Inner Obj = new Test2.Inner(); // OuterClassName.Inner
		Obj.show();

	}

}
