package List;

public class LinkList {

	private Node head;
	
	public LinkList() {
		this.head = null;
	}
	
	public void append(int data)
	{
		Node tmp = new Node(data);
		if(head == null)
		{
			head = tmp;
		}
		else
		{
			Node it = head;
			
			while(it.next != null)
			{
				it = it.next;
			}
			
			//it reached at last node
			it.next = tmp;
			tmp.next = null;
		}
	}
 
	
	@Override
	public String toString() {
		String str = "";
		
		if(head == null)
		{
			str = "LL is empty..";
		}
		else
		{
			Node it = head;
			//while(it.next != null)  ==> this is without last node
			while(it != null)   //  ==> with last node
			{
				str += it + ", ";
				it = it.next;
			}
		}
		return str;
	}

}
