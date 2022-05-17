package Q1;

public class Node {
	public Employee Data;
	public Node Next;  

	

	public Node() {
		Data = null;
		Next = null;
	}

	public Node(Employee Data) {
		this.Data = Data;
		this.Next = null;
	}

	public Node(Node Next) {
		this.Data = null;
		this.Next = Next;
	}

	public Node(Employee data, Node Next) {
		this.Data = data;
		this.Next = Next;
	}
	
	
	public String toString() {
		String str = "" ;
		str = "Data = " + Data ;//+ ", Next=" + Next ;
		return str;
	}

}
