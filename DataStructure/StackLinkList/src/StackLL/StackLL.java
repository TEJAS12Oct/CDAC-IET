package StackLL;

public class StackLL {

	private Node top;

	public StackLL() {
		top = null;
	}

	public StackLL(Node top) {
		this.top = top;
	}

	public void push(int data) { // Insert Time Complexity = o(1)
		Node tmp = new Node(data);

		if (top == null) {
			top = tmp;
		} else {
			tmp.next = top; // top content copy in temp.next
			top = tmp;
		}
	}

	public void pop() {

		if (top == null) {
			System.out.println("Stack LinkList  Is Empty ");
		} else {

			// Check if only i node is LL
			if (top.next == null) {
				top = null;

			} else {
				if (top.next == null) {
					top = null;
				} else {
					// More Than 1 Node
					Node t = top;
					top = t.next;
					t.next = null;
				}

			}

		}
	}
	
	public boolean isEmpty() {
		if(top == null)
		return true;
		else
			return false;
		
	}

	public int peek() {
		if (top != null)
			return top.data;
		else
			return -999;
	}

	public String toString() {
		String str = "";

		if (top == null) {
			str = "Stack LinkList  Is Empty";
		} else {
			Node it = top;
//			while (it.next != null) {  // this is without last  node
			while (it != null) { // with last node

				str += it.data + " , ";
				it = it.next;
			}
		}
		return str;
	}
}
