package javaDataStructures;

public class BSTClass {

	private BinaryTreeNode<Integer> root;
	private int size;
	
	public boolean search(int data) {
		return helper(root, data);
	}
	
	private static boolean helper(BinaryTreeNode<Integer> node, int data) {
		if (node == null) {
			return false;
		}
		if (node.data == data) {
			return true;
		}
		if (data < node.data) {
			return helper(node.left, data);
		}
		return helper(node.right, data);
	}
	
	public void print() {
		printHelper(root);
	}
	
	private static void printHelper(BinaryTreeNode<Integer> node) {
		if (node ==  null) {
			return;
		}
		System.out.print(node.data + ": ");
		if (node.left != null) {
			System.out.print("L" + node.left.data + " ");
		}
		if (node.right != null) {
			System.out.print("R" + node.right.data);
		}
		System.out.println();
		
		printHelper(node.left);
		printHelper(node.right);
	}
	
	public void insert(int data) {
		root = insertHelper(root, data);
		size++;
	}
	
	private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int data) {
		if (node == null) {
			return new BinaryTreeNode<Integer>(data);
		}
		if (data > node.data) {
			node.right = insertHelper(node.right, data);
		}
		else {
			node.left = insertHelper(node.left, data);
		}
		return node;
	}
	
	public void delete(int data) {
		root = deleteHelper(root, data);
	}
	
	private static BinaryTreeNode<Integer> deleteHelper(BinaryTreeNode<Integer> node, int data) {
		if (node == null) {
			return null;
		}
		if (node.data == data) {
			if (node.left != null && node.right != null) {
				node.data = min(node.right);
				node.right = del(node.right, node.data);
				return node;
			}
			if (node.left == null) {
				return node.right;
			}
			return node.left;
		}
		node.left = deleteHelper(node.left, data);
		node.right = deleteHelper(node.right, data);
		return node;
	}
	
	private static int min(BinaryTreeNode<Integer> node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int leftMin = min(node.left);
		int rightMin = min(node.right);
		return Math.min(node.data, Math.min(leftMin, rightMin));
	}
	
	private static BinaryTreeNode<Integer> del(BinaryTreeNode<Integer> node, int data) {
		if (node == null) {
			return null;
		}
		if (node.data == data) {
			return node.right;
		}
		node.left = del(node.left, data);
		node.right = del(node.right, data);
		return node;
	}
}
