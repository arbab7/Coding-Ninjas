package myJavaProject;

import java.util.Scanner;

public class ParallelogramPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int i =1;
		while (i<=N) {
			int j=1;
			while (j<i) {
				System.out.print(' ');
				j++;
			}
			int k=1;
			while (k<=N) {
				System.out.print('*');
				k++;
			}
			System.out.println();
			i++;
		}

	}

}
