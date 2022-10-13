package OOPS;

public class Encapsulation {
	public static void main(String[] args) {

		// creating instance of the encapsulated class
		Car car = new Car();

		// setting value in the name member
		car.setName("Honda");

		// getting value of the name member
		System.out.println(car.getName());

	}

}

class Car {

	// private variable
	private String name;

	// getter method for name
	public String getName() {
		return name;

	}

	// setter method for name
	public void setName(String name) {
		this.name = name;
	}

}