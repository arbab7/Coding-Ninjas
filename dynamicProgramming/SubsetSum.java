package dynamicProgramming;

import java.util.Scanner;

public class SubsetSum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int k = s.nextInt();
//		int[][] dp = new int[n + 1][k + 1];
//		int output = memoization(n, arr, dp, k, 0);
//		if (output == 1) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
		
		boolean[][] dp = new boolean[n + 1][k + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = true;
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 1; j < k + 1; j++) {
				boolean ans1 = false;
				if (arr[i] <= j) {
					ans1 = dp[i + 1][j - arr[i]];
				}
				boolean ans2 = dp[i + 1][j];
				dp[i][j] = ans1 || ans2;
			}
		}
		if (dp[0][k]) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	public static int memoization(int n, int[] arr, int[][] dp, int k, int i) {
		if (k == 0) {
			return 1;
		}
		if (k < 0 || i == n) {
			return -1;
		}
		int ans1 = -1 ;
		if (k >= arr[i] && dp[i + 1][k - arr[i]] == 0) {
			dp[i + 1][k - arr[i]] = memoization(n, arr, dp, k - arr[i], i + 1);
			ans1 = dp[i + 1][k - arr[i]];
		}
		if (dp[i + 1][k] == 0) {
			dp[i + 1][k] = memoization(n, arr, dp, k, i + 1);
		}
		int ans2 = dp[i + 1][k];
		if (ans1 == 1 || ans2 == 1) {
			return 1;
		}
		return -1;
	}

	public static boolean rec(int n, int[] arr, int k, int i) {
		if (k == 0) {
			return true;
		}
		if (k < 0 || i == n) {
			return false;
		}
		boolean ans1 = rec(n, arr, k - arr[i], i + 1);
		boolean ans2 = rec(n, arr, k, i + 1);
		return ans1 || ans2;
	}

}
