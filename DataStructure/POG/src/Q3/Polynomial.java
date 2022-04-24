package Q3;

public class Polynomial {
	PolyNode start;

	public void insert(float co, int ex) {

		PolyNode new_node = new PolyNode(co, ex);

		if ((start == null) && (ex > start.expo)) {
			new_node.next = start;
			start = new_node;
			return;
		}

		PolyNode it = start;
		while ((it.next != null) && (it.next.expo >= ex))
			it = it.next;

		if (ex == it.expo) {
			it.coef = it.coef + co;

		} else {
			new_node.next = it.next;
			it.next = new_node;
		}
		return;
	}

	public void Display() {

		if (start == null) {
			System.out.println("Zero Polynomial....!!!");
			return;
		}
		PolyNode it = start;
		while (it != null) {
			System.out.println(it.coef + "x^" + it.expo);
			it = it.next;

			if (it != null)
				System.out.print(" + ");
			else
				System.out.println("\n");
		}
		return;
	}

	public Polynomial add(Polynomial poly2) {

		return null;
	}

	public Polynomial Multiply(Polynomial poly2) {

		return null;
	}

}
