package EmployeeMD;

public class Queue {

	private Employee arr[];
	int rear;
	int front;
	
	Queue(int size)
	{
		this.arr=new Employee[size];
		this.rear=-1;
		this.front=-1;
		
	}
	public String toString()
	{
		String str="";
		if(front==-1)
		{
			str="Queue is empty";
		}
		else
		{
			System.out.println("QUEUE");
			for(int i=front;i<=rear;i++)
			{
				str=str+arr[i]+"  ";
			}
		}
		str+="\n";
		return str;
	}
	public void insert(Employee value)
	{
		if(this.rear<arr.length-1)//4 -1<4 0 1 2 3 4<4
		{
			
			rear++;
			arr[rear]=value;
			if(front==-1)
			{
				front++;
			}
		}
		else
		{
			System.out.println("Queque is full");
		}
	}
	public void remove()
	{
	
		if(front!=-1)
		{
			System.out.println(arr[front]);

			if(front!=rear)
			{
				front++;
				
			}
			else
			{
				front=rear=-1;
			}
	
		}
		else
		{
			System.out.println("Queue is empty");
		}
		
		
	}
}