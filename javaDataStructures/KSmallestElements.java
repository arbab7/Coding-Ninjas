package javaDataStructures;

import java.util.ArrayList;

public class KSmallestElements {

	public static void downHeapify(int[] arr, int startIndex, int endIndex) {
		int parentIndex = startIndex;
		
		while (parentIndex < endIndex) {
			int leftChildIndex = 2 * parentIndex + 1;
			int rightChildIndex = 2 * parentIndex + 2;
			int maxIndex = parentIndex;
			if (leftChildIndex < endIndex && arr[leftChildIndex] > arr[maxIndex]) {
				maxIndex = leftChildIndex;
			}
			if (rightChildIndex < endIndex && arr[rightChildIndex] > arr[maxIndex]) {
				maxIndex = rightChildIndex;
			}
			if (maxIndex == parentIndex) {
				return;
			}
			int temp = arr[parentIndex];
			arr[parentIndex] = arr[maxIndex];
			arr[maxIndex] = temp;
			parentIndex = maxIndex;
		}
	}
	
	public static ArrayList<Integer> kSmallest(int[] input, int k) {

		for (int i = k / 2 - 1; i >= 0; i--) {
			downHeapify(input, i, k);
		}
		for (int i = k; i < input.length; i++) {
			if (input[i] < input[0]) {
				int temp = input[0];
				input[0] = input[i];
				input[i] = temp;
				downHeapify(input, 0, k);
			}
		}
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < k; i++) {
			output.add(input[i]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] arr = {6, 2, 7, 1, 9, 5, 3, 8};
		ArrayList<Integer> output = kSmallest(arr, 3);
		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}
	}
	
}