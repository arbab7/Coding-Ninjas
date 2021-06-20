package myJavaProject;

import java.util.Scanner;

public class CheckArrayRotation {

	public static int arrayRotateCheck(int[] arr){
		int i=0;
		int n=arr.length;
		if (n==0) {
			return 0;
		}
		while (arr[i]<=arr[i+1]) {
			i++;
		}
		return i+1;
	}


	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();

		System.out.println(arrayRotateCheck(arr));
	}
}