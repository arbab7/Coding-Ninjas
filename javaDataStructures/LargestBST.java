package javaDataStructures;

class LargestSubReturn{
	int height;
	boolean isBST;
	int min;
	int max;
	public LargestSubReturn(int height, boolean isBST, int min, int max) {
		this.height = height;
		this.isBST = isBST;
		this.min = min;
		this.max = max;
	}
}

public class LargestBST {

	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		LargestSubReturn output = helper(root);
		return output.height;

	}

	public static LargestSubReturn helper(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return new LargestSubReturn(0, true, Integer.MAX_VALUE, Integer.MIN_VALUE);
		}
		LargestSubReturn leftOutput = helper(root.left);
		LargestSubReturn rightOutput = helper(root.right);
		boolean isBal = leftOutput.isBST && rightOutput.isBST;
		if (isBal && root.data > leftOutput.max && root.data < rightOutput.min) {

			int height = Math.max(leftOutput.height, rightOutput.height) + 1;
			int min = leftOutput.min, max = rightOutput.max;
			if (leftOutput.min == Integer.MAX_VALUE) {
				min = root.data;
			}
			if (rightOutput.max == Integer.MIN_VALUE) {
				max = root.data;
			}
			LargestSubReturn output = new LargestSubReturn(height, true, min, max);
			return output;
		}

		return new LargestSubReturn(Math.max(leftOutput.height, rightOutput.height), false, 0, 0);
	}


}
