package myJavaProject;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		int N=s.nextInt();
//		for (int i = 1; i<=N; i++) {
//			for (int j = 1; j <=N-i; j++) {
//				System.out.print(N-j+1);
//			}
//			System.out.print('*');
//			for (int k=1; k <=i-1; k++) {
//				System.out.print(i-k);
//			}
//			System.out.println();
//		}
//		

//		int N = s.nextInt();
//		for (int i =1; i <=N; i++) {
//			for (int j =1; j <=i-1; j++) {
//				System.out.print('0');
//			}
//			System.out.print('*');
//			for (int j =1; j <=N-i; j++) {
//				System.out.print('0');
//			}
//			System.out.print('*');
//			for (int j =1; j <=N-i; j++) {
//				System.out.print('0');
//			}
//			System.out.print('*');
//			for (int j =1; j <=i-1; j++) {
//				System.out.print('0');
//			}
//			System.out.println();
//		}
		
		
		int N=s.nextInt();
		int sum=0;
		int p=N;
		int x=N;
		int c=0;
		while (N>0) {
			N/=10;
			c++;
		}
		while (p>0) {
			int j=p%10;
			int k=1;
			for (int i =1; i <=c; i++) {
				k*=j;
			}
			sum+=k;
			p/=10;
		}
		System.out.println(sum==x);
		
		
		
	}

}
