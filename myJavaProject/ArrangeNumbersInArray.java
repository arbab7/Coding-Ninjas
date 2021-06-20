package myJavaProject;

import java.util.Scanner;


public class ArrangeNumbersInArray {

	static Scanner S = new Scanner(System.in);

	public static void printArray(int[] arr) {

		for(int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();

	}
	
	public static void arrange(int[]array,int n) {
		for (int i = 0; i <=(n-1)/2; i++) {
			array[i]=2*i+1;
		}
		int x=0;
		for (int i = (n+1)/2; i <n; i++) {
			array[i]=n/2*2-2*x;
			x++;
		}
		
	}

	public static void main(String[] args) {

		int n = S.nextInt();
		int[] arr = new int[n];

		arrange(arr, n);
		printArray(arr);

	}
	
}
