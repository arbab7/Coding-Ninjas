package myJavaProject;

public class DynamicArray {

	private int[] data;
	private int nextIndex;
	
	public DynamicArray() {
		data = new int[5];
		nextIndex = 0;
	}
	
	public int size() {
		return nextIndex;
	}
	
	public boolean isEmpty() {
		return nextIndex == 0;
	}
	
	public int get(int index) {

		if (index>=nextIndex) {
			return -1;
		}
		return data[index];
	}

	public void set(int index, int num) {
		if (index >= nextIndex) {
			//Error
			return;
		}
		data[index] = num;
	}
	
	public void print() {
		for (int i = 0; i < nextIndex; i++) {
			System.out.println(data[i]);
		}
	}
	
	public void add(int num) {
		if (nextIndex == data.length) {
		doubleCapacity();	
		}
		data[nextIndex] = num;
		nextIndex++;
	}
	
	public void doubleCapacity() {
		int[] temp = data;
		data = new int[2*temp.length];
		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}

	public int popLastElement() {
		if (nextIndex == 0) {
			return -1;
		}
		int temp = data[nextIndex - 1];
		data[nextIndex - 1] = 0;
		nextIndex--;
		return temp;
	}
	
}
