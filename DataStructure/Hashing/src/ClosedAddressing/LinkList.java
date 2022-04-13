package ClosedAddressing;

public class LinkList {

	private Node head;

	public LinkList() {
		this.head = null;
	}

	public LinkList(Node head) {
		this.head = head;
	}

	public void insert(String data) {
		Node tmp = new Node(data);

		if (head == null) {
			head = tmp;
		} else {
			tmp.next = head; // head content copy in temp.next
			head = tmp;
		}
	}

	public void append(String data) {
		Node tmp = new Node(data);

		if (head == null) {
			head = tmp;
		} else { // it = iterator // help to move
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
// Find Length OF LL
		int noOfNodes = 0;
		Node it = head;
		while (it != null) {
			noOfNodes++;
			it = it.next;
		}
		return noOfNodes;
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
					// had = head.next;
				}
			}
		}
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("LinkList  Is Empty ");
		} else if (head.next == null) {
			head = null;
		} else {
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

	public int deleteValue(String inputStr) {
		int retValue = 0;
		if (head != null) {
			int count = 1;
			Node it = head;

			while (it != null) {
				if (it.data.equals(inputStr)) {
					deleteByPosition(count);
					retValue = 1;
					break;
				}
				count++;
				it = it.next;
			}
		}
		return retValue;

	}

	public boolean isPresent(String inputStr) {
		if (head != null) {
			Node it = head;
			while (it != null) {
				if (it.data.equals(inputStr))
					return true;

				it = it.next;
			}
		}
		return false;
	}

	public String toString() {
		String str = "";

		if (head == null) {
			str = "LinkList  Is Empty";
		} else {
			Node it = head;
			// while (it.next != null) { // this is without last node
			while (it != null) { // with last node

				str += it.data + " ";
				it = it.next;
			}
		}
		return str;
	}
}
