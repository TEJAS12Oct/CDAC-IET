package study.ParameterPass;

public class Example1 {

	public static void main(String[] args) {
		// If object is passed or returned --- Address is copied

		MyWrapper x = new MyWrapper();
		x.value = 23;
		System.out.println("Before = " + x.value);
		increment(x);
		System.out.println("After = " + x.value);
	}

	public static void increment(MyWrapper x) {
		x.value++;
	}

}// end of class

class MyWrapper {
	int value;
}