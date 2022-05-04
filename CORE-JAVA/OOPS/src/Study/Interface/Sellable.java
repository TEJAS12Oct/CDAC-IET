package Study.Interface;

public interface Sellable {

//  by Default Each Method Is public  Abstract
	String getProductInfo();

	public abstract double getProductSellingPrice();

}

// Toy is Sellable
class Toy implements Sellable, Packable {

	private String Name;
	private double cost;
	private double Discount;

	Toy() {
	}

	public Toy(String name, double cost, double discount) {
		super();
		Name = name;
		this.cost = cost;
		Discount = discount;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getDiscount() {
		return Discount;
	}

	public void setDiscount(double discount) {
		Discount = discount;
	}

	@Override
	public String getProductInfo() {
		return Name + " " + cost;
	}

	@Override
	public double getProductSellingPrice() {
		double sp = cost - (Discount * cost / 100);
		return sp;
	}

	@Override
	public String toString() {
		return "Toy [Name=" + Name + ", cost=" + cost + ", Discount=" + Discount + "]";
	}

	@Override
	public String getPackingDeails() {

		return "Card Board Box Packing";
	}

} // EOC TOT

class Laptop implements Sellable, Packable {
	String brand, cpu, ramSize, HDsize;
	double cost, gst;

	Laptop() {
	}

	public Laptop(String brand, String cpu, String ramSize, String hDsize, double cost, double gst) {
		super();
		this.brand = brand;
		this.cpu = cpu;
		this.ramSize = ramSize;
		HDsize = hDsize;
		this.cost = cost;
		this.gst = gst;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public String getHDsize() {
		return HDsize;
	}

	public void setHDsize(String hDsize) {
		HDsize = hDsize;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	@Override
	public String getProductInfo() {
		return brand + " " + cost;
	}

	@Override
	public double getProductSellingPrice() {
		double SP = cost + (gst * cost / 100);
		return SP;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", cpu=" + cpu + ", ramSize=" + ramSize + ", HDsize=" + HDsize + ", cost="
				+ cost + ", gst=" + gst + "]";
	}

	@Override
	public String getPackingDeails() {
		return "Pack With Cushioning Bubble Plastic In a CardBoard Box ";
	}

}// EOC Laptop