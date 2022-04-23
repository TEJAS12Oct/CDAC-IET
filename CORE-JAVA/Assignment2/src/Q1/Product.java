package Q1;

public class Product {

	private String Name;
	private String Descrip;
	private double Cost;
	MyDate ExpiryDate;

	public Product() {
	}

	public Product(String name, String descrip, double cost, MyDate expiryDate) {
		Name = name;
		Descrip = descrip;
		Cost = cost;
		ExpiryDate = expiryDate;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescrip() {
		return Descrip;
	}

	public void setDescrip(String descrip) {
		Descrip = descrip;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	public MyDate getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(MyDate expiryDate) {
		ExpiryDate = expiryDate;
	}

}
