package Q4;

public class CharStack_1 {

	Node top;
	static class Node // static class
	{
		char data;
		Node next;


		Node(char d)
		{
			data=d;
			next=null;
		}
	}// end of static class

	public boolean isEpty()
	{
		if(top==null)
			return true;
		else
			return false;
	}
	public char peek()
	{
		if(top==null)return '*';
		else
			return top.data;

	}
	public void push(char d)
	{
		Node new_node=new Node(d);
		if(top==null)
			top=new_node;
		else
		{
			new_node.next=top;
			top=new_node;
		}
	}
	public char pop()
	{
		char data;
		data=top.data;
		top=top.next;
		return data;
	}

	boolean match(char a ,char b)
	{
		if(a=='[' && b==']')return true;
		if(a=='{' && b=='}')return true;
		if(a=='(' && b==')')return true;
		else
			return false;
		
	}
	boolean  check(String exp)
	{
		int i;
		char temp;
		for(i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)=='('||exp.charAt(i)=='{' || exp.charAt(i)=='[')
			{
				push(exp.charAt(i));
			}
			if(exp.charAt(i)==')'||exp.charAt(i)=='}' || exp.charAt(i)==']')
			{
				if(top==null)
				{
					System.out.println("right parantheses are more");
					return false;
				}
				else
				{
					temp=pop();
					if(!match(temp,exp.charAt(i)))
					{
						System.out.println("mismatch parantheses are :"+temp+" "+exp.charAt(i));
						return false;
					}
				}
				
			}
		}
		if(top==null)
		{
			System.out.println("balanced");
			return true;
		}
		else
		{
			System.out.println("left parantheses are more");
			return false;
		}
		
	}// end of function
	
	
	public static void main(String args [])
	{
		CharStack_1 ve = new CharStack_1();
		String exp=new  String("{9+(8*5)-3}");
		if(ve.check(exp))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	
	}

}
