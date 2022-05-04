package Study.errors;

public class StackErrorExample {

	public static void main(String[] args) {
	
		f1();
	
	}
	
	public  static void f1()
	{
		System.out.println("hi");
		f1();
	}
}
