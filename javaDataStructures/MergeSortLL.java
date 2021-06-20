//package javaDataStructures;
//
//import java.util.Scanner;
//class LinkedListNode<T> {
//	public T data;
//	public LinkedListNode<T> next;
//
//	public LinkedListNode(T data) {
//		this.data = data;
//		this.next = null;
//	}
//}
//
//public class MergeSortLL {
//	
//	public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
//		if (head.next == null) {
//			return head;
//		}
//		LinkedListNode<Integer> slow = head;
//		LinkedListNode<Integer> fast = head;
//		while (fast.next != null && fast.next.next != null) {
//			slow = slow.next;
//			fast = fast.next.next;
//		}
//		return slow;
//		
//	}
//	
//	public static LinkedListNode<Integer> mergeTwoSortedLL(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
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
//		while (head1 != null && head2 != null) {
//			if (head1.data <= head2.data) {
//				tail.next = head1;
//				tail = head1;
//				head1 = head1.next;
//			}else {
//				tail.next = head2;
//				tail = head2;
//				head2 = head2.next;
//			}
//		}
//		if (head1 != null) {
//			tail.next = head1;
//		}
//		if (head2 != null) {
//			tail.next = head2;
//		}
//		return head;
//	}
//	
//	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
//		// write your code here
//		if (head == null || head.next == null) {
//			return head;
//		}
//		
//		LinkedListNode<Integer> mid = midPoint(head);
//		LinkedListNode<Integer> part1Head = head;
//		LinkedListNode<Integer> part2Head = mid.next;
//		mid.next = null;
//		part1Head = mergeSort(part1Head);
//		part2Head = mergeSort(part2Head);
//		
//		head = mergeTwoSortedLL(part1Head, part2Head);
//		return head;
//		
//	}
//
//	
//	private static Scanner s = new Scanner(System.in);
//
//	public static LinkedListNode<Integer> input() {
//		int data = s.nextInt();
//
//		LinkedListNode<Integer> head = null;
//		LinkedListNode<Integer> tail = null;
//		while (data != -1) {
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
//
//	public static void main(String[] args) {
//
//		print(mergeSort(input()));
//
//	}
//}
