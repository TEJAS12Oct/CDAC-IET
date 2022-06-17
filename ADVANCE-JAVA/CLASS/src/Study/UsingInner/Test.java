package Study.UsingInner;

//Outer Class
public class Test {

	private int Data1 = 100;
	private int common = 200;// this is property of test Outer class
	// Inner Class

	public void Display() {
//		Outer class Explicitly creates object of User
//      System.out.println("Data1 = " + Data1 + " , Data2 = " + Data2);
		System.out.println("Display => Data1 = " + Data1 + " , Data2 = " + new User().Data2);
	}

	class User {
		private int Data2 = 101;
		private int common = 333;// this is property of user Inner class

		public void show() {
			// Inner class Method is Directly/Implicitly Using the Private Property Of Outer
			// Class
			System.out.println("Using Inner Class => Data2 = " + Data2 + " , Data1 = " + Data1);
			System.out.println("Common of Outer = " + Test.this.common + " , Common of Inner = " + this.common);
		}
	} // EOC User , EOIC

	public static void main(String[] args) {

		Test Obj = new Test();
		User U = Obj.new User();
		U.show();
		Obj.Display();
	
	
	} // EOM

} // EOC Test, EOOC
