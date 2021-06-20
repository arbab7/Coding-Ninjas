package myJavaProject;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int i=1;
		int k=0;
		while (N>0) {
			k+=N%2*i;
			N/=2;
			i*=10;
		}
		System.out.println(k);

	}

}
