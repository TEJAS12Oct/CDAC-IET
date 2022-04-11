package StudentCLL;

public class StudentCLL {
	private Node head;

	public StudentCLL() {
		head = null;
	}

	public StudentCLL(Node head) {
		this.head = head;
	}

	public void insert(Student data) {
		Node tmp = new Node(data);

		// check for 1st value
		if (head == null) {
			head = tmp;
			head.next = head;
		} else {
			Node it = head;
			while (it.next != head)
				it = it.next;

			it.next = tmp;
			tmp.next = head;
			head = tmp;
			
		}
	}

	public void append(Student data) {
		Node tmp = new Node(data);

		// check for 1st value
		if (head == null) {
			head = tmp;
			head.next = head;
		} else {
			Node it = head;
			while (it.next != head)
				it = it.next;

			it.next = tmp;
			tmp.next = head;
		}
	}

	private int getLLLength() {
		// Find length of LL
		if (head == null)
			return 0;
		else {
			int noOFNodes = 1;
			Node it = head;
			while (it.next != head) {
				noOFNodes++;
				it = it.next;
			}
			return noOFNodes;
		}
	}

	public void InsertByPosition(int position, Student data) {
		int length = getLLLength();

		if (position == 1)
			insert(data);
		else if (position == length + 1)
			append(data);
		else if (position > 1 && position < length + 1) {
			// we are sure.. inserting in middle
			Node tmp = new Node(data);

			Node it = head;
			for (int i = 1; i < position - 1; i++) {
				it = it.next;
			}

			tmp.next = it.next;
			it.next = tmp;
		} else
			System.out.println("Invalid Position...");
	}

	public void DeleteFirst() {
		// Empty
		if (head == null)
			System.out.println("CLL is empty");
		// only 1 node
		else if (head.next == head) {
			head.next = null;
			head = null;
		}
		// more than 1 node
		else {
			Node tmp = head;
			Node it = head;
			while (it.next != head)
				it = it.next;

			head = head.next;
			it.next = head;
			tmp.next = null;
		}
	}

	public void DeleteLast() {
		// Empty
		if (head == null)
			System.out.println("CLL is empty");
		// only 1 node
		else if (head.next == head) {
			head.next = null;
			head = null;
		} else {
			Node it = head.next;
			while (it.next.next != head)
				it = it.next;

			Node tmp = it.next;
			it.next = head;
			tmp.next = null;
		}
	}

	public void DeleteByPosition(int position) {
		int length = getLLLength();

		if (position == 1) {
			DeleteFirst();
		} else if (position == length) {
			DeleteLast();

		} else if (position > 1 && position < length) {

			Node it = head;
			for (int i = 1; i < position - 1; i++) {
				it = it.next;
			}
			Node t = it.next;
			it.next = t.next;
			t.next = null;
		} else {
			System.out.println("Invalid  Position");
		}
	}

	public String toString() {
		String str = "";
		if (head == null)
			str = "CLL is empty";
		else {
			str = str + head.data + " ";
			Node it = head.next;
			while (it != head) {
				str = str + it.data + " ";
				it = it.next;
			}
		}
		return str;
	}
}
