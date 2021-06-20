package javaDataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelwise {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<BinaryTreeNode<Integer>>();
		pendingNodes.add(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> node = pendingNodes.poll();
			System.out.print(node.data + ":");
			int leftdata, rightData;
			if (node.left == null) {
				leftdata = -1;
			}
			else {
				leftdata = node.left.data;
				pendingNodes.add(node.left);
			}
			if (node.right == null) {
				rightData = -1;
			}
			else {
				rightData = node.right.data;
				pendingNodes.add(node.right);
			}
			System.out.println("L:" + leftdata + ",R:" + rightData);
		}
	}
	
}
