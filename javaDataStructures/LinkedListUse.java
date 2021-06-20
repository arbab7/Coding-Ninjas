package javaDataStructures;

import java.util.Scanner;

public class LinkedListUse {

	public static Node<Integer> reverse_R(Node<Integer> head, int k) {

		if (head == null) {
			return null;
		}
		if (k == 1) {
			return head;
		}
		if (head.next == null) {
			return head;
		}
		Node<Integer> newHead = reverse_R(head.next, k - 1);
		Node<Integer> temp = head.next.next;
		head.next.next = head;
		head.next = temp;
		return newHead;

	}
	
	public static Node<Integer> createLinkedList() {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		Node<Integer> n = new Node<Integer>(s.nextInt());
		//		Node<Integer> n2 = new Node<Integer>(s.nextInt());
		//		Node<Integer> n3 = new Node<Integer>(s.nextInt());
		//		Node<Integer> n4 = new Node<Integer>(s.nextInt());
		//		n1.next = n2;
		//		n2.next = n3;
		//		n3.next = n4;
		Node<Integer> n1 = n;
		for (int i = 1; i < N; i++) {
			n.next = new Node<Integer>(s.nextInt());
			n = n.next;
		}

		return n1;
	}

	public static Node<Integer> reverseLL(Node<Integer> head) {
		Node<Integer> temp = head;
		Node<Integer> temp1 = null;
		Node<Integer> temp2 = null;
		while (temp != null) {
			temp2 = new Node(temp.data);
			temp2.next = temp1;
			temp = temp.next;
			temp1 = temp2;
		}
		return temp2;
	}

	public static Node<Integer> insertNodeRecursively(Node<Integer> head, int element, int pos) {
		//		if (head == null) {
		//			return null;
		//		}
		//		if (pos == 0) {
		//			int data = head.data;
		//			head.data = element;
		//			Node<Integer> newNode = new Node<Integer>(data);
		//			newNode.next = head.next;
		//			head.next = newNode;
		//			return head;
		//		}
		//		head.next = insertNodeRecursively(head.next, element, pos - 1);
		//		return head;
		if (head == null && pos > 0) {
			return null;
		}
		if (pos == 0) {
			Node<Integer> newNode = new Node<Integer>(element);
			newNode.next = head;
			return newNode;
		}
		head.next = insertNodeRecursively(head.next, element, pos - 1);
		return head;

	}

	public static void printLinkedList(Node<Integer> node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		printLinkedList(node.next);

		//		Node<Integer> temp = node;
		//		while (temp != null) {
		//			System.out.print(temp.data +" ");
		//			temp = temp.next;
		//		}
	}

	public static void increment(Node<Integer> head) {
		Node<Integer> temp = head;
		while (temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}

	public static Node<Integer> reverse_R(Node<Integer> head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		Node<Integer> newNode = reverse_R(head.next);
		Node<Integer> temp = head.next.next;
		head.next.next = head;
		head.next = temp;
		return newNode;
	}

	public static DoubleNode<Integer> reverseLLRecBetter(Node<Integer> head) {
		DoubleNode<Integer> output;
		if (head == null || head.next == null) {
			output = new DoubleNode<Integer>(head, head);
			return output;
		}
		DoubleNode<Integer> smallOutput = reverseLLRecBetter(head.next);
		smallOutput.tail.next = head;
		head.next = null;
		output = new DoubleNode<Integer>(smallOutput.head, smallOutput.tail.next);
		return output;
	}
	
	public static void main(String[] args) {

		//		Node<Integer> n1 = new Node<Integer>(10);
		//		System.out.println(n1.data);
		//		System.out.println(n1.next);
		Node<Integer> n = createLinkedList();
		printLinkedList(n);
		System.out.println();
//		printLinkedList(reverseLL(n));
//		DoubleNode<Integer> node = reverseLLRecBetter(n);
		printLinkedList(reverse_R(n, 3));
	}

}
