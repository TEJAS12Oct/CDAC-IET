package BST;

public class BST {

	Node root;

	public BST() {
		root = null;
	}

	public void insert(int value) {
		if (root == null) {
			Node tmp = new Node(value);
			root = tmp;
		} else {
			Node tmp = new Node(value);
			Node it = root;
			while (true) {
				// new value is > node value
				if (value < it.data) {
					// check if i have empty place on my left side
					if (it.left == null) {
						it.left = tmp;
						break;
					} else
						it = it.left;
				}
				// new value is < node value
				else if (value > it.data) {
					// check if i have empty place on my right side
					if (it.right == null) {
						it.right = tmp;
						break;
					} else
						it = it.right;
				}
				// Duplicate value
				else
					break;
			}
		}
	}

	// PLR
	public void preOrder() {
		System.out.print("PreOrder: ");
		printPreOrder(root);
		System.out.println();
	}

	private void printPreOrder(Node it) {
		if (it != null) {
			System.out.print(it.data + ", ");
			printPreOrder(it.left);
			printPreOrder(it.right);
		}
	}

	// LPR
	public void inOrder() {
		System.out.print("InOrder: ");
		printInOrder(root);
		System.out.println();
	}

	private void printInOrder(Node it) {

		if (it != null) {
			printInOrder(it.left);
			System.out.print(it.data + ", ");
			printInOrder(it.right);
		}
	}

	// LRP
	public void postOrder() {
		System.out.print("PostOrder: ");
		printPostOrder(root);
		System.out.println();
	}

	private void printPostOrder(Node it) {
		if (it != null) {
			printPostOrder(it.left);
			printPostOrder(it.right);
			System.out.print(it.data + ", ");
		}
	}

	public void SmallestNo() {
		Node it = root;
		if (it == null) {
			System.out.println("Empty ....");
		} else {
			while (it.left != null)
				it = it.left;
			System.out.println("Smallest No = " + it.data);
		}

	}

	public void LargestNo() {
		Node it = root;
		if (it == null) {
			System.out.println("Empty ....");
		} else {
			while (it.right != null)
				it = it.right;
			System.out.println("Largest No = " + it.data);
		}

	}

	public void delete(int key) {
		root = deleteValue(root, key);
	}

	private Node deleteValue(Node curRoot, int key) {

		// Check for empty
		if (curRoot == null) {
			return null;
		}

		// confirmed; BST has nore than 1 node..
		if (key > curRoot.data) {
			curRoot.right = deleteValue(curRoot.right, key);
			return curRoot;
		} else if (key < curRoot.data) {
			curRoot.left = deleteValue(curRoot.left, key);
			return curRoot;
		} else {
			// We reach the node..
			if (curRoot.left == null) {
				Node tmp = curRoot.right;
				curRoot.right = null;
				return tmp;
			} else if (curRoot.right == null) {
				Node tmp = curRoot.left;
				curRoot.left = null;
				return tmp;
			} else {
				// I have both not-null left and right
				// find the smallest number from right tree..
				int x = getSmallestNumber(curRoot.right);
				// new root value;
				curRoot.data = x;
				curRoot.right = deleteValue(curRoot.right, x);
			}
		}
		return curRoot;
	}

	private int getSmallestNumber(Node it) {
		while (it.left != null)
			it = it.left;
		return it.data;
	}

	public int height(Node r_ref) {
		int h_left, h_right;
		if (r_ref == null)
			return 0;
		h_left = height(r_ref.left);
		h_right = height(r_ref.right);

		if (h_left > h_right)
			return 1 + h_left;
		else
			return 1 + h_right;
	}

//	public int height(int i) {
//		int h_left, h_right;
//		if (r_ref == null)
//			return 0;
//		h_left = height(r_ref.left);
//		h_right = height(r_ref.right);
//
//		if (h_left > h_right)
//			return 1 + h_left;
//		else
//			return 1 + h_right;
//		
//	}

}
