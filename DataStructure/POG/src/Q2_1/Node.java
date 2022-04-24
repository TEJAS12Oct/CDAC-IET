package Q2_1;

public class Node 
{	
		int data;
		Node next;
		
		public Node()
		{
			data =0;
			next =null;		
		}
		
		public Node(int data)
		{
			this.data = data;
			this.next= null;
		}
		
		public String toString()
		{
			String str;
			str = data + "";
			return str;
		}
	}


