package myJavaProject;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int i=1;
		while (i<=N) {
			int j=1;
			while (j<=N-i+1) {
				System.out.print(2*(i+j-1)-1);
				j++;
			}
			int k=1;
			while (k<=i-1) {
				System.out.print(2*k-1);
				k++;

			}
			System.out.println();
			i++;
		}

	}

}
