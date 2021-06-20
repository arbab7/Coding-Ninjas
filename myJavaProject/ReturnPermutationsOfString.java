package myJavaProject;

import java.util.Scanner;

public class ReturnPermutationsOfString {

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static String[] permutationHelper(String input, int startIndex) {
		if (startIndex == input.length() - 1) {
			String[] output = {input.charAt(startIndex) + ""};
			return output;
		}
//		if (startIndex == input.length()) {
//			return new String[0];
//		}
		String[] smallString = permutationHelper(input, startIndex + 1);
		String[] output = new String[factorial(input.substring(startIndex).length())];
		int k = 0;
		while (k < output.length) {
//			if (smallString.length == 0) {
//				output[k] = input.charAt(startIndex) + "";
//				k++;
//			}
			for (int i = 0; i < smallString.length; i++) {
				for (int j = 0; j <= smallString[i].length(); j++) {
					output[k] = smallString[i].substring(0, j) + input.charAt(startIndex) + smallString[i].substring(j, smallString[i].length());
					k++;
				}

			}
		}
		return output;
		
		
	}

	public static String[] permutationOfString(String input){
		// Write your code here
		return permutationHelper(input, 0);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output[] = permutationOfString(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}
}
