package IntMD;

public class Node1 {
	int data;
	Node next;

	public Node1() {
		data = 0;
		next = null;
	}

	public Node1(int data) {
		this.data = data;
		this.next = null;
	}

	public Node1(Node next) {
		this.data = 0;
		this.next = next;
	}

	public Node1(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}
