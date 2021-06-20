package javaDataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeReturnMaxSum{
	TreeNode<Integer> node;
	int maxSum;
	public TreeReturnMaxSum(TreeNode<Integer> node, int maxSum) {
		this.node = node;
		this.maxSum = maxSum;
	}
}

public class TreeUse {

	public static void replaceWithDepthValue(TreeNode<Integer> root){

		helper(root, 0);
		
	}
	
	public static void helper(TreeNode<Integer> root, int depth) {
		root.data = depth;
		for (int i = 0; i < root.children.size(); i++) {
			helper(root.children.get(i), depth + 1);
		}
	}
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
		int largest = largest(root);
		return secLargestNode(root, largest);
		
	}
	
	private static TreeNode<Integer> secLargestNode(TreeNode<Integer> root, int x) {
		TreeNode<Integer> output = null;
		int secLargest = Integer.MIN_VALUE;
		if (root.data < x) {
			output = root;
			secLargest = root.data;
		}
		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> temp = secLargestNode(root.children.get(i), x);
			if (temp != null && temp.data > secLargest) {
				output = temp;
				secLargest = temp.data;
			}
		}
		return output;
	}
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		return findNextLargerNodeHelper(root, n);
	}
	
	private static TreeNode<Integer> findNextLargerNodeHelper(TreeNode<Integer> root, int n){
		TreeNode<Integer> output = null;
		int num = Integer.MAX_VALUE;
		if (root.data > n) {
			num = root.data;
			output = root;
		}
		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> temp = findNextLargerNodeHelper(root.children.get(i), n);
			if (temp != null && temp.data < num) {
				num = temp.data;
				output = temp;
			}
		}
		return output;
	}
	
	

	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
		if (root1.data != root2.data || root1.children.size() != root2.children.size()) {
			return false;
		}
		for (int i = 0; i < root1.children.size(); i++) {
			if (!checkIdentical(root1.children.get(i), root2.children.get(i))) {
				return false;
			}
		}
		return true;
	}

	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		return helper(root).node;
	}

	private static TreeReturnMaxSum helper(TreeNode<Integer> root) {
		int currentSum = root.data;
		int maxChildSum = 0;
		TreeReturnMaxSum output = null;
		for (int i = 0; i < root.children.size(); i++) {
			TreeReturnMaxSum temp = helper(root.children.get(i));
			currentSum += root.children.get(i).data;
			if (temp.maxSum > maxChildSum) {
				maxChildSum = temp.maxSum;
				output = temp;
			}		
		}
		if (currentSum > maxChildSum) {
			return new TreeReturnMaxSum(root, currentSum);
		}
		return output;
	}

	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
		if (root.data == x) {
			return true;
		}
		for (int i = 0; i < root.children.size(); i++) {
			if (checkIfContainsX(root.children.get(i), x)) {
				return true;
			}
		}
		return false;
	}

	public static void postOrder(TreeNode<Integer> root){
		for (int i = 0; i < root.children.size(); i++) {
			postOrder(root.children.get(i));
		}
		System.out.print(root.data + " ");
	}

	public static int countLeafNodes(TreeNode<Integer> root){
		if (root.children.size() == 0) {
			return 1;
		}
		int num = 0;
		for (int i = 0; i < root.children.size(); i++) {
			num += countLeafNodes(root.children.get(i));
		}
		return num;
	}

	public static int height(TreeNode<Integer> root){
		int subTreeHeight = 0;
		for (int i = 0; i < root.children.size(); i++) {
			subTreeHeight = Math.max(height(root.children.get(i)), subTreeHeight);
		}
		return 1 + subTreeHeight;
	}

	public static int numNodeGreater(TreeNode<Integer> root,int x){
		if (root == null) {
			return 0;
		}
		int num = 0;
		if (root.data > x) {
			num = 1;
		}
		for (int i = 0; i < root.children.size(); i++) {
			num += numNodeGreater(root.children.get(i), x);
		}
		return num;
	}

	public static int sumOfAllNode(TreeNode<Integer> root){
		if (root == null) {
			return 0;
		}
		int sum = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			sum += sumOfAllNode(root.children.get(i));
		}
		return sum;
	}

	public static void printLevelWise(TreeNode<Integer> root){
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<TreeNode<Integer>>();
		pendingNodes.add(root);
		while (!pendingNodes.isEmpty()) {
			int m = pendingNodes.size();
			for (int i = 0; i < m; i++) {
				TreeNode<Integer> node = pendingNodes.poll();
				System.out.print(node.data + " ");
				for (int j = 0; j < node.children.size(); j++) {
					pendingNodes.add(node.children.get(j));
				}
			}
			System.out.println();
		}
	}

	public static void preorder(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		for (int i = 0; i < root.children.size(); i++) {
			preorder(root.children.get(i));
		}
	}

	public static void printAtK(TreeNode<Integer> root, int k) {
		if (k < 0) {
			return;
		}
		if (k == 0) {
			System.out.println(root.data);
			return;
		}
		for (int i = 0; i < root.children.size(); i++) {
			printAtK(root.children.get(i), k - 1);
		}
	}

	public static int largest(TreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}

		int ans = root.data;
		for (int i = 0; i < root.children.size(); i++) {	
			int childLargest = largest(root.children.get(i));
			if (childLargest > ans) {
				ans = childLargest;
			}
		}
		return ans;
	}

	public static int numNodes(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int count = 1;
		for (int i = 0; i < root.children.size(); i++) {
			count += numNodes(root.children.get(i));
		}
		return count;
	}

	public static TreeNode<Integer> takeInput(Scanner s) {
		int n;
		System.out.println("Enter next node data");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter number of children for " + n);
		int childCount = s.nextInt();
		for (int i = 0; i < childCount; i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
	}

	public static void print(TreeNode<Integer> root) {
		String s = root.data + ":";
		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}

	public static TreeNode<Integer> takeInputLevelWise() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		QueueUsingLinkedList<TreeNode<Integer>> pendingNodes = new QueueUsingLinkedList<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter num of children of " + frontNode.data);
				int numChildren = s.nextInt();
				for (int i = 0; i < numChildren; i++) {
					System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
					int child = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
				// Shouldn't come here
				return null;
			}
		}
		return root;
	}

	public static void main(String[] args) {
		//		Scanner s= new Scanner(System.in);
		//		
		//		TreeNode<Integer> root = takeInput(s);
		TreeNode<Integer> root = takeInputLevelWise();
		//print(root);
		//System.out.println(largest(root));
		//System.out.println(numNodes(root));
		//printAtK(root, 2);
		//preorder(root);
		//System.out.println();
		printLevelWise(root);
	}
}
