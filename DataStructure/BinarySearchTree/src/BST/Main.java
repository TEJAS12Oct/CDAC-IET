package BST;

public class Main {

	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(14);
		bst.insert(28);
		bst.insert(7);
		bst.insert(12);
		bst.insert(3);
		bst.insert(17);
		bst.insert(19);
		bst.insert(20);
		bst.insert(56);

		bst.preOrder();
		bst.inOrder();
		bst.postOrder();

		bst.SmallestNo();
		bst.LargestNo();

		bst.delete(17);
		System.out.println("Delete No = " + bst);
		bst.inOrder();
		
//		bst.height(20);
	}

}

//                              14
//                     
//                     7               28
//                 3      12       17       56
//                                    19
//                                       20
