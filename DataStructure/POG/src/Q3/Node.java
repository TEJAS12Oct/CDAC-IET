package Q3;

public class Node {

	double coff;
	int exp;
	Node next;
	
	Node(double coff,int exp)
	{
		this.coff=coff;
		this.exp=exp;
		this.next=null;
	}

	public double getCoff() {
		return coff;
	}

	public void setCoff(double coff) {
		this.coff = coff;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	
	public String toString() {
		return "Node [coff=" + coff + ", exp=" + exp +  "]";
	}
	
	
}
