package DoublyLL;

public class Node {

	Node prev;
	int data;
	Node next; // next is variable store address

	public Node() {
		prev = null;
		data = 0;
		next = null;
	}

	public Node(int data) {
		this.prev = null;
		this.data = data;
		this.next = null;
	}

	public Node(Node prev, Node next) {
		this.prev = prev;
		this.data = 0;
		this.next = next;
	}

	public Node(Node prev, int data, Node next) {
		this.prev = prev;
		this.data = data;
		this.next = next;
	}

	public String toString() {
		String str = "";
		str = "" + data;
		return str;
	}

}
