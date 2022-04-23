package Employee;

public class EmpLinklist {
	private Node head;

	public EmpLinklist() {
		head = null;
	}

	public EmpLinklist(Node head) {
		this.head = head;
	}

	public void insert(Employee data) { // Insert Time Complexity = o(1)

		Node tmp = new Node(data);

		if (head == null) {
			head = tmp;
		} else {
			tmp.next = head; // head content copy in temp.next
			head = tmp;
		}
	}

	public void append(Employee data) { // Append Time Complexity = o(1)
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
		} else {
			Node t = null;
			Node it = head;
			while (it.next != null) {
				t = it;
				it = it.next;
			}
			t.next = null;
			it = null;

		}

	}

	public String toString() {
		String str = "";

		if (head == null) {
			str = "LinkList  Is Empty";
		} else {
			Node it = head;
//			while (it.next != null) {  // this is without last  node
			while (it != null) { // with last node

				str += it.data + " , ";
				it = it.next;

			}
		}
		return str;
	}

}
