package IntMD;
public class LinkList1 {

	private Node head;
	  
	   
	    public  void insert(int data) 
	    {
	        Node newnode=new Node(data);
	        if(this.head==null)
	        {
	            this.head=newnode;
	        }
	        else
	        {
	            newnode.next=head;
	            head=newnode;

	        }

	    }
	   
		public void append(int data)
	    {
	        Node newnode=new Node(data);
	        if(head==null)
	        {
	            head=newnode;
	        }
	        else
	        {
	            Node it=head;
	            while(it.next!=null)
	            {
	                it=it.next;
	            }
	            it.next=newnode;
	            newnode.next=null;
	        }
	    }
	    public int deletefirst()
	    {
	    	int value=-999;
	        if(head==null)
	        {
	            System.out.println("Linklist is empty");
	        }
	        else
	        {
	            if(head.next==null)
	            {
	                head=null;
	            }
	            else
	            {
	            	value=head.data;
	                Node it=head;
	                head=it.next;
	                it.next=null;
	            }

	        }
	        return value;
	    }
	    
	    
	    
	    public void delete_last()
	    {
	        if(head==null)
	        {
	            System.out.println("link list is empty");
	        }
	        else{
	            if(head.next==null)
	            {
	                head=null;
	            }
	            else
	            {
	               Node it=head;
	               while(it.next.next!=null)
	               {
	                   it=it.next;
	               } 
	               it.next=null;
	            }
	        }
	    }
	    public String toString()
	    {
	        String str="";
	        if(head==null)
	        {
	            str=" Link list is empty";
	        }
	        else
	        {
	      	Node it=head;
	        	while(it!=null)
	        	{
	        		str+=it.data+" ,";
	        		it=it.next;
	        	}
	        }
	       return str; 
	    }
	    public int getNodeCount()
	    {
	    	int count=0;
	    	Node it=head;
	    	while(it!=null)
	    	{
	    		count++;
	    		it=it.next;
	    	}
	    	return count;
	    }
	    
	    public void Insert_By_Position(int pos,int data)
	    {
	    	Node newnode=new Node(data);
	    	if(pos==1)
	    	{
	    		insert(data);
	    	}
	    	else if(pos==getNodeCount()+1)//add at last node present node count +1
	    	{
	    		append(data);
	    	}
	    	else if(pos>0 && pos<getNodeCount()+1)
	    	{
	    		Node it=head;//here count increases by 1
	    		for(int i=1;i<pos-1;i++)//  so we make position -1
	    		{
	    			it=it.next;
	    			
	    		}
	    		newnode.next=it.next;
	    		it.next=newnode;
	    	}
	    }
	    
	    
	    public void Delete_By_Position(int pos)
	    {
	    	if(pos==1)
	    	{
	    		deletefirst();
	    	}
	    	else if(pos==getNodeCount())
	    	{
	    		delete_last();
	    	}
	    	else if(pos>0 && pos<getNodeCount()+1)
	    	{
	    		Node it=head;
	    		for(int i=1;i<pos-1;i++)
	    		{
	    			it=it.next;
	    		}
	    	
	    		Node t=it.next;
	    		it.next=it.next.next;
	    		t.next=null;
	    		
	    	}
	    }
	    public void print_forward()
	    {
		        if(head==null)
		        {
		        	System.out.println(" Link list is empty");
		          
		        }
		        else
		        {
		        System.out.println("\n--------------Forward linkedlist----------------");
		      	Node it=head;
		        	while(it!=null)
		        	{
		        		System.out.print(it.data+" ");
		        		it=it.next;
		        	}
		        }
		       
	    }
	    
	    public void print_reverse()
	    {
	    	System.out.println("\n---------Reverse Direction Linklist Elements-----------");
	    	if(head==null)
	    	{
	    		System.out.println("empty linkedlist");
	    	}
	    	else
	    	{
	    		Node it=head;
		    	reverse(it);
	    	}
	    	System.out.println();
	    }
		public void reverse(Node it)
		{
			if(it.next!=null) //terminated condition
			reverse(it.next);
			System.out.print(it.data+" ");//it print reverse data
		}
		
		public void Reverse_likedlist()
		{
			System.out.println(" Linked_list: ");
			Node it=head;
			Node itp=null;
			Node itn=head;
			
			while(it!=null)
			{
				itn=it.next; /*here we store in first next null in 2nd next 100 likewise....*/
				it.next=itp;
				itp=it;
				it=itn;
			}
			head=itp;/* here itp goes to last node and hwe assign last node address to head*/
		}
		
		public void odd_elements()
		{
			System.out.print("\nOdd Element=====>");
			if(this.head==null)
				System.out.println("\nempty linkedlist");
		
			else
			{
				Node it=head;
				while(it!=null) //up to last node
				{
					if(it.data %2!=0)
					{
						
						System.out.print(it.data+" ");
					}
					it=it.next;
				}
			}
			
		}
		
		public void even_elements()
		{
			if(this.head==null)
				System.out.println("\nempty linkedlist");
		
			else
			{
				Node it=head;
				while(it!=null)// up to last node 
				{
					
					if(it.data %2==0)
					{
						System.out.print("\n Even element====>");
						System.out.print(it.data+" ");
					}
					it=it.next;
				}
			}
			
		}
		public void  Biggest_Element()
		{
			if(head==null)
			{
				System.out.println("Likedlist empty");
			}
			else
			{
				Node it=head;
				int max=it.data;
				while(it!=null)
				{
					if(max < it.data)
					{
						max=it.data;
					}
					it=it.next;
				}
				System.out.println("\n Biggest Element====>"+max);
			}
		}
		
		public void Insert_by_value(int checkdata,int data)
	    {
	    	Node it=head;
	    	Node newnode=new Node(data);
	    
	    while(it!=null)
	    	{
	    		
	    		if(it.data==checkdata)
	    		{
	    			newnode.next=it.next;
	    			it.next=newnode;
	    		}
	    		it=it.next;
	    	}
	    	
	    }
		public void Smallest_Elements()
		{
			if(head==null)
			{
				System.out.println("linked list is empty");
			}
			else
			{
				Node it=head;
				int small=it.data;
				while(it!=null)
				{
					if(small>it.data)
					{
						small=it.data;
				
					}
					it=it.next;
				}
				System.out.println("\n Smallest Element======>"+small);
			}
		}
		
		
	    
	}

	

