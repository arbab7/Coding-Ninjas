//package javaDataStructures;
//
//import java.util.Scanner;
//
//
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
//public class BubbleSortIterativeLinkedList {
//	
//	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head ){
//		//Write your code here
//		
//		if (head == null || head.next == null) {
//			return head;
//		}
//		LinkedListNode<Integer> sortedLL = null, currentNode, prevNode, nextNode;
//		while (sortedLL != head) {
//			currentNode = head; 
//			prevNode = null;
//			nextNode = head.next;
//			while (nextNode != sortedLL) {
//				if (currentNode.data > nextNode.data) {
//					if (currentNode == head) {
//						currentNode.next = nextNode.next;
//						nextNode.next = currentNode;
//						head = nextNode;
//						prevNode = nextNode;
//						nextNode = currentNode.next;
//					}else {
//						currentNode.next = nextNode.next;
//						nextNode.next = currentNode;
//						prevNode.next = nextNode;
//						prevNode = nextNode;
//						nextNode = currentNode.next;
//					}
//				}else {
//					prevNode = currentNode;
//					currentNode = nextNode;
//					nextNode = nextNode.next;
//				}
//			}
//			sortedLL = currentNode; 
//		}
//		return head;
//	}
//
//	
//	private static Scanner s= new Scanner(System.in);
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
//
//	public static void main(String[] args) {
//		print(bubbleSort(input()));
//	}
//}
