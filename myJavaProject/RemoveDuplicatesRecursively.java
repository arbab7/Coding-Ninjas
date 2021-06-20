package myJavaProject;

import java.util.Scanner;

public class RemoveDuplicatesRecursively {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		
		if (s.length() <= 1) {
			return s;
		}
		String smallString = s.substring(1);
		if (s.charAt(0) == s.charAt(1)) {
			return removeConsecutiveDuplicates(smallString);
		}
		else {
			return s.charAt(0) + removeConsecutiveDuplicates(smallString);
		}
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		String input = s.next();
		System.out.println(removeConsecutiveDuplicates(input));
	}
}
