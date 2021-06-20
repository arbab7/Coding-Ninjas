package javaDataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> sameLevelNodes = new LinkedList<BinaryTreeNode<Integer>>();
		sameLevelNodes.add(root);
		while (!sameLevelNodes.isEmpty()) {
			int i = sameLevelNodes.size();
			for (int j = 0; j < i; j++) {
				BinaryTreeNode<Integer> node = sameLevelNodes.poll();
				System.out.print(node.data + " ");
				if (node.left != null) {
					sameLevelNodes.add(node.left);
				}
				if (node.right != null) {
					sameLevelNodes.add(node.right);
				}
			}
			System.out.println();
		}
	}
	
}
