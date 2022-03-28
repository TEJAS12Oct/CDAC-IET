/*
Write setPrice(int p) to reset the price of book.
create two objects of book class to call the functions.
*/
package Assignment1;
 

public class BookSP {
	int id, price;
	String name;

	BookSP() {

	}

	BookSP(int x, int y , String z) {
		id = x;
		price = y;
		name = z;

	}

	void display() {
		System.out.println("ID = " + id + " " + "Price = " + price+"   Name = " + name);
	}

	void setPrice(int SetPrice) {
		price = SetPrice;

	}

	public static void main(String[] args) {
		BookSP b = new BookSP();
		BookSP b1 = new BookSP(1, 200,"TEJAS");
		BookSP b2 = new BookSP(2, 150,"JAWALE");
		
		b.display();
		b1.display();
		b2.display();
		b1.setPrice(400);
		b2.setPrice(300);
		b1.display();
		b2.display();

	}

}
