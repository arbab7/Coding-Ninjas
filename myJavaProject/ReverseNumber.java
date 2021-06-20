package myJavaProject;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		int N=s.nextInt();
        if (N==0) {
			System.out.print(N);
		}
		while (N>0) {
			if (N%10==0) {
				N/=10;
			}else {
				break;
			}
		}
		while (N>0) {
			System.out.print(N%10);
			N/=10;
		}
	}

}
