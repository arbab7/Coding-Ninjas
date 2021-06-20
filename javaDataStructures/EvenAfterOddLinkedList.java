//package javaDataStructures;
//
//
//
//import java.util.Scanner;
//
//class LinkedListNode<T> {
//	public T data;
//	public LinkedListNode<T> next;
//
//	public LinkedListNode(T data) {
//		this.data=data;
//		this.next = null;
//	}
//}
//
//public class EvenAfterOddLinkedList {
//
//	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
//
//		LinkedListNode<Integer> oddHead = null, oddTail = null, evenHead = null, evenTail = null;
//		while (head != null) {
//			if (head.data % 2 != 0) {
//				if (oddHead == null) {
//					oddHead = head;
//					oddTail = head;
//					head = head.next;
//				}else {
//					oddTail.next = head;
//					oddTail = head;
//					head = head.next;
//				}
//			}else {
//				if (evenHead == null) {
//					evenHead = head;
//					evenTail = head;
//					head = head.next;
//				}else {
//					evenTail.next = head;
//					evenTail = head;
//					head = head.next;
//				}
//			}
//		}
//		if (evenTail != null) {
//			evenTail.next = null;
//		}
//		if (oddTail != null) {
//			oddTail.next = evenHead;
//			return oddHead;
//		}
//		return evenHead;
//	}
//
//	private static Scanner s = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		print(sortEvenOdd(input()));
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
//	public static void print(LinkedListNode<Integer> head) {
//		while (head != null) {
//			System.out.print(head.data + " ");
//			head = head.next;
//		}
//	}
//}
