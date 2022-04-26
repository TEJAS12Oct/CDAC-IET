package Q3;

public class Polynomial {

	Node head;

	public Polynomial() {
		this.head = null;
	}

	public void insert(double i, int exp) {
		Node newnode = new Node(i, exp);
		if (head == null || exp > head.exp) {
			newnode.next = head;
			head = newnode;
		} else {
			Node it = head;

			while (it.next != null && it.next.exp >= exp) // 6 5 2 --- 4
			{
				it = it.next;
			}
			if (exp == it.exp) {
				it.coff = it.coff + i;
			} else {
				newnode.next = it.next;

				it.next = newnode;
			}
		}
	}

	public void insertSub(double i, int exp) {
		Node newnode = new Node(i, exp);
		if (head == null || exp > head.exp) {
			newnode.next = head;
			head = newnode;
		} else {
			Node it = head;

			while (it.next != null && it.next.exp >= exp) {
				it = it.next;
			}
			if (exp == it.exp) {
				it.coff = it.coff - i;
			} else {
				newnode.next = it.next;

				it.next = newnode;
			}
		}
	}

	public Polynomial multiplication(Polynomial p2) {
		double coff = 0;
		int exp = 0;
		Polynomial p4 = new Polynomial();
		Node it1 = this.head, it2 = p2.head;
		System.out.println("Multiplication :");
		while (it1 != null) {

			while (it2 != null) {
				coff = it1.coff * it2.coff;
				exp = it1.exp + it2.exp;
				p4.insert(coff, exp);
				it2 = it2.next;
			}
			it1 = it1.next;
			it2 = p2.head;
		}
		return p4;

	}

	public Polynomial addition(Polynomial p2) {
		Node it1 = this.head;
		Node it2 = p2.head;
		Polynomial p4 = new Polynomial();
		System.out.println("Addition :");
		while (it1 != null && it2 != null) {
			if (it1.exp > it2.exp) {
				p4.insert(it1.coff, it1.exp);
				it1 = it1.next;
			} else if (it2.exp > it1.exp) {
				p4.insert(it2.coff, it2.exp);
				it2 = it2.next;

			} else {
				// it1.coff+=it2.coff;
				// double itc=it1.coff+it2.coff; we dont need to do addition becuz if two same
				// exp condition is handle in insert condition

				p4.insert(it1.coff, it1.exp);
				it1 = it1.next;
			}
		}
		if (it1 == null) {
			while (it2 != null) {
				p4.insert(it2.coff, it2.exp);
				it2 = it2.next;
			}
		} else {

			while (it1 != null) {
				p4.insert(it1.coff, it1.exp);
				it1 = it1.next;
			}
		}
		return p4;
	}

	public Polynomial substraction(Polynomial p2) {
		Polynomial p4 = new Polynomial();
		Node it1 = head;
		Node it2 = p2.head;
		System.out.println("Substraction ");
		while (it1 != null && it2 != null) {
			if (it1.exp > it2.exp) {
				p4.insertSub(it1.coff, it1.exp);
				it1 = it1.next;
			} else if (it2.exp > it1.exp) {
				p4.insertSub(it2.coff, it2.exp);
				it2 = it2.next;

			} else {
				// it1.coff+=it2.coff;
				// double itc=it1.coff+it2.coff; we dont need to do Substraction of coff becuz
				// if two same exp condition is handle in insertSub condition

				p4.insertSub(it1.coff, it1.exp);
				it1 = it1.next;
			}
		}
		if (it1 == null) {
			while (it2 != null) {
				p4.insert(it2.coff, it2.exp);
				it2 = it2.next;
			}
		} else {

			while (it1 != null) {
				p4.insert(it1.coff, it1.exp);
				it1 = it1.next;
			}
		}
		return p4;
	}

	public void display() {
		if (head == null) {
			System.out.println("Empty...");
		} else {
			System.out.print("Polynomial : ");
			Node it = head;
			while (it != null) {
				int i = 1;

				System.out.print(it.coff + " ");
				System.out.print("X^");
				System.out.print(" " + it.exp + " ");
				if (it.coff >= 0 && it.next != null) {
					System.out.print(" + ");
				}
				it = it.next;

			}
			System.out.println();
		}
	}

}
