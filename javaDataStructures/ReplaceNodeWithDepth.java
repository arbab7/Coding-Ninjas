package javaDataStructures;

public class ReplaceNodeWithDepth {

	public static void replaceDepth(BinaryTreeNode<Integer> n1) {
		/*Your class should be named solution. 
		*Don't write main().
		*Don't take input, it is passed as function argument.
		*Don't print output.
		*Taking input and printing output is handled automatically.
		*/ 
		replaceDepthHelper(n1, 0);
		inOrder(n1);
	}
	
	public static void replaceDepthHelper(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return;
		}
		root.data = k;
		replaceDepthHelper(root.left, k + 1);
		replaceDepthHelper(root.right, k + 1);
	}
	
	public static void inOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
}
