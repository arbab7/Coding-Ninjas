package javaDataStructures;

public class ReplaceWithSumOfGreaterNodes {

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here

		replaceWithLargerNodesSumHepler(root, 0);

	}

	public static int replaceWithLargerNodesSumHepler(BinaryTreeNode<Integer> root, int greaterSum) {
		if (root == null) {
			return 0;
		}
		if (root.right != null) {
			int rightSum = replaceWithLargerNodesSumHepler(root.right, greaterSum);
			root.data += rightSum;
		}
		else root.data += greaterSum;
		if (root.left != null) {
			int leftSum = replaceWithLargerNodesSumHepler(root.left, root.data);
			return leftSum;
		}
		return root.data;
	}

}
