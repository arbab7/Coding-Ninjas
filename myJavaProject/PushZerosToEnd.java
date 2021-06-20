package myJavaProject;

import java.util.Scanner;

public class PushZerosToEnd {

	public static void pushZerosAtEnd(int[] arr) {
		int i=0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j]!=0) {
				arr[i]=arr[j];
				i++;
			}
		}
		for (int j = i; j < arr.length; j++) {
			arr[j]=0;
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

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = takeInput();

		pushZerosAtEnd(arr);
		printArray(arr);
	}
}