package javaDataStructures;

public class CheckMaxHeap {

	public static boolean checkMaxHeap(int arr[]) {
		int parentIndex = 0;
		while (parentIndex < arr.length) {
			int leftChildIndex = 2 * parentIndex + 1;
			int rightChildIndex = 2 * parentIndex + 2;
			if (leftChildIndex >= arr.length) {
				break;
			}else if (arr[leftChildIndex] >arr[parentIndex]) {
				return false;
			}
			if (rightChildIndex >= arr.length) {
				break;
			}else if (arr[rightChildIndex] > arr[parentIndex]) {
				return false;
			}
			parentIndex++;
		}
		return true;
	}
	
}
