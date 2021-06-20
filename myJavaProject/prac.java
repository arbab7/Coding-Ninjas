package myJavaProject;

import java.util.Scanner;

public class prac {

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;

	}

	public static int count(int n) {
		while (true) {
			if (n == 5) {
				return n;
			}
			n++;
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		int n = s.nextInt();
//		System.out.println(factorial(n));
//		int num = count(2);
//		System.out.println(num);
		char c = 124;
		System.out.println(c + " ");
	}

}
