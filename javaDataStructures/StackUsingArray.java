package javaDataStructures;

public class StackUsingArray {

	private int[] data;
	private int topIndex;

	public StackUsingArray() {
		data = new int[2];
		topIndex = -1;
	}

	public StackUsingArray(int n) {
		data = new int[n];
		topIndex = -1;
	}

	public boolean isEmpty() {
		return topIndex == -1;
	}
	
	public void push(int element) {
	
		if (topIndex == data.length - 1) {
			doubleCapacity();
		}
		data[++topIndex] = element;
	}

	public int size() {
		return topIndex + 1;
	}

	public int top() throws StackEmptyException{
		if (topIndex == -1) {
			//throw exception
			throw new StackEmptyException();
		}
		return data[topIndex];
	}

	public int pop() throws StackEmptyException{
		if (topIndex == -1) {
			throw new StackEmptyException();
		}
		return data[topIndex--];
	}
	
	private void doubleCapacity() {
		int[] temp = data;
		data = new int[data.length * 2];
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}

}
