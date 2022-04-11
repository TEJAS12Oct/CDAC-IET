package CircularLL;

public class Node {
	int data;
	Node next; // next is variable store address

	public Node() {
		data = 0;
		next = null;
	}

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public Node(Node next) {
		this.data = 0;
		this.next = next;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public String toString() {
		String str="";
		str = data + "";
		return str;
	}
}
