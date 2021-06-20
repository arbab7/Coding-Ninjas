//package javaDataStructures;
//
//import java.util.Scanner;
//
//class LinkedListNode<T> {
//	T data;
//	LinkedListNode<T> next;
//	
//	public LinkedListNode(T data) {
//		this.data = data;
//	}
//}
//
//public class FindANodeInLLRecursive {
//	
//	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
//		/* Your class should be named Solution
//		 * Don't write main().
//		 * Don't read input, it is passed as function argument.
//		 * Return output and don't print it.
//	 	 * Taking input and printing output is handled automatically.
//		*/
//		
//		if (head == null) {
//			return -1;
//		}
//		if (head.data == n) {
//			return 0;
//		}
//		int index = indexOfNRec(head.next, n);
//		if (index != -1) {
//			return index + 1;
//		}
//		return -1;
//	}
//	
//	static Scanner s = new Scanner(System.in);
//	
//	public static LinkedListNode<Integer> takeInput() {
//		LinkedListNode<Integer> head = null, tail = null;
//		int data = s.nextInt();
//		while(data != -1) {
//			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
//			if(head == null) {
//				head = newNode;
//				tail = newNode;
//			}
//			else {
//				tail.next = newNode;
//				tail = newNode;
//			}
//			data = s.nextInt();
//		}
//		return head;
//	}
//	
//
//	
//	public static void main(String[] args) {
//		LinkedListNode<Integer> head = takeInput();
//		int n = s.nextInt();
//		System.out.println(indexOfNRec(head, n));
//	}
//}