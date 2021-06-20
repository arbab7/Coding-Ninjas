package javaDataStructures;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class ReverseFirstKElements{
	
	public static Queue<Integer> reverseKElements(Queue<Integer> input,int k){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		Queue<Integer> newQueue = new LinkedList<Integer>();
		for (int i = 0; i < k && !input.isEmpty(); i++) {
			int temp = input.poll();
			newQueue.add(temp);
		}
		reverseQueue(newQueue);
		while (!input.isEmpty()) {
			int temp = input.poll();
			newQueue.add(temp);
		}
		return newQueue;
	}
	
	public static void reverseQueue(Queue<Integer> input) {
		if (input.isEmpty()) {
			return;
		}
		int temp = input.poll();
		reverseQueue(input);
		input.add(temp);
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 0; i < n; i++){
			q.add(s.nextInt());
		}
		int k = s.nextInt();
		Queue<Integer> ans = reverseKElements(q,k);
		while(!ans.isEmpty()){
			System.out.println(ans.remove()+" ");
		}
	}
}