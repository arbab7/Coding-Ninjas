//package javaDataStructures;
//
//import java.util.Scanner;
//
//class LinkedListNode<T> {
//	public T data;
//	public LinkedListNode<T> next;
//
//	public LinkedListNode(T data) {
//		this.setData(data);
//		this.next = null;
//	}
//
//	public T getData() {
//		return data;
//	}
//
//	public void setData(T data) {
//		this.data = data;
//	}
//
//}
//public class KReverse {
//	
//	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
//		
//		LinkedListNode<Integer> temp = head, tail;;
//		for (int i = 0; i < k - 1 && head.next != null; i++) {
//			head = head.next;
//		}
//		tail = head;
//		while (temp != null) {
//			temp = reverse_R(temp, k);
//			for (int i = 0; i < k - 1 && temp.next != null; i++) {
//				temp = temp.next;
//				tail.next = temp;
//				tail = temp;
//			}
//			temp = temp.next;
//			LinkedListNode<Integer> temp2 = temp;
//			for (int i = 0; i < k - 1 && temp2 != null && temp2.next != null; i++) {
//				temp2 = temp2.next;
//			}
//			tail.next = temp2;
//			tail = tail.next;
//		}
//		return head;
//		
//	}
//
//	public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head, int k) {
//		
//		if (head == null) {
//			return null;
//		}
//		if (k == 1) {
//			return head;
//		}
//		if (head.next == null) {
//			return head;
//		}
//		LinkedListNode<Integer> newHead = reverse_R(head.next, k - 1);
//		LinkedListNode<Integer> temp = head.next.next;
//		head.next.next = head;
//		head.next = temp;
//		return newHead;
//	
//	}
//	
//	
//	static Scanner s = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		print(kReverse(input(), s.nextInt()));
//	}
//
//	public static void print(LinkedListNode<Integer> head) {
//		while (head != null) {
//			System.out.print(head.getData() + " ");
//			head = head.next;
//		}
//	}
//
//	public static LinkedListNode<Integer> input() {
//		int data = s.nextInt();
//		
//		LinkedListNode<Integer> head = null;
//		LinkedListNode<Integer> tail = null;
//		while (data!=-1) {
//			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
//			if (head == null) {
//				head = newNode;
//				tail = newNode;
//			} else {
//				tail.next = newNode;
//				tail = newNode;
//			}
//			data = s.nextInt();
//		}
//		return head;
//	}
//
//}
//
