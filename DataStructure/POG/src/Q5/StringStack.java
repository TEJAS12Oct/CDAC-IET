package Q5;
public class StringStack {
	Node top;

	//Inner class  visibility inside the class
	static class Node{
		String data;
		Node next;

		Node(String d){
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

	public String peek() {
		if(top==null) return "*";
		else return top.data;
	}

	public void push(String d) {
		Node newNode=new Node(d);
		if(top==null) top=newNode;
		else {
			newNode.next=top;
			top=newNode;
		}
	}

	public String pop() {
		String data;
		data=top.data;
		top=top.next;
		return data;
	}

	static String postfixToPrefix(String post) {
		String op1,op2,str,temp;
		char symbol;
		int i;
		char []p=post.toCharArray();
		StringStack s=new StringStack();

		for(i=0;i<p.length;i++) {
			symbol=p[i];

			temp=new String(Character.toString(symbol));

			if(symbol!=32) {
				switch(symbol) {

				case '+':
				case '-':
				case '*':
				case '/':
				case '%':
				case '^':
					op1=new String(s.pop());
					op2=new String(s.pop());
					str=new String(temp).concat(op2).concat(op1);
					s.push(str);
					break;

				default:
					s.push(temp);

				}
			}
		}
		return s.pop();

	}
	
	static String prefixToPostfix(String pre) {
		String op1,op2,str,temp;
		char symbol;
		int i;
		char []p=pre.toCharArray();
		StringStack s=new StringStack();

		for(i=p.length-1;i>=0;i--) {
			symbol=p[i];

			temp=new String(Character.toString(symbol));

			if(symbol!=32) {
				switch(symbol) {

				case '+':
				case '-':
				case '*':
				case '/':
				case '%':
				case '^':
					op1=new String(s.pop());
					op2=new String(s.pop());
					str=new String(op1).concat(op2).concat(temp);
					s.push(str);
					break;

				default:
					s.push(temp);

				}
			}
		}
		return s.pop();

	}

	public static void main(String[] args) {
		
		String postfix="ABC*+D+";
		String prefix=StringStack.postfixToPrefix(postfix);
		System.out.println(prefix);
		
		postfix=StringStack.prefixToPostfix(prefix);
		System.out.println(postfix);
	}

}
