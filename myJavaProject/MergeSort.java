package myJavaProject;

import java.util.Scanner;

public class MergeSort {
	
	public static void mergeSort(int[] input) {
		if (input.length <= 1) {
			return;
		}
		int midIndex = input.length / 2;
		int[] smallArr1 = new int[midIndex];
		for (int i = 0; i < smallArr1.length; i++) {
			smallArr1[i] = input[i];
		}
		int[] smallArr2 = new int[input.length - midIndex];
		for (int i = 0; i < smallArr2.length; i++) {
			smallArr2[i] = input[midIndex + i];
		}
		mergeSort(smallArr1);
		mergeSort(smallArr2);
		int i = 0, j = 0, k = 0;
		while (i < smallArr1.length && j < smallArr2.length) {
			if (smallArr1[i] <= smallArr2[j]) {
				input[k] = smallArr1[i];
				i++;
				k++;
			}
			else {
				input[k] = smallArr2[j];
				j++;
				k++;
			}
		}
		while (i < smallArr1.length) {
			input[k] = smallArr1[i];
			i++;
			k++;
		}
		while (j < smallArr2.length) {
			input[k] = smallArr2[j];
			j++;
			k++;
		}
	}
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		mergeSort(input);
		printArray(input);
	}

}
