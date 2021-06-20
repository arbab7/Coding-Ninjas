package javaDataStructures;

import java.util.ArrayList;

class PriorityQueueException extends Exception {

}

public class RemoveMin {

	private ArrayList<Integer> heap;

	public RemoveMin() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty(){
		return heap.size() == 0;
	}

	int size(){
		return heap.size();
	}

	int getMin() throws PriorityQueueException{
		if(isEmpty()){
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element){
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while(childIndex > 0){
			if(heap.get(childIndex) < heap.get(parentIndex)){
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}else{
				return;
			}
		}
	}

	int removeMin() throws PriorityQueueException{
		if (size() == 0) {
			throw new PriorityQueueException();
		}
		int output = heap.get(0);
		
		int temp = heap.get(heap.size() - 1);
		heap.set(0, temp);
		heap.remove(heap.size() - 1);
		
		int parentIndex = 0;
		
		while (parentIndex < heap.size()) {
			int leftChildIndex = 2 * parentIndex + 1;
			int rightChildIndex = 2 * parentIndex + 2;
			int minIndex = parentIndex;
			if (leftChildIndex < heap.size() && heap.get(minIndex) > heap.get(leftChildIndex)) {
				minIndex = leftChildIndex;
			}
			if (rightChildIndex < heap.size() && heap.get(minIndex) > heap.get(rightChildIndex)) {
				minIndex = rightChildIndex;
			}
			if (minIndex == parentIndex) {
				break;
			}
			temp = heap.get(parentIndex);
			heap.set(parentIndex, heap.get(minIndex));
			heap.set(minIndex, temp);
			parentIndex = minIndex;
		}
		return output;
	}
}