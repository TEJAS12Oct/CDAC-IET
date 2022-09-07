package Study.Beans;

import org.springframework.stereotype.Component;

@Component
public class PublisherBean {

	private String name, city;

	public PublisherBean() {
		name = "Oreilly Publication";
		city = "Nashik";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
