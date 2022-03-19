package CODE;

public class Circle {
	int centreX;
	int centreY;
	int radius;
	
	void init() {
		centreX = 0;
		centreY = 0;
		radius = 1;
	}
	
	void init(int x ,int y) {
		centreX = x;
		centreY = y;
		radius = 1;
	}
	
	void init(int x ,int y,int r) {
		centreX = x;
		centreY = y;
		radius = r;
	}

	// centre : (0,0) radius : 1
	void print() {
		System.out.println("Centre: ("+ centreX + "," + centreY + ") Radius :"  + radius);

	}

	public static void main(String[] args) {
		Circle  c1 =  new Circle();
		Circle  c2 =  new Circle();
		Circle  c3 =  new Circle();
		
		
		c1.init();
		c2.init(1,1);
		c3.init(2,3,4);
		
		c1.print();
		c2.print();
		c3.print();
		

	}

}
