package myJavaProject;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int i=1;
		while (i<=N) {
			System.out.print('1');
			int sum=1;
			int j=1;
			while (j<=i-1) {
				System.out.print('+');
				System.out.print(j+1);
				sum+=j+1;
				j++;
			}
			System.out.println('='+""+sum);
			i++;
		}

	}

}
