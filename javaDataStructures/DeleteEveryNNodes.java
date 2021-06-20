//package javaDataStructures;
//
//import java.util.Scanner;
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
//public class DeleteEveryNNodes {
//
//	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
//		if (M == 0) {
//			return null;
//		}
//		if (N == 0) {
//			return head;
//		}
//		LinkedListNode<Integer> temp = head, tail = head;
//		while (temp != null) {
//			for (int i = 0; i < M - 1 && temp != null; i++) {
//				temp = temp.next;
//				tail = temp;
//			}
//			for (int i = 0; i < N + 1 && temp != null; i++) {
//				temp = temp.next;
//			}
//			if (tail != null) {
//				tail.next = temp;
//				tail = temp;
//			}
//		}
//		return head;
//	}
//
//	static Scanner s = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		print(skipMdeleteN(input(), s.nextInt(), s.nextInt()));
//	}
//
//	public static void print(LinkedListNode<Integer> head) {
//		LinkedListNode<Integer> temp = head;
//		while (temp != null) {
//			System.out.print(temp.getData() + " ");
//			temp = temp.next;
//		}
//	}
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
