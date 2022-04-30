package Study.Abstract;

public abstract class Shape {
	abstract double area();
}

class Circle extends Shape {
	double Rad;

	Circle(double Rad) {
		this.Rad = Rad;
	}

	double AreaOfCircle() {
		final double PI = 3.14;
		double area = 2 * PI * Rad;
		return area;
	}

	@Override
	double area() {
		return AreaOfCircle();
	}
}

class Rectangle extends Shape {
	double length, breadth;

	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	double AreaOfRectangle() {
		double area = length * breadth;
		return area;
	}

	@Override
	double area() {
		return AreaOfRectangle();
	}

}