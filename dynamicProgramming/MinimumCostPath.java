package dynamicProgramming;

public class MinimumCostPath {

	public static int minCostPath(int input[][]) {
		if (input.length == 1 && input[0].length == 1) {
			return input[0][0];
		}
		int[][] dp = new int[input.length][];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = new int[input[i].length];
		}
		
		for (int i = dp.length - 1; i >= 0; i--) {
			for (int j = dp[i].length - 1; j >= 0; j--) {
				if (i == dp.length - 1 && j == dp[i].length - 1) {
					dp[i][j] = input[i][j];
					continue;
				}
				int num1 = Integer.MAX_VALUE, num2 = Integer.MAX_VALUE, num3 = Integer.MAX_VALUE;
				if (j + 1 < dp[i].length) {
					num1 = dp[i][j + 1];
				}
				if (i + 1 < dp.length) {
					num2 = dp[i + 1][j];
				}
				if (i + 1 < dp.length && j + 1 < dp[i].length) {
					num3 = dp[i + 1][j + 1];
				}
				dp[i][j] = input[i][j] + Math.min(num1, Math.min(num2, num3));
			}
		}
		return dp[0][0];
	}
	
}
