package javaDataStructures;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

class BalancedTreeReturn{
	int height;
	Boolean isBalanced;
	
	public BalancedTreeReturn(int height, boolean isBalanced) {
		this.height = height;
		this.isBalanced = isBalanced;
	}
}

class IsBSTReturn{
	boolean isBST;
	int max;
	int min;
	
	public IsBSTReturn(int min, int max, boolean isBST) {
		this.max = max;
		this.min = min;
		this.isBST = isBST;
	}
}

public class BinaryTreeUse {

	public static void printBinaryTree(BinaryTreeNode<Integer> root) {
//		if (root == null) {
//			return;
//		}
//		System.out.println(root.data);
//		printBinaryTree(root.left);
//		printBinaryTree(root.right);
	
//		if (root == null) {
//			return;
//		}
//		System.out.print(root.data + ": ");
//		if (root.left != null) {
//			System.out.print("L" + root.left.data + " ");
//		}
//		if (root.right != null) {
//			System.out.print("R" + root.right.data);
//		}
//		System.out.println();
//		printBinaryTree(root.left);
//		printBinaryTree(root.right);
		
		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<BinaryTreeNode<Integer>>();
		pendingNodes.add(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> node = pendingNodes.poll();
			System.out.print(node.data + ": ");
			if (node.left != null) {
				System.out.print("L" + node.left.data + " ");
				pendingNodes.add(node.left);
			}
			if (node.right != null) {
				System.out.print("R" + node.right.data);
				pendingNodes.add(node.right);
			}
			System.out.println();
		}
	}
	
	public static BinaryTreeNode<Integer> takeTreeInput() {
//		System.out.println("Enter the root data");
//		Scanner s = new Scanner(System.in);
//		int data = s.nextInt();
//		if (data == -1) {
//			return null;
//		}
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
//		root.left = takeTreeInput();
//		root.right = takeTreeInput();
//		return root;
		
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		if (data == -1) {
			return null;
		}
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		pendingChildren.add(root);
		while (!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> parentNode = pendingChildren.poll();
			data = s.nextInt();
			if (data != -1) {
				parentNode.left = new BinaryTreeNode<Integer>(data);
				pendingChildren.add(parentNode.left);
			}
			data = s.nextInt();
			if (data != -1) {
				parentNode.right = new BinaryTreeNode<Integer>(data);
				pendingChildren.add(parentNode.right);
			}
			
		}
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeTreeInput(boolean isRoot, int parentData, boolean isLeft) {
		if (isRoot ) {
			System.out.println("Enter the root data");
		}
		else {
			if (isLeft) {
				System.out.println("Enter the left node data of " + parentData + " ");
			}
			else {
				System.out.println("Enter the right node data of " + parentData + " ");
			}
		}
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		if (data == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		root.left = takeTreeInput(false, data, true);
		root.right = takeTreeInput(false, data, false);
		return root;
	}

	public static int numNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftNodeCount = numNodes(root.left);
		int rightNodeCount = numNodes(root.right);
		return 1 + leftNodeCount + rightNodeCount;
	}

	public static int sum(BinaryTreeNode<Integer> root){
		if (root == null) {
			return 0;
		}
		int leftNodeSum = sum(root.left);
		int rightNodeSum = sum(root.right);
		return root.data + leftNodeSum + rightNodeSum;
	}
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void inOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public static void postOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static int largestNode(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		int largestLeft = largestNode(root.left);
		int largestRight = largestNode(root.right);
		int largest = Math.max(root.data, Math.max(largestLeft, largestRight));
		return largest;
		
	}
	
	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return numLeaves(root.left) + numLeaves(root.right);
	}
	
	public static void printNodesAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return;
		}
		if (k == 0) {
			System.out.print(root.data + " ");
		}
		printNodesAtDepthK(root.left, k - 1);
		printNodesAtDepthK(root.right, k - 1);
	}
	
	public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return null;
		}
		root.left = removeLeafNodes(root.left);
		root.right = removeLeafNodes(root.right);
		return root;
	}
	
	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		int leftHeight = HeightOfTree.height(root.left);
		int rightHeight = HeightOfTree.height(root.right);
		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}
		return checkBalanced(root.left) && checkBalanced(root.right);
	}
	
	public static BalancedTreeReturn checkBalancedBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return new BalancedTreeReturn(0, true);
		}
		BalancedTreeReturn isLeftBalanced = checkBalancedBetter(root.left);
		BalancedTreeReturn isRightBalanced = checkBalancedBetter(root.right);
		boolean isBalanced = true;
		int height = 1 + Math.max(isLeftBalanced.height, isRightBalanced.height);
		if (!isLeftBalanced.isBalanced || !isRightBalanced.isBalanced) {
			isBalanced = true;
		}
		if (Math.abs(isLeftBalanced.height - isRightBalanced.height) > 1) {
			isBalanced = false;
		}
		BalancedTreeReturn output = new BalancedTreeReturn(height, isBalanced);
		return output;
		}
	
	public static BinaryTreeNode<Integer> buildTreeUsingPreInHelper(int[] pre, int[] in, int siPre, int eiPre, int siIn, int eiIn) {
		if (siPre > eiPre) {
			return null;
		}
		int rootData = pre[siPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		int rootIndex = -1;
		for (int i = siIn; i <= eiIn; i++) {
			if (in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}
		
		int siPreLeft = siPre + 1;
		int siInLeft = siIn;
		int eiInLeft = rootIndex - 1;
		int eiPreRight = eiPre;
		int siInRight = rootIndex + 1;
		int eiInRight = eiIn;
		
		int leftSubtreeLength = eiInLeft - siInLeft + 1;
		
		int eiPreLeft = siPreLeft + leftSubtreeLength - 1;
		int siPreRight = eiPreLeft + 1;
		
		root.left = buildTreeUsingPreInHelper(pre, in, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
		root.right = buildTreeUsingPreInHelper(pre, in, siPreRight, eiPreRight, siInRight, eiInRight);
		return root;
	}
	
	public static BinaryTreeNode<Integer> buildTreeUsingPreIn(int[] pre, int[] in) {
		BinaryTreeNode<Integer> root = buildTreeUsingPreInHelper(pre, in, 0, pre.length - 1, 0, in.length - 1);
		return root;
	}
	
	public static int minNode(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		int leftMin = minNode(root.left);
		int rightMin = minNode(root.right);
		return Math.min(root.data, Math.min(leftMin, rightMin));
	}
	
	public static int maxNode(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int leftMax = maxNode(root.left);
		int rightMax = maxNode(root.right);
		return Math.max(root.data, Math.max(leftMax, rightMax));
	}
	
	public static boolean checkIsBST(BinaryTreeNode<Integer> root) {
//		if (root == null) {
//			return true;
//		}
//		int leftMax = maxNode(root.left);
//		int rightMin = minNode(root.right);
//		
//		if (root.data <= leftMax || root.data >= rightMin) {
//			return false;
//		}
//		return checkIsBST(root.left) && checkBalanced(root.right);
		
		return checkIsBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static IsBSTReturn checkIsBSTBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
		}
		IsBSTReturn leftOutput = checkIsBSTBetter(root.left);
		IsBSTReturn rightOutput = checkIsBSTBetter(root.right);
		
		int min = Math.min(root.data, Math.min(leftOutput.min, rightOutput.min));
		int max = Math.max(root.data, Math.max(leftOutput.max, rightOutput.max));
		boolean isBST = true;
		
		if (leftOutput.max > root.data) {
			isBST = false;
		}
		if (rightOutput.min < root.data) {
			isBST = false;
		}
		if (!leftOutput.isBST) {
			isBST = false;
		}
		if (!rightOutput.isBST) {
			isBST = false;
		}
		
		return new IsBSTReturn(min, max, isBST);
	}

	public static boolean checkIsBSTHelper(BinaryTreeNode<Integer> root, int leftLimit, int rightLimit) {
		if (root == null) {
			return true;
		}
		if (root.data < leftLimit || root.data > rightLimit) {
			return false;
		}
		boolean leftOutput = checkIsBSTHelper(root.left, leftLimit, root.data - 1);
		boolean rightOutput = checkIsBSTHelper(root.right, root.data + 1, rightLimit);
		return leftOutput && rightOutput;
		
	}
	
	
	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		root.left = new BinaryTreeNode<Integer>(2);
//		root.right = new BinaryTreeNode<Integer>(3);
//		BinaryTreeNode<Integer> root = takeTreeInput(true, 0, true);
//		printBinaryTree(root);
//		System.out.println("Number of nodes:" + numNodes(root));
//		System.out.println("Sum of nodes: " + sum(root));
//		preOrder(root);
//		System.out.println();
//		inOrder(root);
//		System.out.println();
//		postOrder(root);
//		System.out.println();
//		System.out.println("Largest: " + largestNode(root));
//		System.out.println("Number of leaves: " + numLeaves(root));
//		printNodesAtDepthK(root, 1);
//		ReplaceNodeWithDepth.replaceDepth(root);
//		printBinaryTree(root);
//		System.out.println(checkBalanced(root));
		
		BinaryTreeNode<Integer> root = takeTreeInput();
//		printBinaryTree(root);
		
//		int[] pre = {1, 2, 4 , 3, 5, 6};
//		int[] in = {4, 2, 1, 5, 3, 6};
//		BinaryTreeNode<Integer> root = buildTreeUsingPreIn(pre, in);
//		printBinaryTree(root);
//		PathSumRootToLeaf.rootToLeafPathSumToK(root, 13);
//		CreateAndInsertDuplicateNodes.insertDuplicateNode(root);
//		printBinaryTree(root);
//		PrintNodesAtDistancekfromNode.nodesAtDistanceK(root, 5, 3);
//		System.out.println(checkIsBST(root));
//		IsBSTReturn ans = checkIsBSTBetter(root);
//		System.out.println(ans.isBST);
//		RootToNodePathInBinarytree.printRootToNodePath(root, 5);
		LevelOrderTraversal.printLevelWise(root);
	}
	
}
