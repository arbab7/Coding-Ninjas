package javaDataStructures;

public class PathSumRootToLeaf {

	public static void rootToLeafPathSumToK(BinaryTreeNode<Integer> root, int k) {

		rootToLeafPathsHelper(root, k, "");
		
	}
	
	public static void rootToLeafPathsHelper(BinaryTreeNode<Integer> root, int k, String output) {
		if (root == null) {
			if (k == 0) {
				System.out.println(output);
			}
			return;
		}
		output += root.data + " ";
		rootToLeafPathsHelper(root.left, k - root.data, output);
		if (root.left == null && root.right == null) {
			return;
		}
		rootToLeafPathsHelper(root.right, k - root.data, output);
	}
}
