package IntMD;

public class LinkList {

	private Node head;

	public LinkList() {
		head = null;
	}

	public LinkList(Node head) {
		this.head = head;
	}

	public void insert(int data) { // Insert Time Complexity = o(1)
		Node tmp = new Node(data);

		if (head == null) {
			head = tmp;
		} else {
			tmp.next = head; // head content copy in temp.next
			head = tmp;
		}
	}

	public void append(int data) { // Append Time Complexity = o(1)
		Node tmp = new Node(data);

		if (head == null) {
			head = tmp;
		} else {
			Node it = head;
			while (it.next != null) {
				it = it.next;
			}

			// it reaches at last Node
			it.next = tmp;
			tmp.next = null;
		}
	}

	public int getLLLength() {

		int noOfNodes = 0;
		Node it = head;
		while (it != null) {
			noOfNodes++;
			it = it.next;
		}
		return noOfNodes;
	}

	public void insertByPosition(int value, int pos) {
		int noOfNodes = getLLLength();

		if (pos == 1) {
			insert(value);
		} else if (pos == noOfNodes + 1) {
			append(value);

		} else if (pos > 1 && pos < noOfNodes + 1) {
			Node tmp = new Node(value);
			// we are sure ... inserting in middle
			Node it = head;
			for (int i = 1; i < pos - 1; i++) {
				it = it.next;
			}
			tmp.next = it.next;
			it.next = tmp;
		} else {
			System.out.println("Invalid  Position");
		}
	}

	public void deleteFirst() {

		if (head == null) {
			System.out.println("LinkList  Is Empty ");
		} else {

			// Check if only i node is LL
			if (head.next == null) {
				head = null;

			} else {
				if (head.next == null) {
					head = null;
				} else {
					// More Than 1 Node
					Node t = head;
					head = t.next;
					t.next = null;
				}

			}

		}
	}

	public void deleteLast() {

		if (head == null) {
			System.out.println("LinkList  Is Empty ");
		}
//			else {
//			Node t = null;
//			Node it = head;
//			while (it.next != null) {
//				t = it;
//				it = it.next;
//			}
//			t.next = null;
//			it = null;
//
//		}

		else {
			Node t = head;
			while (t.next.next != null)
				t = t.next;
			t.next = null;
		}

	}

	public void deleteByPosition(int pos) {
		int noOfNodes = getLLLength();

		if (pos == 1) {
			deleteFirst();
		} else if (pos == noOfNodes) {
			deleteLast();

		} else if (pos > 1 && pos < noOfNodes) {

			Node it = head;
			for (int i = 1; i < pos - 1; i++) {
				it = it.next;
			}
			Node t = it.next;
			it.next = t.next;
			t.next = null;
		} else {
			System.out.println("Invalid  Position");
		}
	}

	public void reverseLL() {
		Node it = head;
		Node itp = null;
		Node itn = head;

		while (it != null) {
			itn = it.next;
			it.next = itp;
			itp = it;
			it = itn;
		}
		head = itp;
	}

	public void forwardPrint() {
		if (head == null) {
			System.out.println(" Link list is empty");

		} else {

			Node it = head;
			while (it != null) {
				System.out.print(it.data + " ");
				it = it.next;
			}
		}

	}

	public void reversePrint() {
		System.out.println("Reverse Print = ");
		reversePrintRec(head);
		System.out.println();
	}

	public void reversePrintRec(Node it) { // Recursion
		if (it.next != null)
			reversePrintRec(it.next);
		System.out.print(it.data + " ,"); // Reverse Recursion

	}

//	public void reversePrint() // without recursion
//	{
//		System.out.println("\n---------Reverse Direction Linklist Elements-----------");
//		if (head == null) {
//			System.out.println("empty linkedlist");
//		} else {
//			Node it = head;
//			reverse(it);
//		}
//		System.out.println();
//	}

	public void SmallestNo() {
		Node it = this.head;
		Node min = new Node();
		min.data = 9999999;
		while (it != null) {
			if (it.data < min.data) {
				min.data = it.data;

			}
			it = it.next;
		}
		System.out.println("Smallest No = " + min.data);
	}

	public void biggestNo() {
		Node it = this.head;
		Node max = new Node();
		max.data = 0;
		while (it != null) {
			if (it.data > max.data) {
				max.data = it.data;

			}
			it = it.next;
		}
		System.out.println("Smallest No = " + max.data);

	}

	public void even() {
		System.out.println("Even No = ");
		if (head == null) {
			System.out.println("LinkList  Is Empty ");
		} else {
			Node it = head;
			while (it != null) {
				if (it.data % 2 == 0) {
					System.out.print(it.data + ",");
				}

				it = it.next;
			}
		}

	}

	public void odd() {

		System.out.println("Odd No = ");
		if (head == null) {
			System.out.println("LinkList  Is Empty ");
		} else {
			Node it = head;
			while (it != null) {
				if (it.data % 2 != 0) {
					System.out.print(it.data + ",");
				}

				it = it.next;
			}
		}

	}

	public void insertByNum(int n, int num) {
		Node it = head;
		int pos = 1;
		while (it.data != n) {
			pos++;
			it = it.next;
		}
		insertByPosition(num, pos + 1);

	}

	public String toString() {
		String str = "";

		if (head == null) {
			str = "LinkList  Is Empty";
		} else {
			Node it = head;
			// while (it.next != null) { // this is without last node
			while (it != null) { // with last node

				str += it.data + " , ";
				it = it.next;
			}
		}
		return str;
	}

}
