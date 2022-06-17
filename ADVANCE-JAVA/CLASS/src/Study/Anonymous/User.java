package Study.Anonymous;

public class User {

	public static void main(String[] args) {
		I1 obj = new I1() { // Anonymous Class Implements I1

			@Override
			public void DoTask3(int x) {
				System.out.println(x);

			}

			@Override
			public String DoTask2() {

				return "Hello HABIBI...!!!";
			}

			@Override
			public void DoTask1() {
				System.out.println("In Task 1");

			}
		};

		obj.DoTask1();
		System.out.println(obj.DoTask2());
		obj.DoTask3(30);

	} // EOM

}// EOC USER

interface I1 {
	void DoTask1();

	String DoTask2();

	void DoTask3(int x);
}
















