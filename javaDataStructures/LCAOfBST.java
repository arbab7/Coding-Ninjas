package javaDataStructures;

public class LCAOfBST {

	public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){
		// Write your code here

		if (root == null) {
			return -1;
		}
		if (root.data == a) {
			return a;
		}
		if (root.data == b) {
			return b;
		}
		if (a < root.data && b < root.data) {
			return lcaInBST(root.left, a, b);
		}
		if (a > root.data && b > root.data) {
			return lcaInBST(root.right, a, b);
		}

		int leftOutput = lcaInBST(root.left, a, b);
		int rightOutput = lcaInBST(root.right, a, b);
		
		if (leftOutput != -1 && rightOutput != -1) {
			return root.data;
		}
		if (leftOutput == -1) {
			return rightOutput;
		}
		return leftOutput;
	}

}
