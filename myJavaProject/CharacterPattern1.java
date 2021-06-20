package myJavaProject;

import java.util.Scanner;

public class CharacterPattern1 {
	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
//		
//		int i=1;
//		
//		while (i<=n) {
//			int j=1;
//			while (j<=n) {
//				char p=(char)('A'+j-1);
//				System.out.print(p);
//				j++;
//				
//			}
//			System.out.println();
//			i++;
//		}
		
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int i=1;
		while (i<=N) {
			int j=1;
			while (j<=i) {
				System.out.print((char)('A'+N-i+j-1));
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
