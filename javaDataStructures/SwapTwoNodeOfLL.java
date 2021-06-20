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
//public class SwapTwoNodeOfLL {
//
//	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j){
//
//		if (j < i) {
//			int temp = j;
//			j = i;
//			i = temp;
//		}
//		if (i == 0) {
//			LinkedListNode<Integer> node = head;
//			for (int k = 0; k < j - 1; k++) {
//				node = node.next;
//			}
//			LinkedListNode<Integer> temp = node.next;
//			node.next = head;
//			head = temp;
//			temp = head.next;
//			head.next = node.next.next;
//			node.next.next = temp;
//		}else {
//			LinkedListNode<Integer> node1 = head;
//			for (int k = 0; k < i - 1; k++) {
//				node1 = node1.next;
//			}
//			LinkedListNode<Integer> node2 = node1;
//			for (int k = 0; k < j - i; k++) {
//				node2 = node2.next;
//			}
//			LinkedListNode<Integer> temp = node1.next;
//			node1.next = node2.next;
//			node2.next = temp;
//			temp = node1.next.next;
//			node1.next.next = node2.next.next;
//			node2.next.next = temp;
//		}
//		return head;
//	}
//
//	private static Scanner s = new Scanner(System.in);
//
//	public static void main(String[] args) {
//		print(swap_nodes(input(), s.nextInt(), s.nextInt()));
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
//			System.out.print(head.getData() + " ");
//			head = head.next;
//		}
//	}
//
//}
