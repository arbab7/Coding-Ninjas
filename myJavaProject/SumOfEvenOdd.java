package myJavaProject;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int D;
		int E=0,O=0;
		while(N>0)
		{
			D=N%10;
			N=N/10;
			if(D%2!=0)
				O=O+D;
			else
				E=E+D;
		}
		System.out.print(E+" "+O);
				
	}

}
