package javaDataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelWiseLinkedList {

	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return null;
		}
		ArrayList<Node<BinaryTreeNode<Integer>>> output = new ArrayList<Node<BinaryTreeNode<Integer>>>();
		Queue<BinaryTreeNode<Integer>> levelwiseNodes = new LinkedList<BinaryTreeNode<Integer>>();
		levelwiseNodes.add(root);
		while (!levelwiseNodes.isEmpty()) {
			Node<BinaryTreeNode<Integer>> head = new Node<BinaryTreeNode<Integer>>(levelwiseNodes.peek());
			Node<BinaryTreeNode<Integer>> tail = head;
			int count = levelwiseNodes.size();
			for (int i = 0; i < count; i++) {
				BinaryTreeNode<Integer> temp = levelwiseNodes.poll();
				if (temp != head.data) {
					tail.next = new Node<BinaryTreeNode<Integer>>(temp);
					tail = tail.next;
				}
				if (temp.left != null) {
					levelwiseNodes.add(temp.left);
				}
				if (temp.right != null) {
					levelwiseNodes.add(temp.right);
				}
			}
			output.add(head);
		}
		return output;
	}

}
