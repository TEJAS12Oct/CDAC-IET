package Study.errors;

public class ExceptionHandlingEx4 {

	public static void main(String[] args) throws Exception {
		F1();
		System.out.println("Programs  Ends Properly");
	}

	public static void F1() throws Exception {
		// showHeight(7);
		showHt(8);
	}

	private static void showHt(int i) {
		try {
			if (i > 0)
				System.out.println("Ht Of Building : " + i);

		} catch (Exception E) {
			E.printStackTrace();
		}
		System.out.println("Hi");

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
