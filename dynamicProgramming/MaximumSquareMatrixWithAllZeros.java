package dynamicProgramming;

import java.util.Scanner;

public class MaximumSquareMatrixWithAllZeros {

	public static int findMaxSquareWithAllZeros(int[][] input){

		int m = input.length;
		int n = input[0].length;
		int[][] dp = new int[m + 1][n + 1];
		int max = 0;
		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				int ans1 = dp[i][j + 1];
				int ans2 = dp[i + 1][j + 1];
				int ans3 = dp[i + 1][j];
				if (input[i][j] == 0) {
					dp[i][j] = 1 + Math.min(ans1, Math.min(ans2, ans3));
				}else {
					dp[i][j] = 0;
				}
				if (dp[i][j] > max) {
					max = dp[i][j];
				}
			}
		}
		return max;
		
		
//		int[][] dp = new int [input.length + 1][input[0].length + 1];
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[i].length; j++) {
//				dp[i][j] = -1;
//			}
//		}
//		dp[0][0] = memoization(input, dp, 0, 0);
//		int max = 0;
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[i].length; j++) {
//				if (dp[i][j] > max) {
//					max = dp[i][j];
//				}
//			}
//		}
//		return max;

	}

	public static int memoization(int[][] arr, int[][] dp, int i, int j) {
		if (i == arr.length || j == arr[i].length) {
			return 0;
		}
		if (dp[i][j + 1] == -1) {
			dp[i][j + 1] = memoization(arr, dp, i, j + 1);
		}
		int ans1 = dp[i][j + 1];

		if (dp[i + 1][j + 1] == -1) {
			dp[i + 1][j + 1] = memoization(arr, dp, i + 1, j + 1);
		}
		int ans2 = dp[i + 1][j + 1];

		if (dp[i + 1][j] == -1) {
			dp[i + 1][j] = memoization(arr, dp, i + 1, j);
		}
		int ans3 = dp[i + 1][j];

		if (arr[i][j] == 0) {
			return 1 + Math.min(ans1, Math.min(ans2, ans3));
		}
		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				arr[i][j]=s.nextInt();
		System.out.println(findMaxSquareWithAllZeros(arr));
	}

}
