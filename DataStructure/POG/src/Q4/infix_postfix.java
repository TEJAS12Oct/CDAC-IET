package Q4;

class CharStack_2
{
	Node top;

	static class Node
	{
		char data;
		Node next;

		Node (char d)
		{
			data = d;
			next=null;
		}
	}

	public boolean isEmpty() {
		if(top==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public char peek()
	{
		if (top==null)
		{
			return '*';
		}
		else
		{
			return top.data;
		}
	}

	public void push(char d)
	{
		Node new_node =new Node(d);
		if (top==null)
		{
			top=new_node;
		}
		else
		{
			new_node.next=top;
			top=new_node;
		}
	}

	public char pop()
	{
		char data;
		data = top.data;
		top=top.next;
		return data;
	}


	public static int prec(char symbol)
	{
		switch(symbol) 
		{
		case'(' :
			return 0;

		case '+' :

		case '-' :
			return 1;

		case '*' :

		case '/' :

		case '%' :
			return 2;

		case '^' :
			return 3;

		default :
			return 0;

		}
	}

	static String infix_to_postfix (String infix)
	{
		CharStack_2 st = new CharStack_2();

		int i,p=0;
		char symbol,next;
		char post []=new char[infix.length()+1];

		for(i=0;i<infix.length();i++)
		{
			symbol = infix.charAt(i);
			if (symbol!=32)
			{
				switch(symbol)
				{
				case '(' :
					st.push(symbol);
					break;

				case ')' :
					while((next=st.pop()) != '(')
					{
						post[p++]=next;
					}
					break;

				case '+' :

				case '-' :

				case '*' :

				case '/' :

				case '%' :

				case '^' :

					while((!st.isEmpty()) && (prec(st.peek())>=prec(symbol)))
					{
						post [p++]=st.pop();
					}
					st.push(symbol);
					break;

				default :
					//if symbol is operand..
					post[p++]=symbol;
				}
			}
		}
		while(!st.isEmpty())
		{
			post[p++]=st.pop();
		}
		String postfix = new String(post);
		return postfix;
	}
}
public class infix_postfix 
{
	public static void main(String[] args) 
	{
		CharStack_2 ve = new CharStack_2();
		String exp = new String("A+B*C+D");
		
		String Post = CharStack_2.infix_to_postfix(exp);
		System.out.println(Post);
		
		
	}

}
