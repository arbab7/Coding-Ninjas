package javaDataStructures;

public class NodesGreaterThanX {

	public static int numNodesGreaterX(BinaryTreeNode<Integer> root,int x){
		if (root == null) {
			return 0;
		}
		int leftNum = numNodesGreaterX(root.left, x);
		int rightNum = numNodesGreaterX(root.right, x);
		if (root.data > x) {
			return 1 + leftNum + rightNum;
		}else {
			return leftNum + rightNum;
		}
	}
	
}
