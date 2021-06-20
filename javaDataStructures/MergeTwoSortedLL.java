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
//public class MergeTwoSortedLL {
//	
//	public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
//		/* Your class should be named Solution
//		 * Don't write main().
//		 * Don't read input, it is passed as function argument.
//		 * Return output and don't print it.
//	 	 * Taking input and printing output is handled automatically.
//		*/
//	
//		LinkedListNode<Integer> head, tail;
//		if (head1.data <= head2.data) {
//			head = head1;
//			tail = head1;
//			head1 = head1.next;
//		}else {
//			head = head2;
//			tail = head2;
//			head2 = head2.next;
//		}
//		
//		while (head1 != null && head2 != null) {
//			if (head1.data <= head2.data) {
//				tail.next = head1;
//				tail = tail.next;
//				head1 = head1.next;
//			}
//			else {
//				tail.next = head2;
//				tail = tail.next;
//				head2 = head2.next;
//			}
//		}
//		if (head1 != null) {
//			tail.next = head1;
//		}else {
//			tail.next = head2;
//		}
//		return head;
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
//	public static void print(LinkedListNode<Integer> head){
//		while(head != null){
//			System.out.print(head.data +" ");
//			head = head.next;
//		}
//		System.out.println();
//	}
//	
//	public static void main(String[] args) {
//		LinkedListNode<Integer> head1 = takeInput();
//		LinkedListNode<Integer> head2 = takeInput();
//		LinkedListNode<Integer> head3 = mergeTwoList(head1, head2);
//		print(head3);
//	}
//}