package Study.Beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class BookBean {
	private String name;
	private double cost;
	
	public BookBean()
	{
		setName("20 thousand leagues under the sea");
		setCost(300);
		System.out.println("book bean constructors ..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	

}
