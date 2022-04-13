package ClosedAddressing;

public class Node {

	String data;
	Node next;

	public Node() {
		data = null;
		next = null;
	}

	public Node(String data) {
		this.data = data;
		this.next = null;
	}

	public Node(Node next) {
		this.data = null;
		this.next = next;
	}

	public Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}

}
