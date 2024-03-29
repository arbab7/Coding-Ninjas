//package javaDataStructures;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
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
//public class DeleteIthNode {
//
//	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
//		//Your code goes here
//		if (pos == 0) {
//			return head.next;
//		}
//		LinkedListNode<Integer> temp = head;
//		int i = 0;
//		while (i < pos - 1 && temp != null) {
//			temp = temp.next;
//			i++;
//		}
//		if (i == pos - 1 && temp .next != null) {
//			temp.next = temp.next.next;
//		}
//		return head;
//
//	}
//
//
//	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//	public static LinkedListNode<Integer> takeInput() throws IOException {
//		LinkedListNode<Integer> head = null, tail = null;
//
//		String[] datas = br.readLine().trim().split("\\s");
//
//		int i = 0;
//		while(i < datas.length && !datas[i].equals("-1")) {
//			int data = Integer.parseInt(datas[i]);
//			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
//			if(head == null) {
//				head = newNode;
//				tail = newNode;
//			}
//			else {
//				tail.next = newNode;
//				tail = newNode;
//			}
//			i += 1;
//		}
//
//		return head;
//	}
//
//	public static void print(LinkedListNode<Integer> head){
//		while(head != null) {
//			System.out.print(head.data + " ");
//			head = head.next;
//		}
//
//		System.out.println();
//	}
//
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		int t = Integer.parseInt(br.readLine().trim());
//
//		while (t > 0) {
//			LinkedListNode<Integer> head = takeInput(); 
//
//			int pos = Integer.parseInt(br.readLine().trim());
//			head = deleteNode(head, pos);
//			print(head);
//
//			t -= 1;
//		}
//	}
//}