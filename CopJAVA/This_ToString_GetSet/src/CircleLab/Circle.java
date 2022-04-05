package CircleLab;

public class Circle {
	Point p;
	int radius;

	public Circle() {
		p = new Point();
		radius = 3;

	}

	public Circle(int x, int aa, int bb) {
		p = new Point(aa, bb);
		radius = x;

	}

	public void setradius(int r) {
		radius = r;
	}

	public int getRadius() {
		return radius;
	}

	public String toString() {
		String str = "Radius = " + radius + p.toString();
		return str;
	}

}
