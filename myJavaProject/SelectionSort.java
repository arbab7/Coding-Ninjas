package myJavaProject;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
            int min=arr[i],index=i;
			int j=i+1;
			while (j<arr.length) {
				if (arr[j]<min) {
					min=arr[j];
					index=j;
				}
                j++;
			}
			arr[index]=arr[i];
			arr[i]=min;
		}
    }
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	

	public static void printArray(int[] arr) {
		
		for(int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = takeInput();

		selectionSort(arr);
		printArray(arr);

	}
}