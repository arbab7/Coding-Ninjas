package myJavaProject;

import java.util.Scanner;

public class PrimeNumUpToN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int i;
		for (i = 2; i <=N; i++) {
			boolean isPrime=true;
			int j;
			for (j = 2; j <= i-1; j++) {
				if (i%j==0) {
					isPrime=false;
				}
			}if (isPrime) {
				System.out.println(i);
		}
		}
	}

}
