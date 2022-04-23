package Stack1;

public class Main {

	public static void main(String[] args) {

		Stack s1 = new Stack();  // S1 object Creation //ParameterLess Constructor 

		s1.push(10);
		s1.push(20);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.pop();
		s1.push(40);

		System.out.println("S1 = "+s1);

		Stack s2 = new Stack(5);  // S2 object Creation //Parameterized Constructor 

		for (int i = 0; i < 5; i++)
		s2.push(100);
		s2.pop();
	    s2.pop();
		s2.pop();
		System.out.println("S2 = "+s2);

		Stack s3 = s1.concat(s2);  // s2  madhey s1 che element concat(add) karayche
		System.out.println("Concat = " + s3);

		if (s1.equals(s2))
			System.out.println("s1 and s2 are same...");
		else
			System.out.println("s1 and s2 are different...");

	}

}
