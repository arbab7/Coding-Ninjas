package javaDataStructures;

import java.util.ArrayList;

public class MaxPriorityQueue {

	ArrayList<Integer> heap;
	
	public MaxPriorityQueue() {
		heap = new ArrayList<Integer>();
	}
	
	public int getSize() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		return getSize() == 0;
	}
	
	public void insert(int element) {
		heap.add(element);
		
		int childIndex = heap.size() - 1;
		
		while (childIndex > 0) {
			int parentIndex = (childIndex - 1) / 2;
			if (heap.get(childIndex) > heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
			}
			
			childIndex = parentIndex;
		}
	}
	
	public int getMax() {
		if (getSize() == 0) {
			return Integer.MIN_VALUE;
		}
		return heap.get(0);
	}
	
	public int removeMax() {
		if (getSize() == 0) {
			return Integer.MIN_VALUE;
		}
		
		int output = heap.get(0);
		
		heap.set(0, heap.get(getSize() - 1));
		int temp = heap.remove(heap.size() - 1);
		
		int parentIndex = 0;
		
		while (parentIndex < heap.size()) {
			int leftChildIndex = 2 * parentIndex + 1;
			int rightChildIndex = 2 * parentIndex + 2;
			int maxIndex = parentIndex;
			if (leftChildIndex < heap.size() && heap.get(maxIndex) < heap.get(leftChildIndex)) {
				maxIndex = leftChildIndex;
			}
			if (rightChildIndex < heap.size() && heap.get(maxIndex) < heap.get(rightChildIndex)) {
				maxIndex = rightChildIndex;
			}
			if (maxIndex == parentIndex) {
				break;
			}
			temp = heap.get(maxIndex);
			heap.set(maxIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);
			parentIndex = maxIndex;
		}
		return output;
	}
}
