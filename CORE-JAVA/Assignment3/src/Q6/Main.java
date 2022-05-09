package Q6;

public class Main {

	public static void main(String[] args) {
		Square obj = new Square(4);
		calculateArea(obj);
		calculateArea(new Square(10));
		
		calculateArea(new Rectangle(7, 7));
		
		calculateArea(new Triangle(15, 30));
	}

	public static void calculateArea(Shape sh) {
		double Area = sh.area();
		System.out.println("Area of " + sh + " = " + Area);
	}

}
