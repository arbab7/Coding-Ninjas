package myJavaProject;

import java.util.Scanner;

public class PrimeNum{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int div=2;
		boolean isPrime = true;
		while (div< n) {
			if (n%div==0) {
				isPrime=false;
			}
			div+=1;
		}
		if (isPrime) {
			System.out.println("Prime");
			
		}else {
			System.out.println("Composite");
		}
	}

}
