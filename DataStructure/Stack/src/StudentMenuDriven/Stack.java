package StudentMenuDriven;
public class Stack {
	 
	 private Student []arr;
	 private int top=-1;
	
	Stack(int size)
	{
		this.arr = new Student[size];
		this.top=-1;
	}
	
	public  void push(Student data)
	{
		if(this.top<arr.length-1)
		{
			this.top++;
			this.arr[top]=data;
			
		}
		else
		{
			System.out.println("overflow...........");
		}
			
	}
	public void pop()
	{
		if(this.top>-1)
		{
			System.out.println("pop element is "+ arr[this.top]);
			this.top--;
		}
		else
		{
			System.out.println("underflow.........");
		}
	}
	public String toString()
	{
		String str="";
		if(this.top==-1)
		{
			return "stack is empty";
		}
		else
		{

			for(int i=this.top;i>=0;i--)
			{
				str+=arr[i]+" ";
			}
			
		}
		
			return str;
		
	}
}
