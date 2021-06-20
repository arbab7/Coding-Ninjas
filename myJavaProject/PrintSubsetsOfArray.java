package myJavaProject;

import java.util.Scanner;

public class PrintSubsetsOfArray {

	public static void printSubsetsHelper(int[] input, int si, int[] output) {
		if (si == input.length) {
			for (int i = 0; i < output.length; i++) {
				System.out.print(output[i] + " ");
			}
			System.out.println();
			return;
		}
		int[] newArr = new int[output.length + 1];
		newArr[newArr.length - 1] = input[si];
		for (int i = 0; i < newArr.length - 1; i++) {
			newArr[i] = output[i];
		}
		printSubsetsHelper(input, si + 1, output);
		printSubsetsHelper(input, si + 1, newArr);
	}
	
	public static void printSubsets(int input[]) {
		// Write your code here
		int[] output = new int[0];
		printSubsetsHelper(input, 0, output);
		
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
	
	public static void main(String[] args) {
		int[] input = takeInput();
		printSubsets(input);
	}
	
}
