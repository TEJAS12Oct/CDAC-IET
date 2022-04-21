package study.ParameterPass;

public class Example2 {

	public static void main(String[] args) {
		int x = 23;

		System.out.println("Before = " + x);
		increment(x);
		System.out.println("After = " + x);
	}

	public static void increment(int x) {
		x++;
	}

}// end of class
