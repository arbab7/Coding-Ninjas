package myJavaProject;

import java.util.Scanner;

public class CheckPalindromRecursive {

	public static boolean isStringPalindrome(String input) {
		// Write your code here

		if (input.length() == 0 || input.length() == 1) {
			return true;
		}
		if (input.charAt(0) != input.charAt(input.length() - 1)) {
			return false;
		}
		String smallString = input.substring(1, input.length() - 1);
		return isStringPalindrome(smallString);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isStringPalindrome(input));
	}
	
}
