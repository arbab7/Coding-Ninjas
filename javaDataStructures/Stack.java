//package javaDataStructures;
//
//public class Stack<T> {
//
//	private Node<T> head;
//	private int size;
//
//	public Stack() {
//		head = null;
//		size = 0;
//	}
//
//	public int size() {
//		return size;
//	}
//
//	public void push(T data) {
//		Node<T> newHead = new Node<T>(data);
//		newHead.next = head;
//		head = newHead;
//		size++;
//	}
//
//	public boolean isEmpty() {
//		return size == 0;
//	}
//
//	public T pop() throws StackEmptyException {
//		if (size == 0) {
//			throw new StackEmptyException();
//		}
//		T temp = head.data;
//		head = head.next;
//		size--;
//		return temp;
//	}
//
//	public T top() throws StackEmptyException {
//		if (size == 0) {
//			throw new StackEmptyException();
//		}
//		return head.data;
//	}
//
//}
//
//class StackEmptyException extends Exception {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//
//}
//
//
//
//package javaDataStructures;
//
//import java.util.Scanner;
//
//public class Runner {
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//
//		StackUsingLL<Integer> st = new StackUsingLL<Integer>();
//
//		int choice = s.nextInt();
//		int input;
//
//		while (choice !=-1) {
//			if(choice == 1) {
//				input = s.nextInt();
//				st.push(input);
//			}
//			else if(choice == 2) {
//				try {
//					System.out.println(st.pop());
//				} catch (StackEmptyException e) {
//					System.out.println(-1);
//				}
//			}
//			else if(choice == 3) {
//				try {
//					System.out.println(st.top());
//				} catch (StackEmptyException e) {
//					System.out.println(-1);
//				}
//			}
//			else if(choice == 4) {
//				System.out.println(st.size());
//			}
//			else if(choice == 5) {
//				System.out.println(st.isEmpty());
//			}
//			choice = s.nextInt();
//		}
//	}
//}
