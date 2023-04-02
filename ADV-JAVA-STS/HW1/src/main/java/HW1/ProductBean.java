package HW1;

public class ProductBean {
	String Name, Description;
	int Cost;

	public ProductBean() {
		
		System.out.println("Hello HABIBI...!!!");

	}

	public ProductBean(String name, String description, int cost) {
		Name = name;
		Description = description;
		Cost = cost;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}

}
