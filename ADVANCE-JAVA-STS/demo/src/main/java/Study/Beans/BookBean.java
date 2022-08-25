package Study.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
@Lazy
public class BookBean {
	private String name;
	private double cost;

//	@Autowired
	private PublisherBean publisher;

	public BookBean() {
		setName("20 thousand leagues under the sea");
		setCost(300);
		System.out.println("book bean constructors ..");
	}

	// @Autowired ---this cannot happen because the two parameter are not beans
	public BookBean(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
		System.out.println("Beook Bean Constructor called with 2 Parameter");
	}

	// Container will have to use this constructor to create BookBean
	// container must pass parameter to the constructor i.e...publisehrBean
	// container searches for another bean of type PublisherBean and injects it
	// @Autowired
	public BookBean(PublisherBean publisher) {
		super();
		this.name = "The Goal";
		this.cost = 300;
		this.publisher = publisher;
		System.out.println("BOOKBEAN constructor with 1 paramter publisher bean");

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

	public PublisherBean getPublisher() {
		return publisher;
	}

	@Autowired
	public void setPublisher(PublisherBean publisher) {
		this.publisher = publisher;
	}

}
