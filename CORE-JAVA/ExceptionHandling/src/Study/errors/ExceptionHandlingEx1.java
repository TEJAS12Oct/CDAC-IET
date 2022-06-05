package Study.errors;

public class ExceptionHandlingEx1 {

	public static void main(String[] args) {

		try {
			System.out.println(args[0].toUpperCase());
			System.out.println("Line After Problematic Code");
		} catch (Exception e) { // Universal Catch - it will Match All the Exception

			System.out.println(e); // e.toString() will be Called

		} finally {
			System.out.println("This Code Will Alays Run");
		}
		System.out.println("Out Side try Catch Finally Code Ends Properly");
	}

}