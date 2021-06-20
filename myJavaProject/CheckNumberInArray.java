package myJavaProject;

import java.util.Scanner;

public class CheckNumberInArray {

	public static boolean checkNumber(int[] input, int x) {
		if (input[0] == x) {
			return true;
		}
		if (input.length == 1) {
			return false;
		}
		int[] smallArray = new int[input.length - 1];
		for (int i = 0; i < smallArray.length; i++) {
			smallArray[i] = input[i + 1];
		}
		return checkNumber(smallArray, x);
	}
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));
	}
	
}
