package Study.errors;

public class ExceptionHandlingEx3 {

	public static void main(String[] args) {
		try {
			System.out.println(args[0].toUpperCase());
			int X = Integer.parseInt(args[1]);

// 			if args[0] or args[1] is not gven we get ArrayOutOfIndexException
// 			if args[1] is not an integer in string then NumberFormatException

			int division = 1000 / X;
			System.out.println(division); // if X is 0 We get ArithmaticException

			String[] arr = new String[3];
			System.out.println(arr[0].toLowerCase());

		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e) {
			System.out.println("Catching " + e); // toSting Of e is Called

		} catch (Exception e) {// acting like a sink that matches everything other than above 3

			e.printStackTrace(); // STack Methods Are Shown
		}
		System.out.println("End Of Try Catch Block , Programs Ends Properly");

	}

}
