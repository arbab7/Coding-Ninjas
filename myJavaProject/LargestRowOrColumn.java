package myJavaProject;

import java.util.Scanner;

public class LargestRowOrColumn {

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
	
	public static void printLargestSum(int[][] arr) {
		int rMaxSum=Integer.MIN_VALUE,rowNum=0;
		int cMaxSum=Integer.MIN_VALUE,cNum=0;
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}
			if (sum>rMaxSum) {
				rMaxSum=sum;
				rowNum=i;
			}
		}
		
		for (int j = 0; j < arr[0].length; j++) {
			int sum=0;
			for (int i = 0; i < arr.length; i++) {
				sum+=arr[i][j];
			}
			if (sum>cMaxSum) {
				cMaxSum=sum;
				cNum=j;
			}
		}
		if (rMaxSum>=cMaxSum) {
			System.out.println("row "+rowNum+" "+rMaxSum);
		}else {
			System.out.println("column "+cNum+" "+cMaxSum);
		}
	}
	
	public static void main(String[] args) {
		
		int [][]arr=takeInput();
		printLargestSum(arr);
	}
	
}
