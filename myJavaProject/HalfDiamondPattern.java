package myJavaProject;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N= s.nextInt();
		int i=1;
		while (i<=N+1) {
			System.out.print('*');
			int j=1;
			while (j<=i-1) {
				System.out.print(j);
				j++;
			}
			int k=1;
			while (k<=i-2) {
				System.out.print(i-k-1);
				k++;
			}
			if (i!=1) {
				System.out.print('*');
			}
			System.out.println();
			i++;
		}
		int l=1;
		while (l<=N-1) {
			if (l!=N) {
				System.out.print('*');
			}
			int j=1;
			while (j<=N-l) {
				System.out.print(j);
				j++;
				
			}
			int k=1;
			while (k<=N-l-1) {
				System.out.print(N-l-k);
				k++;
			}
			if (l!=N) {
				System.out.print('*');
			}
			System.out.println();
			l++;
			
		}
		System.out.print('*');

	}

}
