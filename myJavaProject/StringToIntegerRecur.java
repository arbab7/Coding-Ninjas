package myJavaProject;

import java.util.Scanner;

public class StringToIntegerRecur {

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}
	
	public static int convertStringToInt(String input){
		// Write your code here

//		if (input.length() == 0) {
//			return 0;
//		}
//		int n = input.length() - 1;
//		int digit = input.charAt(n) - 48;
//		String smallString = input.substring(0, n);
//		int output = 10 * convertStringToInt(smallString) + digit;
//		return output;

		if (input.length() == 1) {
			return input.charAt(0) - '0';
		}
		int digit = input.charAt(0) - '0';
		return digit * power(10, input.length() - 1) + convertStringToInt(input.substring(1));
	
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(input);
		System.out.println(convertStringToInt(input));
	}
	
}
