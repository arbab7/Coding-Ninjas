package myJavaProject;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int div=2;
		while (div<n) {
			if (n%div==0) {
				System.out.print(div+ " ");
			}
			div++;
		}

	}

}
