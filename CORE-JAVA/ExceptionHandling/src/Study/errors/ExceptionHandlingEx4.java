package Study.errors;

public class ExceptionHandlingEx4 {

	public static void main(String[] args) throws Exception {
		F1();
		System.out.println("Programs  Ends Properly");
	}

	public static void F1() throws Exception {
		showHeight(-7);
	}

	public static void showHeight(int x) throws Exception {
		if (x > 0)
			System.out.println("Ht Of Building : " + x);
		else {
			Exception e = new Exception();
			throw e;
		}
	}

}
