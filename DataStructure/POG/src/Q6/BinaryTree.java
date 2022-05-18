package Q6;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	BTNode root;

	public void insert(int key) {
		BTNode newNode = new BTNode(key);
		Queue<BTNode> q = new LinkedList<BTNode>();

		if (root == null) {
			root = newNode;
			return;
		}

		BTNode temp = root;
		q.add(temp);
		while (!q.isEmpty()) {
			temp = q.remove();
			if (temp.left == null) {
				temp.left = newNode;
				break;
			} else {
				q.add(temp.left);
			}

			if (temp.right == null) {
				temp.right = newNode;
				break;
			} else {
				q.add(temp.right);
			}

		}

	}

	public void levelDisplay() {
		BTNode temp = root;
		Queue<BTNode> q = new LinkedList<BTNode>();

		if (temp == null) {
			System.out.println("Tree is empty");
			return;
		}

		q.add(temp);

		while (!q.isEmpty()) {
			temp = q.remove();

			// For leaf node
			// if(temp.left==null && temp.right==null)
			System.out.print(temp.data + ", ");

			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}
	}

	public void swap(BTNode p) {
		BTNode t;
		t = p.left;
		p.left = p.right;
		p.right = t;
	}

	public void mirrorImage() {
		BTNode temp = root;
		Queue<BTNode> q = new LinkedList<BTNode>();

		if (temp == null) {
			System.out.println("Tree is empty");
			return;
		}

		q.add(temp);

		while (!q.isEmpty()) {
			temp = q.remove();
			swap(temp);
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}
	}

	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		b.insert(10);
		b.insert(20);
		b.insert(30);
		b.insert(40);
		b.insert(50);
		b.insert(60);
		b.insert(70);

		b.levelDisplay();

		b.mirrorImage();

		System.out.println();

		b.levelDisplay();

	}

}

class BTNode {
	BTNode left;
	int data;
	BTNode right;

	public BTNode(int d) {
		data = d;
		left = null;
		right = null;
	}

	/*
	 * BTNode(BTNode d){ data=d.data; left=d.left; right=d.right; }
	 */
}