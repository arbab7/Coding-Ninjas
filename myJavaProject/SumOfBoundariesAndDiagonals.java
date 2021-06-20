package myJavaProject;

import java.util.Scanner;

public class SumOfBoundariesAndDiagonals {

	public static int[][] takeInput() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[][]arr=new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		return arr;
	}
	
	public static void printSum(int[][]arr) {
		int sum=0;
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==0||i==n-1||j==0||j==n-1||j==i||j==n-1-i) {
					sum+=arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int[][]arr=takeInput();
		printSum(arr);

	}

}
