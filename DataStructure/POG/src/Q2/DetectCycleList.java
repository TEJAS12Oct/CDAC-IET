package Q2;

public class DetectCycleList {

	public Node head;

	public DetectCycleList() {
		this.head = null;
	}

	public DetectCycleList(Node head) {
		this.head = head;
	}

	public void insertFirst(int data) {
		Node new_node = new Node(data);

		if (head == null) {
			head = new_node;
			// return
		} else {
			new_node.next = head;
			head = new_node;
		}

	}

	public void insert_last(int data) { // append
		Node new_node = new Node(data);
		if (head == null) {
			head = new_node;
			return;
		}
		Node it = head;
		while (it.next != null) {
			it = it.next;
		}
		it.next = new_node;
		return;
	}

	public void insrtByPos(int data, int pos) {
		Node newNode = new Node(data);
		int i;
		Node it = head;
		if (pos == 1) {
			newNode.next = head;
			head = newNode;
		} else {
			for (i = 1; (i < (pos - 1) && (it.next != null)); i++) {
				it = it.next;
			}
			newNode.next = newNode;
			it.next = newNode;
		}
	}

	public void insert_cycle(int data) {
		Node psave = null;
		Node it = head;
		Node prev = null;

		if (it == null) {
			System.out.println("Empty LL");
			return;
		}

		while (it != null) {
			prev = it;
			if (it.data == data) {
				psave = it;
			}
			it = it.next;
		}

	}

	public Node FindCycle() {
		Node slow, fast;
		slow = fast = head;
		if (head == null) {
			System.out.println("CYCLE NOT DETECTED LL IS EMPTY ");
			return null;
		}
		while ((fast != null) && (fast.next != null)) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				System.out.println("Starting Node Of Cycle = " + slow);
			return slow;
		}
		return null;
	}

	public int lengthList(Node C) {
		Node it1, it2;
		int len_cycle = 0, rem_len = 0;
		it1 = it2 = C;

		do {
			len_cycle = len_cycle + 1;
//			it2 =it2.next;
		} while (it1 != it2);

		System.out.println("Cycle length = " + len_cycle);
		it1 = head;
		System.out.println("Starting Node Of Cycle = " + it1);

		while (it1 != it2) {
			rem_len = rem_len + 1;
			it1 = it1.next;
		}
//		System.out.println("Starting Node Of Cycle = " + it1);
		return len_cycle + rem_len;

	}

	public String toString() {
		String str = "";

		if (head == null) {
			str = "LinkList  Is Empty";
		} else {
			Node it = head;
//			while (it.next != null) {     // this is without last node
			while (it != null) { // with last node

				str += it.data + " , ";
				it = it.next;
			}
		}
		return str;
	}

}
