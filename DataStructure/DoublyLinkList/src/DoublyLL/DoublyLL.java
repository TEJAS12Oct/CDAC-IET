package DoublyLL;

public class DoublyLL {

	Node head;
	Node tail;

	public DoublyLL() {
		this.head = null;
		this.tail = null;
	}

	public DoublyLL(Node head, Node tail) {
		this.head = head;
		this.tail = tail;
	}

	public void insert(int value) {

		Node tmp = new Node(value);

		// check for 1st value
		if (head == null) {
			head = tmp;
			tail = tmp;
		} else {
			head.prev = tmp;
			tmp.next = head;
			head = tmp;
		}
	}

	public void append(int value) {
		Node tmp = new Node(value);

		// check for 1st value
		if (tail == null) {
			head = tmp;
			tail = tmp;
		} else {
			tail.next = tmp;
			tmp.prev = tail;
			tail = tmp;
		}

	}

	public void deleteFirst() {

		/// check for empty
		if (head == null) {
			System.out.println("DoublyLL is Empty");
		} else {
			// Check if we have only 1 Node
			if (head.prev == null) {
				head = null;
				tail = null;
			} else {
				// more than 1 Node
				Node tmp = head;
				head = head.prev;
				tmp.next = null;
				head.prev = null;
				tmp = null;
			}
		}

	}

	public void deleteLast() {
		// check for empty
		if (tail == null) {
			System.out.println("DoublyLL is Empty");
		} else {
			// Check if we have only 1 Node
			if (tail.prev == null) { // if(head.next == null) //if(head==tail
				head = null;
				tail = null;
			} else {
				// more than 1 Node
				Node tmp = tail;
				tail = tail.prev;
				tail.next = null;
				tmp.prev = null;

				tmp = null;
			}
		}
	}

	private int getDLLength() {

		int noOfNodes = 0;
		Node it = head;
		while (it != null) {
			noOfNodes++;
			it = it.next;
		}
		return noOfNodes;
	}

	public void deleteByPos(int pos) {
		int count = getDLLength();
		if (pos == 1) {
			deleteFirst();
		} else if (pos == count) {
			deleteLast();

		} else if (pos > 1 && pos < count) {
			// Middle element
			Node it = head;
			for (int i = 1; i < pos - 1; i++) {
				it = it.next;
			}
			Node tmp = it.next;
			it.next = tmp.next;
			tmp.next.prev = it;

			tmp.next = null;
			tmp.prev = null;

			tmp = null;

		} else {
			System.out.println("Invalid Positon");

		}

	}

	public void reverseprint() {
		System.out.println("Reverse Print = ");
		if (tail == null) {
			System.out.println("DoublyLL is Empty");
		} else {
			Node it = tail;
			while (it != null) {
				System.out.println(it + " ,");
				it = it.prev;
			}
		}
		System.out.println();
	}

	public String toString() {
		String str = "";

		if (head == null) {
			str = "DoublyLL  Is Empty";
		} else {
			Node it = head;

			while (it != null) {

				str += it + " , ";
				it = it.next;
			}
		}
		return str;
	}

}
