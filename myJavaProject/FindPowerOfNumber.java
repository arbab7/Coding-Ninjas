package myJavaProject;

import java.util.Scanner;

public class FindPowerOfNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x= s.nextInt();
		int n= s.nextInt();
		int i=1, ans=1;
		while (i<=n) {
			ans=ans*x;
			i++;
		}
		System.out.println(ans);

	}

}
