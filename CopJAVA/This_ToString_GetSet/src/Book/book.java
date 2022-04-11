package Book;

public class book {
	private int id;
	private int price;
	private String name;

	book(int id, int price, String name) {
		this.id = id;
		this.price = price;
		this.name = name;

	}

	public String toString() {
		String str = ("ID = " + id + "   name = " + name + "   price = " + price);
		return str;

	}

	public boolean ischeaper(book b2) {
		if (this.price <= b2.price)
			return true;
		else
			return false;

	}
}