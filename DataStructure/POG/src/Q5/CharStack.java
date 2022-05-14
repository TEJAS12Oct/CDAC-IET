package Q5;
public class CharStack {
	Node top;
	
	//Inner class  visibility inside the class
	static class Node{
		char data;
		Node next;
		
		Node(char d){
			data=d;
			next=null;
		}
	}
	
	public boolean isEmpty() {
		if(top==null) 
			return true;
		else 
			return false;
		
	}
	
	public char peek() {
		if(top==null) return '*';
		else return top.data;
	}
	
	public void push(char d) {
		Node newNode=new Node(d);
		if(top==null) top=newNode;
		else {
			newNode.next=top;
			top=newNode;
		}
	}

	public char pop() {
		char data;
		data=top.data;
		top=top.next;
		return data;
	}
	
	/*Traverse exp char by char
	 * 
	 * if char is openning parantheses then push it into stack
	 * 
	 * if char is closing parantheseis then we will pop char from stack
	 * 
	 * we will check popped char with current char (closing),let us write a diff funct
	 * for matching the parantheis () {} []
	 * */
	
	
	boolean match(char a,char b) {
		if(a=='[' && b==']')
			return true;
		if(a=='(' && b==')')
			return true;
		if(a=='{' && b=='}')
			return true;
		
		return false;
	}
	
	boolean check(String exp) {
		int i;
		char temp;
		
		for(i=0;i<exp.length();i++)
		{
			if(exp.charAt(i)=='(' || exp.charAt(i)=='{' || exp.charAt(i)=='[')
				push(exp.charAt(i));
			
			if(exp.charAt(i)==')' || exp.charAt(i)=='}' || exp.charAt(i)==']')
			{
				if(top==null) ///Stack Empty
				{
					System.out.println("Right paranthesis are More");
					return false;
				}
				else {
					temp=pop();
					if(!(match(temp,exp.charAt(i))))
					{
						System.out.println("MisMatch Paranthesis are : "+temp+" "+exp.charAt(i));
						return false;
					}
				}
			}
		}
		if(top==null) {
			System.out.println("Balanced");
			return true;
		}
		else {
			System.out.println("Left Paranthesis are More");
			return false;
		}
	}
	
	public static int prec(char symbol) {
		switch(symbol) {
		case '(':
			return 0;
			
		case '+':
		case '-':
			return 1;
			
		case '*':
		case '/':
		case '%':
			return 2;
			
		case '^':
			return 3;
			
		default:
			return 0;
			
		}
	}
	
	static String infixToPostfix(String exp) {
		CharStack st=new CharStack();
		int i,p=0;
		char symbol,next;
		char []post=new char[exp.length()];
		
		for(i=0;i<exp.length();i++) {
			symbol=exp.charAt(i);
			if(symbol!=32)	//for Space
			{
				switch(symbol)
				{
				case '(': 
					st.push(symbol);
					break;
					
				case ')':
					while((next=st.pop())!='(')
					post[p++]=next;
					break;
					
					
				case '+':
				case '-':
				case '*':
				case '/':
				case '%':
				case '^':
					while((!st.isEmpty()) && (prec(st.peek())>= prec(symbol)))
							post[p++]=st.pop();
					
					st.push(symbol);
					break;
					
				//if symbol is operand
				default:
					post[p++]=symbol;
				}
			}
		}
		
		while(!st.isEmpty())
			post[p++]=st.pop();
		
		String postfix=new String(post);
		
		
		
		return postfix;
	}
	
	
	static String infixToPrefix(String exp) {
		CharStack st=new CharStack();
		int i,p=0;
		char symbol,next;
		char []post=new char[exp.length()];
		
		for(i=exp.length()-1;i>=0;i--) {
			symbol=exp.charAt(i);
			if(symbol!=32)	//for Space
			{
				switch(symbol)
				{
				case ')': 
					st.push(symbol);
					break;
					
				case '(':
					while((next=st.pop())!=')')
					post[p++]=next;
					break;
					
					
				case '+':
				case '-':
				case '*':
				case '/':
				case '%':
				case '^':
					while((!st.isEmpty()) && (prec(st.peek())>prec(symbol)))
							post[p++]=st.pop();
					
					st.push(symbol);
					break;
					
				//if symbol is operand
				default:
					post[p++]=symbol;
				}
			}
		}
		
		while(!st.isEmpty())
			post[p++]=st.pop();
		
		//reverse the string
		
		String prefix=new String(post);
		
		
		return prefix;
	}
	
	static int pow(int n,int m) {
		int p=1;
		for(int i=0;i<=m;i++) {
			p=p*n;
		}
		
		return p;
	}
	
	static int evaluationPost(String post) {
		MyIntStack s=new MyIntStack();
		int a=0,b=0,temp=0,result;
		int i;
		
		char[]p=post.toCharArray();
		for(i=0;i<p.length;i++) {
			if(p[i]>='0' && p[i]<='9')
				s.push(p[i]-48);
			else
			{
				if(!s.isEmpty())
					a=s.pop();
				
				
				if(!s.isEmpty())
					b=s.pop();
				
				switch(p[i])
				{
				case '+':	temp=b+a;	break;
				
				case '-':	temp=b-a;	break;
				
				case '*':	temp=b*a;	break;
				
				case '/':	temp=b/a;	break;
				
				case '%':	temp=b%a;	break;
				
				case '^':	temp=pow(b,a);	break;
				}
				
				s.push(temp);
			}
		}
		result=s.pop();
		return result;
	}
	
	
	public static void main(String []args) {
		CharStack s=new CharStack();
		String exp=("{9+(8*5)-3}");
		
		if(s.check(exp)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
		exp="A+B*C+D";
		String postfix=s.infixToPostfix(exp);
		System.out.println(postfix);
		
		int result=s.evaluationPost("234*+5+");
		System.out.println(result);
		
		String prefix=s.infixToPrefix(exp);
		System.out.println(prefix);
		
	}
}

class MyIntStack{
	Node top;
	
	//Inner class  visibility inside the class
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public boolean isEmpty() {
		if(top==null) 
			return true;
		else 
			return false;
		
	}
	
	public int peek() {
		if(top==null) return '*';
		else return top.data;
	}
	
	public void push(int d) {
		Node newNode=new Node(d);
		if(top==null) top=newNode;
		else {
			newNode.next=top;
			top=newNode;
		}
	}

	public int pop() {
		int data;
		data=top.data;
		top=top.next;
		return data;
	}
}
