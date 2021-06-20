package javaDataStructures;

public class CreateAndInsertDuplicateNodes {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		BinaryTreeNode<Integer> duplicate = new BinaryTreeNode<Integer>(root.data);
		duplicate.left = root.left;
		root.left = duplicate;
		insertDuplicateNode(duplicate.left);
		insertDuplicateNode(root.right);
	}
	
}
