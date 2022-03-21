package CircleLab;

public class Main {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		System.out.println(c.getRadius());
		
		Circle c1 = new Circle(30,3,5);
		System.out.println(c1.getRadius());
		c1.setRadius(12);
		
		System.out.println(c.toString());
		System.out.println(c1);

	}

}