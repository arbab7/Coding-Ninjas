package javaDataStructures;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElements {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < k; i++) {
			pq.add(input[i]);
		}
		for (int i = k; i < input.length; i++) {
			if (input[i] > pq.peek()) {
				pq.poll();
				pq.add(input[i]);
			}
		}
		ArrayList<Integer> output = new ArrayList<Integer>();
		while (!pq.isEmpty()) {
			output.add(pq.poll());
		}
		return output;
	}
	
}
