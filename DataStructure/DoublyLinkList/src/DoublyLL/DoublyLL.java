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
		if (tail == null) { // (head == null)
			head = tmp;
			tail = tmp;
		} else {
			tail.next = tmp;
			tmp.prev = tail;
			tail = tmp;
		}

	}

	public int getNodeCount() {
		int count = 0;
		Node it = head;
		while (it != null) {
			count++;
			it = it.next;
		}
		return count;
	}

	public void insert_by_position(int pos, int data) {
		Node tmp = new Node(data);
		if (pos == 1) {
			insert(data);
		} else if (pos == getNodeCount() + 1) {
			append(data);
		} else if (pos > 1 && pos < getNodeCount() + 1) {
			Node it = head;
			for (int i = 1; i < pos - 1; i++) {
				it = it.next;
			}
			/*
			 * Node tmp=it.next; it.next=newnode; newnode.pre=it; newnode.next=tmp;
			 * tmp.pre=newnode;
			 */
			tmp.next = it.next;
			tmp.prev = it;
			tmp.next.prev = tmp;
			it.next = tmp;

		}
	}

	public void deleteFirst() {

		/// check for empty
		if (head == null) {
			System.out.println("DoublyLL is Empty");
		} else {
			// Check if we have only 1 Node

			if (head.next == null) {
				head = null;
				tail = null;
			} else {
				// more than 1 Node
				Node tmp = head;
				head = tmp.next;
				tmp.next = null;
				head.prev = null;
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
				tail.prev.next = null;
				tail = tail.prev;
				tmp.prev = null;

			}
		}
	}

	public void deleteByPos(int pos) {
		int count = getNodeCount();
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
			it.next = it.next.next;
			it.next.prev = it;
			tmp.next = null;
			tmp.prev = null;

		} else {
			System.out.println("Invalid Positon");

		}

	}

	public void print_forward() {
		System.out.print("Forward Print = ");
		Node it = head;
		if (head == null) {
			System.out.println(" Doubly LL is empty");
		} else {
			while (it != null) {
				System.out.print(it.data + " ");
				it = it.next;
			}
		}
		System.out.println();
	}

	public void print_reverse() {
		System.out.print("\nReverse Print = ");
		if (tail == null) {
			System.out.println(" Dll is null");
		} else {
			Node it = tail;
			while (it != null) {
				System.out.print(it + " ");
				it = it.prev;
			}
		}
		System.out.println();
	}

	public void even_no() {
		System.out.print("\neven no = ");
		if (head == null) {
			System.out.println("Doubly LL is empty");
		} else {
			Node it = head;
			while (it != null) {
				if (it.data % 2 == 0) {
					System.out.print(it + " ");
				}
				it = it.next;
			}
		}
		System.out.println();
	}

	public void odd_no() {
		System.out.print("\nodd no = ");
		if (head == null) {
			System.out.println("Doubly LL is empty");
		} else {
			Node it = head;
			while (it != null) {
				if (it.data % 2 != 0) {
					System.out.print(it + " ");
				}
				it = it.next;
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
