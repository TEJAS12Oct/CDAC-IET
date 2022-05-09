package Q6;

/*Q6.Create Shape class which have area() method which is abstract .Create classes 
Square ,Triangle,Rectanglec which are inherited from Shape class.
overried Area() method in all classes and call them using Base class reference.*/

public abstract class Shape {
	abstract double area();
}

class Square extends Shape {
	double S = 0;

	public Square(double S) {
		super();
		this.S = S;
	}

	double area() {
		return areaOfSquare(S);
	}

	private double areaOfSquare(double S) {
		double Area = S * S;
		return Area;
	}

	@Override
	public String toString() {
		return "Square [Side : " + S + "]";
	}

}

class Triangle extends Shape {
	double base;
	double height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	double area() {
		return areaOfTriangle(base, height);
	}

	private double areaOfTriangle(double base, double height) {
		double Area = 0.5 * base * height;
		return Area;
	}

	@Override
	public String toString() {
		return "Triangle [Base : " + base + ", Height : " + height + "]";
	}

}

class Rectangle extends Shape {
	double breadth = 0;
	double length = 0;

	public Rectangle(double breadth, double length) {
		super();
		this.breadth = breadth;
		this.length = length;
	}

	@Override
	double area() {
		return areaOfRectangle(breadth, length);
	}

	private double areaOfRectangle(double breadth, double length) {
		double are1 = breadth * length;
		return are1;
	}

	@Override
	public String toString() {
		return "Rectangle [Breadth : " + breadth + ", Length : " + length + "]";
	}

}
