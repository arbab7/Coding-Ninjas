package javaDataStructures;

public class ConstructBST {

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

		BinaryTreeNode<Integer> root = sortedArrayToBSTHelper(arr, 0, arr.length - 1);
		return root;
	}
	
	public static BinaryTreeNode<Integer> sortedArrayToBSTHelper(int[] arr, int si, int ei) {
		if (si > ei) {
			return null;
		}
		int midIndex = (si + ei) / 2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[midIndex]);
		root.left = sortedArrayToBSTHelper(arr, si, midIndex - 1);
		root.right = sortedArrayToBSTHelper(arr, midIndex + 1, ei);
		return root;
	}
	
}
