package myJavaProject;

import java.util.Scanner;

public class CountZerosRecursion {

	public static int countZerosRec(int input) {
		if (input == 0) {
			return 1;
		}
		if (input / 10 == 0) {
			return 0;
		}
		if (input % 10 == 0) {
			return 1 + countZerosRec(input / 10);
		}
		else {
			return countZerosRec(input / 10);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countZerosRec(n));
	}
	
}
