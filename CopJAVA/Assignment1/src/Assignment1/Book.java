/*
 Q3.Create a class Book(bookId,bookName,bookPrice)
1.Write no argument constructor 
2.Write parameterized constructor.
3.Write display function to display all the book information
*/

package Assignment1;

public class Book {
	int id;
	int price;
	String name;

	Book() {
		
	}

	Book(int x, int y , String z) {
		 id = x;
		 price = y;
		 name = z;
		
	}

	void display() {
		System.out.println("ID = " + id + " " + "Price = " + price +"   Name = " + name);
	}

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book(1, 150,"Tejas");
		
		b1.display();
		b2.display();

	}

}
