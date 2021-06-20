package myJavaProject;

import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		
//		int i=1;
//		while (i<=n) {
//			
//			int j=1;
//			while (j<=n) {
//				System.out.print(i);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		
//		int i=1;
//		while (i<=n) {
//			
//			int j=1;
//			while (j<=n) {
//				System.out.print(j);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int i=1;
		while (i<=n) {
			
			int j=1;
			while (j<=n) {
				System.out.print(n-j+1);
				j++;
			}
			System.out.println();
			i++;
		}
	
		
	}

}
