package Study.errors;

public class ExceptionHandlingEx2 {

	public static void main(String[] args) {
		try {
			System.out.println(args[0].toUpperCase());
			int X = Integer.parseInt(args[1]);
			
// 			if args[0] or args[1] is not gven we get ArrayOutOfIndexException
// 			if args[1] is not an integer in string then NumberFormatException
			
			int division = 1000 / X;
			System.out.println(division); // if X is 0 We get ArithmaticException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You Did not Give Enough Command Line Argument");
		} catch (ArithmeticException ae) {
			System.out.println("You Connot Divide By 0"); // Hello 0
		} catch (NumberFormatException nfe) { //  Hello Hi
			System.out.println("The Args 1 Must be a number");
		}
		System.out.println("End Of Try Catch Block , Programs Ends Properly");

	}

}
