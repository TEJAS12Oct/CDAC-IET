package Q2_1;

public class LinkedList 
{

	public Node head;

	public LinkedList()
	{
		this.head = null;
	}
	public LinkedList(Node head)
	{
		this.head = head;
	}
//1.insert at first position
	public void insertFirst(int data)
	{
		Node newNode = new Node(data);

		if(head==null)
		{
			head=newNode;
			//return
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}

	}
//2.insert at last position
	public void append(int data)
	{
		Node newNode = new Node(data); //new node = 4000

		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node it=head;
			while(it.next!=null)
			{
				it=it.next;  //it=2000
			}
			it.next=newNode;

		}
	}
//3. insert by position
	public void insrtByPos(int data,int pos)
	{
		Node newNode = new Node(data);
		int i;
		Node it=head;
		if(pos==1)
		{
			newNode.next=head;
			head=newNode;
		}
		else
		{
			for(i=1;(i<(pos-1)&&(it.next!=null));i++)
			{
				it=it.next;
			}
			newNode.next=newNode;
			it.next=newNode;
		}
	}
	
	public Node detectCycle()
	{
		Node slow,fast;
		slow = fast = head;
		if(head == null)
		{
			System.out.println("CYCLE NOT DETECTED LL IS EMPTY ");
			return null;
		}
		while((fast != null) && (fast.next!= null))
		{
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow)
			{
				return fast; //c 
			}
		}
		return null;
	}
	
	public int lengthList(Node c)
	{
		Node it = c; //initiating 
		int cnt1 = 0,cnt2 = 0;
		
		do {
			cnt1++;
			it = it.next;
		}
		while(it!=c);
		
		it = head;
		while(it != c ) 
		{
			cnt2++; //c
			it= it.next;
			c= c.next;
		}
		return (cnt1+cnt2);	
	}
	
	public void creatCycle(int num)
	{
		if(head == null)
		{
			System.out.println(" LL IS EMPTY ");
			return ;
		}
		Node it, prev,temp;
		
		it=this.head;
		prev = temp = null;
		
		while(it != null)
		{
			prev = it;
			if(it.data == num)
			{
				temp = it;
			}
			it = it.next;
		}
		
		if( temp != null)
		{
			prev.next= temp;
		}
		else
		{
			System.out.println(" NODE NOT FOUND ");
		}
	}
	
	
		public String toString() 
		{
			String str = "";
			if(head== null)
			{
				str = "LL is empty";
			}
			else
			{
				Node it = head;
				
				//while(it.next !=null) //this is without last node
		      while(it !=null) //with last node
				{
				str+= it.data+ ",";
				it=it.next;
				}
				
			}
			return str;
		}
}	
	
	
	
	
	
	
	



