package Circle;

public class Main {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(1, 1);
		Circle c3 = new Circle(5, 5, 5);

		System.out.println("Using Display Method  =  ");

		c1.print();
		c2.print();
		c3.print();
		System.out.println();
		
		System.out.println("Using toString  Method = ");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
