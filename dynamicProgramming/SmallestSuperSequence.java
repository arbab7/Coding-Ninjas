package dynamicProgramming;

public class SmallestSuperSequence {

	public static int smallestSuperSequence(String str1, String str2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input. Input is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
//		int[][] dp = new int[str1.length() + 1][str2.length() + 1];
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[i].length; j++) {
//				dp[i][j] = -1;
//			}
//		}
//		return smallestSuperSequenceMemoization(dp, str1, str2, 0, 0);
		
		if (str1.length() == 0) {
			return str2.length();
		}
		if (str2.length() == 0) {
			return str1.length();
		}
		int m = str1.length();
		int n = str2.length();
		int[][] dp = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			dp[i][n] = m - i;
		}
		for (int i = 0; i <= n; i++) {
			dp[m][i] = n - i;
		}
		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (str1.charAt(i) == str2.charAt(j)) {
					dp[i][j] = 1 + dp[i + 1][j + 1];
				}else {
					int ans1 = dp[i + 1][j];
					int ans2 = dp[i][j + 1];
					dp[i][j] = 1 + Math.min(ans1, ans2);
				}
			}
		}
		return dp[0][0];
	}
	
	public static int smallestSuperSequenceMemoization(int[][] dp, String str1, String str2, int i, int j) {
		if (i == str1.length()) {
			return str2.length() - j;
		}
		if (j == str2.length()) {
			return str1.length() - i;
		}
		if (str1.charAt(i) == str2.charAt(j)) {
			if (dp[i + 1][j + 1] == -1) {
				dp[i + 1][j + 1] = smallestSuperSequenceMemoization(dp, str1, str2, i + 1, j + 1);
			}
			return 1 + dp[i + 1][j + 1];
		}
		int ans1 = Integer.MAX_VALUE;
		int ans2 = Integer.MAX_VALUE;
		if (dp[i + 1][j] == -1) {
			dp[i + 1][j] = smallestSuperSequenceMemoization(dp, str1, str2, i + 1, j);
		}
		ans1 = dp[i + 1][j];
		if (dp[i][j + 1] == -1) {
			dp[i][j + 1] = smallestSuperSequenceMemoization(dp, str1, str2, i, j + 1);
		}
		ans2 = dp[i][j + 1];
		return 1 + Math.min(ans1, ans2);
	}
	
	public static int smallestSuperSequenceRec(String str1, String str2) {
		
		if (str1.length() == 0) {
			return str2.length();
		}
		if (str2.length() == 0) {
			return str1.length();
		}
		if (str1.charAt(0) == str2.charAt(0)) {
			return 1 + smallestSuperSequenceRec(str1.substring(1), str2.substring(1));
		}
		int ans1 = 1 + smallestSuperSequenceRec(str1.substring(1), str2);
		int ans2 = 1 + smallestSuperSequenceRec(str1, str2.substring(1));
		return Math.min(ans1, ans2);
		
	}
	
}
