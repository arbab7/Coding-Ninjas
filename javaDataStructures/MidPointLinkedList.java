//package javaDataStructures;
//
//
//
//import java.util.Scanner;
//
//public class MidPointLinkedList {
//
//	public static int printMiddel(LinkedListNode<Integer> head) {
//
//		if (head.next == null) {
//			return head.data;
//		}
//		LinkedListNode<Integer> slow = head;
//		LinkedListNode<Integer> fast = head;
//		while (fast.next != null && fast.next.next != null) {
//				slow = slow.next;
//				fast = fast.next.next;
//		}
//		return slow.data;
//
//	}
//
//	private static Scanner s = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		System.out.println(printMiddel(input()) + "");
//	}
//
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
//}
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
