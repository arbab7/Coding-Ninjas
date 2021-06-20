package myJavaProject;

import java.util.Scanner;

public class ReturnSubsetsOfAnArray {

	public static int[][] subsets(int input[]) {
		// Write your code here
		
		if (input.length == 0) {
			return new int[1][0];
		}
		int[] smallArray = new int[input.length - 1];
		for (int i = 0; i < smallArray.length; i++) {
			smallArray[i] = input[i + 1];
		}
		int[][] temp = subsets(smallArray);
		int[][] output = new int[2 * temp.length][];
		for (int i = 0; i < temp.length; i++) {
			output[i] = new int[temp[i].length];
			for (int j = 0; j < output[i].length; j++) {
				output[i][j] = temp[i][j];
			}
		}
		for (int i = temp.length; i < output.length; i++) {
			output[i] = new int[temp[i - temp.length].length + 1];
			output[i][0] = input[0];
			for (int j = 1; j < output[i].length; j++) {
				output[i][j] = temp[i - temp.length][j - 1];
			}
		}
		return output;
		
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
		int output[][] = subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
