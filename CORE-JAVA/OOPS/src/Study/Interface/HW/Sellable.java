package Study.Interface.HW;

public interface Sellable {
	String getProductInfo();

	public abstract double getProductSellingPrice();
}

class IceCream implements Sellable, Packable {
	String Name;
	double Cost;

	IceCream() {
	}

	public IceCream(String name, double cost) {
		super();
		Name = name;
		Cost = cost;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	@Override
	public String getProductInfo() {
		return "IceCream \nFlavour : " + Name + ", Price : " + Cost;
	}

	@Override
	public double getProductSellingPrice() {
		double SP = Cost;
		return SP;
	}

	@Override
	public String getPackingDeails() {
		return "IceCream Pack";
	}

	@Override
	public String toString() {
		return "IceCream [Name=" + Name + ", Cost=" + Cost + "]";
	}

}

class Clothes implements Sellable, Packable {
	String Gender, Name;
	double Cost, Discount;

	Clothes() {
	}

	public Clothes(String gender, String name, double cost, double discount) {
		super();
		Gender = gender;
		Name = name;
		Cost = cost;
		Discount = discount;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	public double getDiscount() {
		return Discount;
	}

	public void setDiscount(double discount) {
		Discount = discount;
	}

	@Override
	public String getProductInfo() {
		return "Clothes \nGender : " + Gender + ", Name : " + Name + ", Cost : " + Cost + ", Discount : " + Discount;
	}

	@Override
	public double getProductSellingPrice() {
		double sp = Cost - (Discount * Cost / 100);
		return sp;
	}

	@Override
	public String getPackingDeails() {
		return "Clothes Pack";
	}

	@Override
	public String toString() {
		return "Clothes [Gender=" + Gender + ", Name=" + Name + ", Cost=" + Cost + ", Discount=" + Discount + "]";
	}
}