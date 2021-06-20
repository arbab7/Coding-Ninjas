package myJavaProject;

import java.util.Scanner;

public class CheckAB {

	public static boolean checkAB(String input) {
		// Write your code here
		if (input.length() == 0) {
			return false;
		}
		if (input.charAt(0) == 'a') {
			if (input.length() == 1) {
				return true;
			}
			if (input.charAt(1) == 'a') {
				String smallString = "a" + input.substring(2);
				return checkAB(smallString);
			}
			if (input.charAt(1) == 'b') {
				if (input.length() == 2) {
					return false;
				}
				else if (input.charAt(2) == 'b') {
					String smallString = "a" + input.substring(3);
					return checkAB(smallString);
				}
				
			}
		}
		
		return false;
	
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
	}
	
}
