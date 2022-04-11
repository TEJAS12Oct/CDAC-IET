package EmployeeQueueLL;

public class QueueLL {

	private Node front;

	public QueueLL() {
		front = null;
	}

	public QueueLL(Node front) {
		this.front = front;
	}

	public void insert(Employee data) { // Insert Time Complexity = o(1)
		Node tmp = new Node(data);

		if (front == null) {
			front = tmp;
		} else {
			Node it = front;
			while (it.next != null) {
				it = it.next;
			}

			// it reaches at last Node
			it.next = tmp;
			tmp.next = null;
		}
	}

	public void Remove() {
		System.out.println("Remove = ");
		if (front == null) {
			System.out.println("Queue LinkList  Is Empty ");
		} else {

			// Check if only i node is LL
			if (front.next == null) {
				front = null;

			} else {
				if (front.next == null) {
					front = null;
				} else {
					// More Than 1 Node
					Node t = front;
					front = t.next;
					t.next = null;
				}

			}

		}
	}

	public boolean isEmpty() {
		if (front == null)
			return true;
		else
			return false;

	}

	public Employee peek() {
		if (front != null)
			return front.data;
		else
			return null;
	}

	public String toString() {
		String str = "";

		if (front == null) {
			str = "LinkList  Is Empty";
		} else {
			Node it = front;
//			while (it.next != null) {  // this is without last  node
			while (it != null) { // with last node

				str += it.data + " , ";
				it = it.next;
			}
		}
		return str;
	}
}
