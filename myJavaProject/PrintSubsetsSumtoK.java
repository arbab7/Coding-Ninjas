package myJavaProject;

import java.util.Scanner;

public class PrintSubsetsSumtoK {

	public static void printSubsetsSumToKHelper(int[] input, int k , int si, int[] output) {
		if (si == input.length) {
			if (k == 0) {
				for (int i = 0; i < output.length; i++) {
					System.out.print(output[i] + " ");
				}
				System.out.println();
				return;
			}
			return;
		}
		int[] newArr = new int[output.length + 1];
		newArr[newArr.length - 1] = input[si];
		for (int i = 0; i < newArr.length - 1; i++) {
			newArr[i] = output[i];
		}
		printSubsetsSumToKHelper(input, k, si + 1, output);
		printSubsetsSumToKHelper(input, k - input[si], si + 1, newArr);

	}

	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here

		int[] output = new int[0];
		printSubsetsSumToKHelper(input, k, 0, output);

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
		printSubsetsSumTok(input, k);
	}

}
