package myJavaProject;

import java.util.Scanner;

public class ReturnSubsetsSumToK {

	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
       
		if (input.length == 0) {
			if (k == 0) {
				return new int [1][0];
			}
			else {
				return new int [0][0];
			}
		}
		int[] smallArray = new int[input.length - 1];
		for (int i = 0; i < smallArray.length; i++) {
			smallArray[i] = input[i + 1];
		}
		int[][]temp1 = subsetsSumK(smallArray, k - input[0]);
		int[][]temp2 = subsetsSumK(smallArray, k);
		
		int[][]output = new int[temp1.length + temp2.length][];
		for (int i = 0; i < temp1.length; i++) {
			output[i] = new int[temp1[i].length + 1];
			output[i][0] = input [0];
			for (int j = 1; j < output[i].length; j++) {
				output[i][j] = temp1[i][j - 1];
			}
		}
		for (int i = temp1.length; i < output.length; i++) {
			output[i] = new int[temp2[i - temp1.length].length];
			for (int j = 0; j < output[i].length; j++) {
				output[i][j] = temp2[i - temp1.length][j];
			}
		}
		return output;
           
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
		int[] input = takeInput();
		int k = s.nextInt();
		int output[][] = subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
