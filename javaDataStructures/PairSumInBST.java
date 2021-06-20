package javaDataStructures;

import java.util.Stack;

public class PairSumInBST {

	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {

		int totalNodes = countNodes(root);
		if (totalNodes == 1) {
			return;
		}
		Stack<BinaryTreeNode<Integer>> s1 = new Stack<BinaryTreeNode<Integer>>();
		Stack<BinaryTreeNode<Integer>> s2 = new Stack<BinaryTreeNode<Integer>>();
		s1.add(root);
		s2.add(root);
		int i = 0;
		while (i < totalNodes) {
			BinaryTreeNode<Integer> temp1 = s1.peek().left, temp2 = s2.peek().right;
			while (temp1 != null && i < totalNodes) {
				s1.add(temp1);
				temp1 = temp1.left;

			}
			while (temp2 != null && i < totalNodes) {
				s2.add(temp2);
				temp2 = temp2.right;

			}
			if (s1.peek().data + s2.peek().data < s) {
				BinaryTreeNode<Integer> temp = s1.pop();
				i++;
				if (temp.right != null) {
					s1.add(temp.right);

				}else {
					if (!s1.isEmpty()) {
						s1.peek().left = null;
					}
				}
			}else if (s1.peek().data + s2.peek().data > s) {
				BinaryTreeNode<Integer> temp = s2.pop();
				i++;
				if (temp.left != null) {
					s2.add(temp.left);

				}else {
					if (!s2.isEmpty()) {
						s2.peek().right = null;
					}
				}
			}else {
				if (s1.peek() == s2.peek()) {
					break;
				}
				System.out.println(s1.peek().data + " " + s2.peek().data);

				BinaryTreeNode<Integer> temp3 = s1.pop();
				i++;
				if (temp3.right != null) {
					s1.add(temp3.right);

				}else {
					if (s1.size() == 0) {
						break;
					}
					s1.peek().left = null;
				}
				BinaryTreeNode<Integer> temp4 = s2.pop();
				i++;
				if (temp4.left != null) {
					s2.add(temp4.left);

				}else {
					if (s2.size() == 0) {
						break;
					}
					s2.peek().right = null;
				}


			}
		}

	}

	public static int countNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		return 1 + countNodes(root.left) + countNodes(root.right);
	}

}
