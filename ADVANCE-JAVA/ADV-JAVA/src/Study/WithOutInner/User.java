package Study.WithOutInner;

public class User {

	private int Data2 = 101;

	Test Tobj = new Test();

	public void show() {
		System.out.println("Using Without Inner Class => Data2 = " + Data2 + " , Data1 = " + Tobj.getData1());
	}

	public static void main(String[] args) {
	
		User obj = new User();
		obj.show();
	
	} // EOM

} // End Of User

class Test {

	private int Data1 = 100;

	public int getData1() {
		return Data1;
	}
} // EOC Test
