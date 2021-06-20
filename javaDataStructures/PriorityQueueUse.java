package javaDataStructures;

import java.util.Scanner;

public class PriorityQueueUse {

	public static void main(String[] args) throws EmptyQueueException {
//		MinPriorityQueue<String> queue = new MinPriorityQueue<String>();
//		queue.insert("a", 10);
//		queue.insert("b", 5);
//		queue.insert("c", 12);
//		queue.insert("d", 6);
//		queue.insert("e", 4);
		
//		while (!queue.isEmpty()) {
//			String s = queue.remove();
//			System.out.println(s);
//		}
		MaxPriorityQueue queue = new MaxPriorityQueue();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			queue.insert(s.nextInt());
		}
		while (queue.getSize() > 0) {
			System.out.println(queue.removeMax());
		}
	}
	
}
