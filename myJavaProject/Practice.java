package myJavaProject;


import java.util.Arrays;
import java.util.Scanner;


class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}


public class Practice {

	
	public static LinkedListNode<Integer> helper(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> output = null;
		while (temp != null) {
			LinkedListNode<Integer> temp2 = new LinkedListNode<Integer>(temp.data);
			temp2.next = output;
			output = temp2;
			temp = temp.next;
		}
		return output;
	}
	
	public static boolean isPalindrome_2(LinkedListNode<Integer> head){
		int l = length(head);
		LinkedListNode<Integer> t1 = head;
		int mid= (l + 1)/2;
		boolean isPalindrome= true; 
		
		for(int i = 0;i < mid - 1;i++) {
			t1= t1.next;
		}
		LinkedListNode<Integer> t2 = null;
		 t2= t1.next;
		 t2 = helper(t2);
		 t1.next= null;
		 t1 = head;
		 while(t2!=null) {
			 if(t2.data != t1.data) {
				 isPalindrome=false;
				 break;
			 }
			 t1=t1.next;
			 t2=t2.next;
		 }
		 return isPalindrome;
	}

	public static int length(LinkedListNode<Integer> head){
	    int count=0;
	    while(head!=null){
	        count++;
	        head=head.next;
	    }
	    return count;
	}
	    

	static Scanner s = new Scanner(System.in);

	public static LinkedListNode<Integer> takeInput() {
		LinkedListNode<Integer> head = new LinkedListNode<Integer>(s.nextInt());
		LinkedListNode<Integer> temp = head;
		int data = s.nextInt();
		while (data != -1) {
			temp.next = new LinkedListNode<Integer>(data);
			temp = temp.next;
			data = s.nextInt();
		}
		return head;
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = takeInput();
		System.out.println(isPalindrome_2(head));
	}
	
}

