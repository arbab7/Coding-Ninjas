package dynamicProgramming;

public class LCSProblem {

	public static int lcs(String s1, String s2){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 */

		int[][] dp = new int[s1.length()][s2.length()];
		if (s1.charAt(0) == s2.charAt(0)) {
			dp[0][0] = 1;
		}else {
			dp[0][0] = 0;
		}
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (i == 0 && j == 0) {
					continue;
				}
				int num1 = 0, num2 = 0, num3 = 0;
				if (j - 1 >= 0) {
					num1 = dp[i][j - 1];
				}
				if (i - 1 >= 0) {
					num2 = dp[i - 1][j];
				}
				if (i - 1 >=0 && j - 1 >= 0) {
					num3 = dp[i - 1][j - 1];
				}
				if (s1.charAt(i) == s2.charAt(j)) {
					dp[i][j] = 1 + num3;
				}else {
					dp[i][j] = Math.max(num1, num2);
				}
			}
		}
		return dp[s1.length() - 1][s2.length() - 1];
		
	}

}
