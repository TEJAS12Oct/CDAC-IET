package Study.Interface.HW;

public class Shop {

	public static void main(String[] args) {

		Sellable[] arr = new Sellable[3];
		arr[0] = new IceCream("Chocolate", 300);
		arr[1] = new Clothes("Male", "T-shirt", 500, 20);
		arr[2] = new IceCream("Rajbhog", 340);
		showBill(arr);
	}

	private static void showBill(Sellable[] Purchases) {
		double Total = 0;
		for (Sellable S : Purchases) {
			double Sp = S.getProductSellingPrice();
			System.out.println(
					S.getProductInfo() + ",\nSelling Price : " + Sp + "\nPacking Details : " + ((Packable) S).getPackingDeails() + "\n");
			Total += Sp;

		}
		System.out.println("Total Bill  : " + Total);
	}

}
