package javaDataStructures;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class BSTToLL {

	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
		if (root == null) {
			return null;
		}
		LinkedListNode<Integer> leftLL = BSTToSortedLL(root.left);
		LinkedListNode<Integer> rightLL = BSTToSortedLL(root.right);
		LinkedListNode<Integer> rootNode = new LinkedListNode(root.data);
		
		if (rightLL != null) {
			rootNode.next = rightLL;
		}
		if (leftLL == null) {
			return rootNode;
		}
		LinkedListNode<Integer> temp = leftLL;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = rootNode;
		return leftLL;
	}
	
}
