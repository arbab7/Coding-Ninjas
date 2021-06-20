package javaDataStructures;

import java.util.Scanner;

public class prac {

	public static void permutations(String input){
		printPermutations(input, 0, "");
	}
	
	public static void printPermutations(String input, int i, String output) {
		if (i == input.length()) {
			System.out.println(output);
			return;
		}
		for (int j = 0; j <= output.length(); j++) {
			String newOutput = output.substring(0, j) + input.charAt(i) + output.substring(j, output.length());
			printPermutations(input, i + 1, newOutput);
		}
	}
	
	
	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static String[] permutationOfString(String input){
		return permutationsHelper(input, 0);
	}

	public static String[] permutationsHelper(String input, int i) {
		if (i == input.length()) {
			String[] output = {""};
			return output;
		}
		String[] smallOutput = permutationsHelper(input, i + 1);
		
		String[] output = new String[factorial(smallOutput[0].length() + 1)];
		int k = 0;
		for (int j = 0; j < smallOutput.length; j++) {
			if (smallOutput[j].length() == 0) {
				output[k++] = "" + input.charAt(i);
			}else {
				for (int l = 0; l <= smallOutput[j].length(); l++) {
					output[k++] = smallOutput[j].substring(0, l) + "" +  input.charAt(i) + smallOutput[j].substring(l, smallOutput[j].length());
				}
			}
		}
		return output;
	}

	public static void printSubsetsSumTok(int input[], int k) {
		int[] output = new int[0];
		printHelper(input, 0, k, output);
	}

	public static void printHelper(int[] input, int i, int k, int[] output) {
		if(i == input.length) {
			if (k == 0) {
				for (int j = 0; j < output.length; j++) {
					System.out.print(output[j] + " ");
				}
				System.out.println();
			}
			return;
		}
		int[] newOutput = new int[output.length + 1];
		newOutput[output.length] = input[i];
		for (int j = 0; j < output.length; j++) {
			newOutput[j] = output[j];
		}
		printHelper(input, i + 1, k, output);
		printHelper(input, i + 1, k - input[i], newOutput);
	}

	public static int[][] subsetsSumK(int input[], int k) {
		return helper(input, 0, k);
	}

	public static int[][] helper(int[] input, int i, int k) {
		if (i == input.length) {
			if (k == 0) {
				return new int[1][0];
			}
			return new int[0][0];
		}
		int[][] smallOutput1 = helper(input, i + 1, k);
		int[][] smallOutput2 = helper(input, i + 1, k - input[i]);
		int[][] output = new int[smallOutput1.length + smallOutput2.length][];
		if (smallOutput1.length > 0) {
			for (int j = 0; j < smallOutput1.length; j++) {
				output[j] = new int[smallOutput1[j].length];
				for (int l = 0; l < smallOutput1[j].length; l++) {
					output[j][l] = smallOutput1[j][l];
				}
			}
		}
		if (smallOutput2.length > 0) {
			for (int j = 0; j < smallOutput2.length; j++) {
				output[j + smallOutput1.length] = new int[smallOutput2[j].length + 1];
				output[j + smallOutput1.length][0] = input[i];
				for (int l = 0; l < smallOutput2[j].length; l++) {
					output[j + smallOutput1.length][l + 1] = smallOutput2[j][l];
				}
			}
		}
		return output;
	}

	public static  String[] getCode(String input){
		return helper(input, 0);
	}

	public static String[] helper(String input, int i) {
		if (i >= input.length()) {
			String[] output = {""};
			return output;
		}
		char c1 = (char)(input.charAt(i) + 48);
		String[] smallOutput1 = {};
		if (c1 > 95 && c1 < 123) {
			smallOutput1 = helper(input, i + 1);
		}

		String [] smallOutput2 = {};
		char c2 = '\0';
		if (i <= input.length() - 2) {
			c2 = (char)(((input.charAt(i) - 48) * 10) + (input.charAt(i + 1) - 48) + 96);
			if (c2 > 95 && c2 < 123) {
				smallOutput2 = helper(input, i + 2);
			}
		}

		String[] output = new String[smallOutput1.length + smallOutput2.length];
		int k = 0;
		for (int j = 0; j < smallOutput1.length; j++) {
			output[k++] = c1 + smallOutput1[j];
		}
		for (int j = 0; j < smallOutput2.length; j++) {
			output[k++] = c2 + smallOutput2[j];
		}
		return output;
	}



	public static void printSubsets(int input[]) {
		int[][] output = new int[1][0];
		helper(input, 0, output);

	}

	public static void helper(int[] input, int i, int[][] output) {
		if (i == input.length) {
			for (int j = 0; j < output.length; j++) {
				for (int k = 0; k < output[j].length; k++) {
					System.out.print(output[j][k] + " ");
				}
				System.out.println();
			}
			return;
		}
		int[][] temp = output;
		output = new int[2 * output.length][];
		for (int j = 0; j < temp.length; j++) {
			output[j] = new int[temp[j].length];
			for (int k = 0; k < temp[j].length; k++) {
				output[j][k] = temp[j][k];
			}
		}
		for (int j = 0; j < temp.length; j++) {
			output[j + temp.length] = new int[temp[j].length + 1];
			for (int k = 0; k < temp[j].length; k++) {
				output[j + temp.length][k] = temp[j][k];
			}
			output[j + temp.length][temp[j].length] = input[i];
		}
		helper(input, i + 1, output);
	}

	public static int[][] subsets(int[] input) {
		return helper(input, 0);
	}

	public static int[][] helper(int input[], int i) {
		if (i == input.length) {
			return new int[1][0];
		}
		int[][] smallOutput = helper(input, i + 1);
		int[][] output = new int[2 * smallOutput.length][];
		for (int j = 0; j < smallOutput.length; j++) {
			output[j] = new int[smallOutput[j].length];
			for (int k = 0; k < output[j].length; k++) {
				output[j][k] = smallOutput[j][k];
			}
		}
		for (int j = 0; j < smallOutput.length; j++) {
			output[j + smallOutput.length] = new int[smallOutput[j].length + 1];
			output[j + smallOutput.length][0] = input[i];
			for (int k = 1; k < output[j + smallOutput.length].length; k++) {
				output[j + smallOutput.length][k] = smallOutput[j][k - 1];
			}
		}
		return output;
	}

	public static int binarySearch(int input[], int element) {
		return helper(input, element, 0, input.length - 1);

	}

	public static int helper(int input[], int element, int si, int ei) {
		if (si > ei) {
			return -1;
		}
		int midIndex = (si + ei) / 2;
		if (input[midIndex] == element) {
			return midIndex;
		}
		if (input[midIndex] < element) {
			return helper(input, element, midIndex + 1, ei);
		}
		return helper(input, element, si, midIndex - 1);
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
		Scanner s = new Scanner(System.in);
		//		String input = s.next();
		//		String output[] = getCode(input);
		//		for(int i = 0; i < output.length; i++) {
		//			System.out.println(output[i]);
		//		}
		String input = s.next();
//		String[] output = permutationOfString(input);
//		for (int i = 0; i < output.length; i++) {
//			System.out.println(output[i]);
//		}	
		permutations(input);
	}
}
