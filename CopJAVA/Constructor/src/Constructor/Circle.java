package Constructor;

public class Circle {
	int centreX;
	int centreY;
	int radius;

	void init() {
		centreX = 0;
		centreY = 0;
		radius = 1;
	}

	void init(int x) {
		centreX = x;
		centreY = 3;
		radius = 4;
	}

	void init(int x, int y) {
		centreX = x;
		centreY = y;
		radius = 1;
	}

	void init(int x, int y, int r) {
		centreX = x;
		centreY = y;
		radius = r;
	}

	// centre : (0,0) radius : 1
	void print() {
		System.out.println("Centre: (" + centreX + "," + centreY + ") Radius :" + radius);

	}

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		Circle c4 = new Circle();
		Circle c5 = new Circle();
		Circle c6 = new Circle();
		Circle c7 = new Circle();

		c1.init();
		c2.init(10);
		c3.init(20);
		c4.init(1, 1);
		c5.init(3, 3);
		c6.init(2, 3, 4);
		c7.init(5, 6, 7);

		c1.print();
		c2.print();
		c3.print();
		c4.print();
		c5.print();
		c6.print();
		c7.print();

	}

}
