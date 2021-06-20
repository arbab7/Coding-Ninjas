package javaDataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing1Queue<E> {
	
	private Queue<E> queue;
	
	public StackUsing1Queue() {
		queue = new LinkedList<>();
	}
	
	public int size() {
		return queue.size();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public void push(E element) {
		queue.add(element);
	}
	
	public E top() {
		E temp = null;
		for (int i = 0; i < queue.size(); i++) {
			temp = queue.poll();
			queue.add(temp);
		}
		return temp;
	}
	
	public E pop() {
		for (int i = 0; i < queue.size() - 1; i++) {
			queue.add(queue.poll());
		}
		E temp = queue.poll();
		return temp;
	}
}
