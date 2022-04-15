package BST;

public class BST {
	
	Node root;

	public BST() {
		root = null;
	}

	public void insert(int value)
	{
		if(root == null)
		{
			Node tmp = new Node(value);
			root = tmp;
		}
		else
		{
			Node tmp = new Node(value);
			Node it = root;
			while(true)
			{
				//new value is > node value
				if(value < it.data)
				{
					//check if i have empty place on my left side
					if(it.left == null)
					{
						it.left = tmp;
						break;
					}
					else
						it = it.left;
				}
				//new value is < node value
				else if(value > it.data)
				{
					//check if i have empty place on my right side
					if(it.right == null)
					{
						it.right = tmp;
						break;
					}
					else
						it = it.right;
				}
				//Duplicate value
				else
					break;
			}
		}
	}

	//PLR
	public void preOrder()
	{
		System.out.print("PreOrder: ");
		printPreOrder(root);
		System.out.println();
	}

	private void printPreOrder(Node it) 
	{
		if(it != null)
		{
			System.out.print(it.data + ", ");
			printPreOrder(it.left);
			printPreOrder(it.right);
		}
	}

	//LPR
	public void inOrder()
	{
		System.out.print("InOrder: ");
		printInOrder(root);
		System.out.println();
	}

	private void printInOrder(Node it) {

		if(it != null)
		{
			printInOrder(it.left);
			System.out.print(it.data + ", ");
			printInOrder(it.right);
		}
	}

	//LRP
	public void postOrder()
	{
		System.out.print("PostOrder: ");
		printPostOrder(root);
		System.out.println();
	}

	private void printPostOrder(Node it) 
	{
		if(it != null)
		{
			printPostOrder(it.left);
			printPostOrder(it.right);
			System.out.print(it.data + ", ");
		}
	}

}
