package javaDataStructures;

public class HeightOfTree {

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
}
