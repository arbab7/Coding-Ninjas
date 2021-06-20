package myJavaProject;

import java.util.Scanner;

public class SumOfDigitsRecursive {
	
	public static int sumOfDigits(int input) {
		if (input == 0) {
			return 0;
		}
		int output = input % 10 + sumOfDigits(input / 10);
		return output;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sumOfDigits(n));
	}
	
}
