package myJavaProject;

import java.util.Scanner;

public class TriangularPattern {

	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		
//		int i=1;
//		while (i<=n) {
//			
//			int j=1;
//			while (j<=i) {
//				System.out.print(j);
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
//		int p=1;
//		while (i<=n) {
//			
//			int j=1;
//			while (j<=i) {
//				System.out.print(p);
//				j++;
//				p++;
//			}
//			System.out.println();
//			i++;
//		}

//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		
//		int i=1;
//		
//		while (i<=n) {
//			int p=i;
//			int j=1;
//			while (j<=i) {
//				System.out.print(p);
//				j++;
//				p++;
//			}
//			System.out.println();
//			i++;
//		}


		Scanner s= new Scanner(System.in);
		int N=s.nextInt();
		int i=1;
		while (i<=N) {
			int j=1;
			while (j<=i) {
				System.out.print('*');
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
