package javaDataStructures;

import java.util.ArrayList;

public class FindPathInBST {

	public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data) {
		if (root == null) {
			return null;
		}
		if (root.data == data) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(data);
			return output;
		}
		if (data < root.data) {
			ArrayList<Integer> leftOutput = findPath(root.left, data);
			if (leftOutput != null) {
				leftOutput.add(root.data);
				return leftOutput;
			}
		}
		else if (data > root.data) {
			ArrayList<Integer> rightOutput = findPath(root.right, data);
			if (rightOutput != null) {
				rightOutput.add(root.data);
				return rightOutput;
			}
		}
		return null;
	}


}
