package myJavaProject;

import java.util.Scanner;

public class IsoscelesTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int i=1;
		while (i<=N) {
			int j=1;
			while (j<=N-i) {
				System.out.print(' ');
				j++;
			}
			int k=1;
			while (k<=i) {
				System.out.print(k);
				k++;
			}
			int l=1;
			while (l<=i-1) {
				System.out.print(i-l);
				l++;
			}
			System.out.println();
			i++;
		}

	}

}
