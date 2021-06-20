package dynamicProgramming;

public class EditDistance {

//	public static int editDistanceRecursive(String s1, String s2){
//
//		/* Your class should be named Solution
//		 * Don't write main().
//		 * Don't read input, it is passed as function argument.
//		 * Return output and don't print it.
//		 */
//		if(s1.length() == 0){
//			return s2.length();
//		}
//		if(s2.length() == 0){
//			return s1.length();
//		}
//		if (s1.charAt(0) == s2.charAt(0)){
//			return editDistanceRecursive(s1.substring(1), s2.substring(1));
//		}
//		int num1 = 1 + editDistanceRecursive( s1, s2.substring(1));
//		int num2 = 1 + editDistanceRecursive(s1.substring(1), s2);
//		int num3 = 1 + editDistanceRecursive(s1.substring(1), s2.substring(1));
//		return Math.min(num1, Math.min(num2, num3));
//	}

//	public static int editDistance(String s1, String s2) {
//		int[][] dp = new int[s1.length()][s2.length()];
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[i].length; j++) {
//				dp[i][j] = Integer.MAX_VALUE;
//			}
//		}
//		return editDistanceMemoization(s1, s2, dp, 0, 0);
//	}
//
//	public static int editDistanceMemoization(String s1, String s2, int[][] dp, int i, int j) {
//		if (i == s1.length()) {
//			return s2.length() - j;
//		}
//		if (j == s2.length()) {
//			return s1.length() - i;
//		}
//		if (dp[i][j] != Integer.MAX_VALUE) {
//			return dp[i][j];
//		}
//		if (s1.charAt(i) == s2.charAt(j)) {
//			dp[i][j] = editDistanceMemoization(s1, s2, dp, i + 1, j + 1);
//		}else {
//			int num1 = 1 + editDistanceMemoization(s1, s2, dp, i + 1, j);
//			int num2 = 1 + editDistanceMemoization(s1, s2, dp, i, j + 1);
//			int num3 = 1 + editDistanceMemoization(s1, s2, dp, i + 1, j + 1);
//			dp[i][j] = Math.min(num1, Math.min(num2, num3));
//		}
//		return dp[i][j];
//	}

	public static int editDistance(String s1, String s2) {
		if (s1.length() == 0) {
			return s2.length();
		}
		if (s2.length() == 0) {
			return s1.length();
		}
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m + 1][n + 1];
		if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
			dp[m - 1][n - 1] = 0;
		}else {
			dp[m - 1][n - 1] = 1;
		}
		for (int i = 0; i < n + 1; i++) {
			dp[m][i] = n - i;
		}
		for (int i = 0; i < m + 1; i++) {
			dp[i][n] = m - i;
		}
		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (i == m - 1 && j == n - 1) {
					continue;
				}
				if (s1.charAt(i) == s2.charAt(j)) {
					dp[i][j] = dp[i + 1][j + 1];
				}
				else {
					dp[i][j] = 1 + Math.min(dp[i][j + 1], Math.min(dp[i + 1][j], dp[i + 1][j + 1]));
				}
			}		
		}
		return dp[0][0];
	}
}
