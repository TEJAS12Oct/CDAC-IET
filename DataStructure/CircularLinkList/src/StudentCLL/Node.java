package StudentCLL;

public class Node {
	Student data;
	Node next; // next is variable store address

	public Node() {
		data = null;
		next = null;
	}

	public Node(Student data) {
		this.data = data;
		this.next = null;
	}

	public Node(Node next) {
		this.data = null;
		this.next = next;
	}

	public Node(Student data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public String toString() {
		String str="";
		str = data + "";
		return str;
	}
}
