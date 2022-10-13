package OOPS;

class animal {
	void eat() {
		System.out.println("Eating");
	}
}

class Dog extends animal {
	void bark() {
		System.out.println("Barking");
	}
}

public class Single_Inherites {

	public static void main(String[] args) {
		Dog d =new Dog();
		d.bark();
		d.eat();

	}

}
