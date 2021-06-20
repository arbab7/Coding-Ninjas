package javaDataStructures;

public class ConstructTreeUsingInorderAndPreorder {

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in){
	
		if (pre.length == 0) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(pre[0]);
		int i = 0;
		while (in[i] != pre[0]) {
			i++;
		}
		int[] leftPre = new int[i];
		for (int j = 0; j < leftPre.length; j++) {
			leftPre[j] = pre[j + 1];
		}
		int[] leftIn = new int[i];
		for (int j = 0; j < leftIn.length; j++) {
			leftIn[j] = in[j];
		}
		
		int[] rightPre = new int[pre.length - i - 1];
		for (int j = 0; j < rightPre.length; j++) {
			rightPre[j] = pre[i + 1 + j];
		}
		int[] rightIn = new int[in.length - i - 1];
		for (int j = 0; j < rightIn.length; j++) {
			rightIn[j] = in[i + 1 + j];
		}
		root.left = getTreeFromPreorderAndInorder(leftPre, leftIn);
		root.right = getTreeFromPreorderAndInorder(rightPre, rightIn);
		return root;
	}
	
}
