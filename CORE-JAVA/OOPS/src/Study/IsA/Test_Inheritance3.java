package Study.IsA;

public class Test_Inheritance3 {

	public static void main(String[] args) {
		Show(new Object());
		Show(new MyDate());
//		Show(new MyDate(12, 12, 1121));
		Show(new Employee());
		Show(new Person());
//		Show(new Person("Tejas", new MyDate(3, 3, 3333)));
		Show(30); // Primitive Internally Wrap => AutoBoxing

	}// End of Main

	public static void Show(Object obj) {
		String S = obj.toString();
		System.out.println("S = " + S);
	}
}
