package book;

public class main {

	public static void main(String[] args) {
		book b1 = new book(1, 150, "Tejas");
		book b2 = new book(2, 300, "Jawale");
		System.out.println(b1);
		System.out.println(b2);

		if (b1.ischeaper(b2)) {
			System.out.println("b1 is cheaper than b2");
		} else {
			System.out.println("b1 is not cheaper than b2");
		}
	}

}
