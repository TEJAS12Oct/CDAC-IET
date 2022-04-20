package CircleLab;

public class Main {

	public static void main(String[] args) {

		Circle c = new Circle();
		System.out.println("C Radius = " + c.getRadius());

		Circle c1 = new Circle(30, 3, 5);
		System.out.println("C1 Rdius = " + c1.getRadius());
		c1.setradius(12);
		System.out.println("New set Radius(c1) , " + c1);

		System.out.println(c);

	}

}