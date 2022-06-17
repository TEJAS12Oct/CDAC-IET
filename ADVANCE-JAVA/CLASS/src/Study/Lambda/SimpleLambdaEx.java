package Study.Lambda;

public class SimpleLambdaEx {

	public static void main(String[] args) {

//      This is the class definition that implements the interface method
		I1 obj1 = () -> {
			System.out.println("Test 1");
		};

		I2 obj2 = (p1, p2) -> {
			System.out.println("I got " + p1 + " , " + p2);
		};

		I3 obj3 = (p1) -> {
			return new Student(p1, "Tejas");
		};

		obj1.M1();

		obj2.M2(true, 'T');
		obj2.M2(false, 'J');

		Student S = obj3.process(30);
		System.out.println(S);

		test(obj1);
		
		test(() -> {
			System.out.println("This Is Another Print");
		});
	}

	static void test(I1 obj) {
		obj.M1();
	}
}

@FunctionalInterface
interface I1 {
	void M1();  
}

interface I2 {

	void M2(boolean x, char ch);
}

@FunctionalInterface
interface I3 {
	Student process(int x);
}