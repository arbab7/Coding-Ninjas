package javaDataStructures;

import java.util.ArrayList;

public class MaxHeapPriorityQueue<T> {

private ArrayList<Element<T>> heap;
	
	public MaxHeapPriorityQueue() {
		heap = new ArrayList<Element<T>>();
	}
	
	public void insert(T value, int priority) {
		Element<T> elem = new Element<T>(value, priority);
		heap.add(elem);
		
		int childIndex = heap.size() - 1;
		
		while (childIndex >= 0) {
			int parentIndex = (childIndex - 1) / 2;
			if (heap.get(childIndex).priority > heap.get(parentIndex).priority) {
				Element<T> temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
			}else {
				return;
			}
			childIndex = parentIndex;	
		}
	}
	
	public T remove() throws EmptyQueueException{
		if (size() == 0) {
			throw new EmptyQueueException();
		}
		T output = heap.get(0).value;
		
		Element<T> temp = heap.get(heap.size() - 1);
		heap.set(0, temp);
		heap.remove(heap.size() - 1);
		
		int parentIndex = 0;
		
		while (parentIndex < heap.size()) {
			int leftChildIndex = 2 * parentIndex + 1;
			int rightChildIndex = 2 * parentIndex + 2;
			int maxIndex = parentIndex;
			if (leftChildIndex < heap.size() && heap.get(maxIndex).priority < heap.get(leftChildIndex).priority) {
				maxIndex = leftChildIndex;
			}
			if (rightChildIndex < heap.size() && heap.get(maxIndex).priority < heap.get(rightChildIndex).priority) {
				maxIndex = rightChildIndex;
			}
			if (maxIndex == parentIndex) {
				break;
			}
			temp = heap.get(parentIndex);
			heap.set(parentIndex, heap.get(maxIndex));
			heap.set(maxIndex, temp);
			parentIndex = maxIndex;
		}
		return output;
	}
	
	public Element getMax() throws EmptyQueueException{
		if (size() == 0) {
			throw new EmptyQueueException();
		}
		return heap.get(0);
	}
	
	public int size() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		return heap.isEmpty();
	}
	
}
