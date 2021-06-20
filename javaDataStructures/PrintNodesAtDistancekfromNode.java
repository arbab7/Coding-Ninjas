package javaDataStructures;

public class PrintNodesAtDistancekfromNode {
	
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		nodesAtDistanceKHelper(root, node, k);
	}
	
	public static int nodesAtDistanceKHelper(BinaryTreeNode<Integer> root, int node, int k) {
		if (root == null) {
			return -1;
		}
		if (k == 0) {
			System.out.println(root.data);
			return -1;
		}
		if (root.data == node) {
			printAtDepthK(root, k);
			return 1;
		}
		int leftDistance = nodesAtDistanceKHelper(root.left, node, k);
		if (leftDistance != -1) {
			if (leftDistance == k) {
				System.out.println(root.data);
                return -1;
			}else printAtDepthK(root.right, k - leftDistance - 1);
			return leftDistance + 1;
		}
		int rightDistance = nodesAtDistanceKHelper(root.right, node, k);
		if (rightDistance != -1) {
			if (rightDistance ==  k) {
				System.out.println(root.data);
                return -1;
			}else printAtDepthK(root.left, k - rightDistance - 1);
			return rightDistance + 1;
		}
		return -1;
	}

	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return;
		}
		if (k == 0) {
			System.out.println(root.data);
			return;
		}
		printAtDepthK(root.left, k - 1);
		printAtDepthK(root.right, k - 1);
	}
	
}
