//package javaDataStructures;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//class LinkedListNode<T> {
//    T data;
//    LinkedListNode<T> next;
//    
//    public LinkedListNode(T data) {
//        this.data = data;
//    }
//}
//
//public class PalindromeLL {
//    
//	public static boolean isPalindrome(LinkedListNode<Integer> head) {
//		//Your code goes here
//		if (head == null) {
//			return true;
//		}
//		LinkedListNode<Integer> temp = head;
//		LinkedListNode<Integer> temp1 = null;
//		LinkedListNode<Integer> newHead = null;
//		while (temp != null) {
//			newHead = new LinkedListNode(temp.data);
//			newHead.next = temp1;
//			temp = temp.next;
//			temp1 = newHead;
//		}
//		
//		while (head != null) {
//			if (head.data != newHead.data) {
//				return false;
//			}
//			head = head.next;
//			newHead = newHead.next;
//		}
//		return true;
//		
//		
//		
//	}
//	
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    
//    public static LinkedListNode<Integer> takeInput() throws IOException {
//        LinkedListNode<Integer> head = null, tail = null;
//
//        String[] datas = br.readLine().trim().split("\\s");
//
//        int i = 0;
//        while(i < datas.length && !datas[i].equals("-1")) {
//            int data = Integer.parseInt(datas[i]);
//            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
//            if(head == null) {
//                head = newNode;
//                tail = newNode;
//            }
//            else {
//                tail.next = newNode;
//                tail = newNode;
//            }
//            i += 1;
//        }
//
//        return head;
//    }
//    
//    public static void print(LinkedListNode<Integer> head){
//        while(head != null) {
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
//        
//        System.out.println();
//    }
//    
//    public static void main(String[] args) throws NumberFormatException, IOException {
//        int t = Integer.parseInt(br.readLine().trim());
//
//        while (t > 0) {
//
//            LinkedListNode<Integer> head = takeInput(); 
//
//            boolean ans = isPalindrome(head);
//            System.out.println(ans);
//
//            t -= 1;
//
//        }
//        
//    }
//}