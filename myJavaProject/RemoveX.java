package myJavaProject;

import java.util.Scanner;

public class RemoveX {
	
	public static String removeX(String input) {
		if (input.length() == 0) {
			return "";
		}
		String smallString = input.substring(1);
		if (input.charAt(0) == 'x') {
			return removeX(smallString);
		}
		else {
			return input.charAt(0) + removeX(smallString);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(removeX(input));
	}


}
