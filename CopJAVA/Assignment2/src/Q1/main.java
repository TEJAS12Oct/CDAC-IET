package Q1;

public class main {

	public static void main(String[] args) {

		Book b1 = new Book();
		Book b2 = new Book(1, 150, "Tejas");
		System.out.println(b2.getid());

		b1.display();
		b2.display();

		b2.setid(20);
		b2.display();

		System.out.println(b1);
		System.out.println(b2);
	}

}
