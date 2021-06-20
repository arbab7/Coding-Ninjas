package javaDataStructures;

public class StackUse {
	
	public static void main(String[] args) throws StackEmptyException{
//		StackUsingArray stack = new StackUsingArray();
//		StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<Integer>();
		StackUsing1Queue<Integer> stack = new StackUsing1Queue<Integer>();
		int[] array = {1, 2, 5 , 4, 3};
		for (int i = 0; i < array.length; i++) {
			stack.push(array[i]);
		}
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
	
}
