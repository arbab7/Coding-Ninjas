package dynamicProgramming;

public class MinimumStepsTo1UsingDP {

	public static int countStepsTo1(int n){

		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */

//		int[] dp = new int[n + 1];
//		for (int i = 0; i < dp.length; i++) {
//			dp[i] = -1;
//		}
//		return helper(n, dp);
		if (n == 1) {
			return 0;
		}
		int[] dp = new int[n + 1];
		dp[1] = 0;
		for (int i = 2; i < dp.length; i++) {
			int min = 1 + dp[i - 1];
			if (i % 2 == 0) {
				min = Math.min(min, dp[i / 2] + 1);
			}
			if (i % 3 == 0) {
				min = Math.min(min, dp[i / 3] + 1);
			}
			dp[i] = min;
		}
		
		return dp[n];

	}
	

	private static int helper(int n, int[] dp) {
		if (n == 1) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		if (dp[n - 1] == -1) {
			min = 1 + helper(n - 1, dp);
		}else {
			min = 1 + dp[n - 1];
		}
		if (n % 2 == 0) {
			if (dp[n / 2] == -1) {
				int temp = 1 + helper(n / 2, dp);
				min = Math.min(min, temp);
			}else {
				min = Math.min(min, dp[n / 2] + 1);
			}
		}
		if (n % 3 == 0) {
			if (dp[n / 3] == -1) {
				int temp = 1 + helper(n / 3, dp);
				min = Math.min(min, temp);
			}else {
				min = Math.min(min, dp[n / 3] + 1);
			}
		}
		dp[n] = min;
		return min;
	}

}
