package dynamicProgramming;

import java.util.Scanner;

public class MagicGrid {

	public static int rec(int[][] magrid, int i, int j) {
		if (i == magrid.length || j == magrid[i].length) {
			return Integer.MAX_VALUE;
		}
		if (i == magrid.length - 1 && j == magrid[i].length - 1) {
			return 1;
		}
		int ans1 = rec(magrid, i, j + 1);
		int ans2 = rec(magrid, i + 1, j);
		int output = Math.min(ans1, ans2) - magrid[i][j];
		if (output < 1) {
			return 1;
		}
		return output;
	}
	
	public static int memoization(int[][] magrid, int[][] dp, int i, int j) {
		if (i == magrid.length || j == magrid[i].length) {
			return Integer.MAX_VALUE;
		}
		if (i == magrid.length - 1 && j == magrid[i].length - 1) {
			return 1;
		}
		if (dp[i][j + 1] == 0) {
			dp[i][j + 1] = memoization(magrid, dp, i, j + 1);
		}
		int ans1 = dp[i][j + 1];
		if (dp[i + 1][j] == 0) {
			dp[i + 1][j] = memoization(magrid, dp, i + 1, j);
		}
		int ans2 = dp[i + 1][j];
		int output = Math.min(ans1, ans2) - magrid[i][j];
		if (output < 1) {
			return 1;
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int r = s.nextInt();
			int c = s.nextInt();
			int[][] magrid = new int[r][c];
	
			for (int j = 0; j < r; j++) {
				for (int j2 = 0; j2 < c; j2++) {
					magrid[j][j2] = s.nextInt();
				}
			}
			int[][] dp = new int[r + 1][c + 1];
			dp[r - 1][c - 1] = 1;
			for (int j = 0; j < dp.length; j++) {
				dp[j][c] = Integer.MAX_VALUE;
			}
			for (int j = 0; j < dp[i].length; j++) {
				dp[r][j] = Integer.MAX_VALUE;
			}
			
			for (int j = r - 1; j >= 0; j--) {
				for (int k = c - 1; k >= 0; k--) {
					if (j == r - 1 && k == c - 1) {
						continue;
					}
					int ans1 = dp[j][k + 1];
					int ans2 = dp[j + 1][k];
					int temp = Math.min(ans1, ans2) - magrid[j][k];
					if (temp < 1) {
						dp[j][k] = 1;
					}else {
						dp[j][k] = temp;
					}
				}
			}
			if (dp[0][0] < 1) {
				System.out.println(1);
			}else {
				System.out.println(dp[0][0]);
			}
		}
	}
	
}
