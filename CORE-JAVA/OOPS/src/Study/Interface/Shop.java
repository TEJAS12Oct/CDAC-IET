package Study.Interface;

public class Shop {

	public static void main(String[] args) {

//		Sellable obj = new Sellable();
		Sellable[] arr = new Sellable[3];
		arr[0] = new Toy("Car", 340, 10);
		arr[1] = new Laptop("DELL", "Intel", "12GB", "1TB", 75000, 12);
		arr[2] = new Toy("Robot", 1000, 20);
		showBill(arr);
	}

	private static void showBill(Sellable[] Purchases) {
		double Total = 0;
		for (Sellable S : Purchases) {
			double Sp = S.getProductSellingPrice();
			System.out.println("Product Info : "+S.getProductInfo() + " " +"Selling Price : "+ Sp);
			Total += Sp;

		}
		System.out.println("Total Bill  : " + Total);
	}

}
