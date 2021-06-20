package javaDataStructures;

import java.util.Scanner;

public class InplaceHeapSort {

	public static void inplaceHeapSort(int input[]) {
	
		for (int i = 1; i < input.length; i++) {
			int childIndex = i;
			while (childIndex > 0) {
				int parentIndex = (childIndex - 1) / 2;
				if (input[parentIndex] > input[childIndex]) {
					int temp = input[childIndex];
					input[childIndex] = input[parentIndex];
					input[parentIndex] = temp;
					childIndex = parentIndex;
				}
				else {
					break;
				}
			}
		}
		
		for (int i = input.length - 1; i > 0; i--) {
			int temp = input[0];
			input[0] = input[i];
			input[i] = temp;
			
			int parentIndex = 0;
			while (parentIndex < i) {
				int leftChildIndex = 2 * parentIndex + 1;
				int rightChildindex = 2 * parentIndex + 2;
				int minIndex = parentIndex;
				if (leftChildIndex < i && input[leftChildIndex] < input[minIndex]) {
					minIndex = leftChildIndex;
				}
				if (rightChildindex < i && input[rightChildindex] < input[minIndex]) {
					minIndex = rightChildindex;
				}
				if (minIndex == parentIndex) {
					break;
				}
				temp = input[minIndex];
				input[minIndex] = input[parentIndex];
				input[parentIndex] = temp;
				parentIndex = minIndex;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =  s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		inplaceHeapSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
