package javaDataStructures;

public class ContructTreeUsingInorderAndPostorder {

	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post, int[] in){
		
		if (post.length == 0) {
			return null;
		}
		int rootData = post[post.length - 1];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		int i = 0;
		while (in[i] != rootData) {
			i++;
		}
		int[] leftPost = new int[i];
		for (int j = 0; j < leftPost.length; j++) {
			leftPost[j] = post[j];
		}
		int[] leftIn = new int[i];
		for (int j = 0; j < leftIn.length; j++) {
			leftIn[j] = in[j];
		}
		int[] rightPost = new int[post.length - i - 1];
		for (int j = 0; j < rightPost.length; j++) {
			rightPost[j] = post[i + j];
		}
		int[] rightIn = new int[in.length - i - 1];
		for (int j = 0; j < rightIn.length; j++) {
			rightIn[j] = in[i + 1 + j];
		}
		root.left = getTreeFromPostorderAndInorder(leftPost, leftIn);
		root.right = getTreeFromPostorderAndInorder(rightPost, rightIn);
		return root;
	}
	
}
