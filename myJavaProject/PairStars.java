package myJavaProject;

import java.util.Scanner;

public class PairStars {
	
	public static String addStars(String s) {
		// Write your code here
		if (s.length() == 0 || s.length() == 1) {
			return s;
		}
		String smallString = s.substring(1);
		if (s.charAt(0) == s.charAt(1)) {
			return s.charAt(0) + "*" + addStars(smallString);
		}
		else {
			return s.charAt(0) + addStars(smallString);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(addStars(input));
		
	}
}
