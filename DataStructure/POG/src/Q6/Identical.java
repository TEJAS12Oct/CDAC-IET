package Q6;

import java.util.LinkedList;
import java.util.Queue;

public class Identical {

	public static boolean isIdentical(BinaryTree t1, BinaryTree t2) {
		BTNode ptr1 = t1.root;
		BTNode ptr2 = t2.root;
		if ((ptr1 == null) || (ptr2 == null)) {
			return false;
		}
		Queue<BTNode> q1 = new LinkedList<BTNode>();
		Queue<BTNode> q2 = new LinkedList<BTNode>();

		q1.add(ptr1);
		q2.add(ptr2);

		while ((!q1.isEmpty()) && (!q2.isEmpty())) {
			ptr1 = q1.remove();
			ptr2 = q2.remove();

			if (ptr1.data != ptr2.data)
				return false;

			if (ptr1.left != null)
				q1.add(ptr1.left);
			if (ptr1.right != null)
				q1.add(ptr1.left);

			if (ptr2.left != null)
				q2.add(ptr2.left);
			if (ptr2.right != null)
				q2.add(ptr2.left);
		}
		if ((q1.isEmpty()) && (q2.isEmpty()))
			return true;
		else
			return false;

	}// method ends

	public static void main(String[] args) {
		BinaryTree bt1 = new BinaryTree();
		bt1.insert(40);
		bt1.insert(24);
		bt1.insert(90);
		bt1.insert(41);
		bt1.insert(25);
		bt1.insert(92);
		bt1.insert(48);
		bt1.insert(24);
		bt1.insert(96);

		BinaryTree bt2 = new BinaryTree();
		bt2.insert(40);
		bt2.insert(24);
		bt2.insert(90);
		bt2.insert(41);
		bt2.insert(25);
		bt2.insert(92);
		bt2.insert(48);
		bt2.insert(24);
		bt2.insert(96);

		if (isIdentical(bt1, bt2))
			System.out.println("Two BT are Identical");
		else
			System.out.println("Two BT are not Identical");

	}// main ends

}// class ends
