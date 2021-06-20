package javaDataStructures;

import java.util.ArrayList;

public class RootToNodePathInBinarytree {

	public static void printRootToNodePath(BinaryTreeNode<Integer> root, int node) {
		ArrayList<Integer> output = helper(root, node);
		for (Integer e : output) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	private static ArrayList<Integer> helper(BinaryTreeNode<Integer> root, int node) {
		if (root == null) {
			return null;
		}
		if (root.data == node) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(node);
			return output;
		}
		ArrayList<Integer> leftOutput = helper(root.left, node);
		if (leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer> rightOuptut = helper(root.right, node);
		if (rightOuptut != null) {
			rightOuptut.add(root.data);
			return rightOuptut;
		}
		return null;
	}
}
