package myJavaProject;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		if (N==0) {
			System.out.print(N);
		}else {
		int decNum=0;
		for(int i=1;N>0;) {
			decNum+=N%10*i;
			N/=10;
			i=i*2;
		}
		System.out.println(decNum);
		}

	}

}
