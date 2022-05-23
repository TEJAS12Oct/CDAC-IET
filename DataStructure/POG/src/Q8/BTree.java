package Q8;
import java.util.LinkedList;
import java.util.Queue;



public class BTree {
	Node root;
	
	public void insert(int data) {
		Node newNode=new Node(data);
		Queue<Node> q=new LinkedList<Node>();
		
		if(root==null) {
			root=newNode;
			return;
		}
		
		Node temp=root;
		q.add(temp);
		while(!q.isEmpty()) {
			temp=q.remove();
			if(temp.left==null) {
				temp.left=newNode;
				break;
			}
			else {
				q.add(temp.left);
			}
			
			if(temp.right==null) {
				temp.right=newNode;
				break;
			}
			else {
				q.add(temp.right);
			}
		}
	}
	
	public void levelDisplay() {
		Node temp=root;
		
		Queue<Node> q=new LinkedList<Node>();
		
		if(temp==null) {
			System.out.println("Tree is empty");
			return;
		}
		
		q.add(temp);
		
		while(!q.isEmpty()) {
			temp=q.remove();
			
			//For leaf node
			//if(temp.left==null && temp.right==null)
			System.out.print(temp.data+", ");
			
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	
	}
	
	public int levelDisplayHeight() {
		Node temp=root;
		Queue<Node> q=new LinkedList<Node>();
		
		if(temp==null) {
			System.out.println("Tree is empty");
			return -99;
		}
		int count=0;
		q.add(temp);
		q.add(null);
		while(!q.isEmpty()) {
			temp=q.remove();
			
			if(temp==null) {
				if(!q.isEmpty()) {
					q.add(null);
				}
				count++;
			}
			else {			
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
			}
		}
		return count;
	
	}
	
	
	public static void main(String[] args) {
		BTree b=new BTree();
		
		b.insert(10);
		b.insert(20);
		b.insert(30);
		b.insert(40);
		b.insert(50);
		b.insert(60);
		b.insert(70);
		//b.insert(80);
		
		b.levelDisplay();
		System.out.println();
		
		System.out.println(b.levelDisplayHeight());
	}

}

class Node{
	Node left;
	int data;
	Node right;
	
	public Node(int d){
		data=d;
		left=null;
		right=null;
	}
}
