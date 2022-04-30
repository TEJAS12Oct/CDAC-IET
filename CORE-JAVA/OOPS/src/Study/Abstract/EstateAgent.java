package Study.Abstract;

public class EstateAgent {

	public static void main(String[] args) {

//		showCostOfPlot(new Shape());
		showCostOfPlot(new Circle(8));
		showCostOfPlot(new Rectangle(30, 40));
	}

//    	CLOSED FOR MODIFICATION	
	public static void showCostOfPlot(Shape Shape) {
		final double PER_SQR_FT_COST = 5700;
//		double cost = 0;
		double cost = Shape.area() * PER_SQR_FT_COST;

//		if (Shape instanceof Circle) {
//			cost = ((Circle) Shape).AreaOfCircle() * PER_SQR_FT_COST;
//		}
//
//		if (Shape instanceof Rectangle) {
//			cost = ((Rectangle) Shape).AreaOfRectangle() * PER_SQR_FT_COST;
//		}

		System.out.println("The Cost Of Plot is  : " + cost);
	}
}
