package myJavaProject;

import java.util.Scanner;

public class MultiplicationRecursive {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
	
		if (n == 0) {
			return 0;
		}
		int output = m + multiplyTwoIntegers(m, n - 1);
		return output;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(multiplyTwoIntegers(m, n));
	}
}
