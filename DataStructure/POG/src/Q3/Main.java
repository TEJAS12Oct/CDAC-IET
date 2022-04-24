// Polynomial Implementation Using SinglyLL
package Q3;

public class Main {

	public static void main(String[] args) {
		Polynomial poly1 = new Polynomial();
		poly1.insert(1, 3);
		poly1.insert(7.5f, 5);
		poly1.insert(3, 3);
		poly1.insert(5.5f, 6);
		poly1.insert(9, 4);
		poly1.insert(2.5f, 5);
		poly1.insert(3, 2);

		Polynomial poly2 = new Polynomial();
		Polynomial poly3 = new Polynomial();
		poly3 = poly1.add(poly2);
		poly3.Display();

		poly3 = poly1.Multiply(poly2);
		poly3.Display();

	}

}
