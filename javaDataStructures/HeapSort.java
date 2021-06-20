package javaDataStructures;

import java.util.Scanner;

public class HeapSort {

	public static void heapSort(int[] arr) { // O(n) space complexity
		MaxPriorityQueue heap = new MaxPriorityQueue();
		for (int i = 0; i < arr.length; i++) {
			heap.insert(arr[i]);
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = heap.removeMax();
		}
	}
	
	public static void inPlaceHeapSort(int[] arr) { //O(1) space complexity
		for (int i = 1; i < arr.length; i++) {
			int childIndex = i;
			while (childIndex > 0) {
				int parentIndex = (childIndex - 1) / 2;
				if (arr[parentIndex] < arr[childIndex]) {
					int temp = arr[childIndex];
					arr[childIndex] = arr[parentIndex];
					arr[parentIndex] = temp;
					childIndex = parentIndex;
				}
				else {
					break;
				}
			}
		}
		for (int i = arr.length - 1; i > 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			int parentIndex = 0;
			while (parentIndex < i) {
				int leftChildIndex = 2 * parentIndex + 1;
				int rightChildIndex = 2 * parentIndex + 2;
				int maxIndex = parentIndex;
				if (leftChildIndex < i && arr[leftChildIndex] > arr[maxIndex]) {
					maxIndex = leftChildIndex;
				}
				if (rightChildIndex < i && arr[rightChildIndex] > arr[maxIndex]) {
					maxIndex = rightChildIndex;
				}
				if (maxIndex == parentIndex) {
					break;
				}
				temp = arr[parentIndex];
				arr[parentIndex] = arr[maxIndex];
				arr[maxIndex] = temp;
				parentIndex = maxIndex;
			}
		}
	}
	
	public static void inplaceHeapSort(int[] arr) { // more optimized
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			downHeapify(arr, i, arr.length);
			
//			int parentIndex = i;
//			while (parentIndex < arr.length) {
//				int leftChildIndex = 2 * parentIndex + 1;
//				int rightChildIndex = 2 * parentIndex+ 2;
//				int maxIndex = parentIndex;
//				if (leftChildIndex < arr.length && arr[leftChildIndex] > arr[maxIndex]) {
//					maxIndex = leftChildIndex;
//				}
//				if (rightChildIndex < arr.length && arr[rightChildIndex] > arr[maxIndex]) {
//					maxIndex = rightChildIndex;
//				}
//				if (maxIndex == parentIndex) {
//					break;
//				}
//				int temp = arr[maxIndex];
//				arr[maxIndex] = arr[parentIndex];
//				arr[parentIndex] = temp;
//				parentIndex = maxIndex;
//			}
		}
		
		for (int i = arr.length - 1; i > 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			downHeapify(arr, 0, i);
			
//			int parentIndex = 0;
//			while (parentIndex < i) {
//				int leftChildIndex = 2 * parentIndex + 1;
//				int rightChildIndex = 2 * parentIndex + 2;
//				int maxIndex = parentIndex;
//				if (leftChildIndex < i && arr[leftChildIndex] > arr[maxIndex]) {
//					maxIndex = leftChildIndex;
//				}
//				if (rightChildIndex < i && arr[rightChildIndex] > arr[maxIndex]) {
//					maxIndex = rightChildIndex;
//				}
//				if (maxIndex == parentIndex) {
//					break;
//				}
//				temp = arr[parentIndex];
//				arr[parentIndex] = arr[maxIndex];
//				arr[maxIndex] = temp;
//				parentIndex = maxIndex;
//			}
 		}
	}

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
				break;
			}
			int  temp = arr[parentIndex];
			arr[parentIndex] = arr[maxIndex];
			arr[maxIndex] = temp;
			parentIndex = maxIndex;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =  s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
//		heapSort(arr);
//		inPlaceHeapSort(arr);
		inplaceHeapSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
}
