package CircularQueue;

public class CQueue {
	
	int []arr;
	int front;
	private int rear;
	
	CQueue()
	{
		this.arr=new int [5];
		this.front=-1;
		this.rear=-1;
	}
	CQueue(int a)
	{
		this.arr=new int [a];
		front=-1;
		this.rear=-1;
	}
	public void insert(int data)
	{
		if(front==-1)
		{
			front++;
		}
		if(this.rear<arr.length-1&& front!=-1) 
		{
			if(rear<arr.length-1)
			{
				rear++; //-1
							}
			else
			{
				rear=0;
			}
		}
		else
		{
			System.out.println("full");
		}
		arr[rear]=data;

	}
	public int remove()
	{
		int value=0;
		if(front==-1||rear==-1)
		{
			System.out.println("empty");
		}
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		if(front!=rear)
		{
			value=arr[front];
			
			if(front!=arr.length-1)
			{
				front++;
				
			}
			else
				front=0;
		}
		else
		{
			System.out.println("empty");
		}
		return value;
	}
	public String toString()
	{ 
		String str="Queue ele:";
		if(front==-1 || rear==-1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(int i=front;i!=rear;)
			{
				str=str+arr[i]+" ";
				
				if(i!=arr.length-1)
				{
					i++;
				}
				else
				{
					rear=0;
				}
			}
			str=str+arr[rear];
		}
		return str;
		
	}
	
}
