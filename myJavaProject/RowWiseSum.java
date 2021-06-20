package myJavaProject;

import java.util.Scanner;

public class RowWiseSum {

	public static int[][] takeInput() {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int[][]arr=new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=s.nextInt();
			}
		}
		return arr;
	}
	
	public static void printRowwiseSum(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int [][]arr=takeInput();
		printRowwiseSum(arr);
	}
	
}
