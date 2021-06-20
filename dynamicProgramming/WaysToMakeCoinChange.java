package dynamicProgramming;

import java.util.Scanner;

public class WaysToMakeCoinChange {

	public static int countWaysToMakeChange(int denominations[], int value){

		//		return waysToMakeChangeRec(denominations, value, denominations[denominations.length - 1]);
		//		int[][] dp = new int[value + 1][denominations.length + 1];
		//		int m = denominations.length;
		//		return countWaysMemoization(denominations, dp, value, denominations[m - 1]);

		int[][] dp = new int[value + 1][denominations.length + 1];
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[i].length; j++) {
				int sum = 0;
				for (int k = 0; k < denominations.length && denominations[k] <= denominations[j - 1] && denominations[k] <= i; k++) {
					sum += dp[i - denominations[k]][k];
				}
				dp[i][j] = sum;
			}
		}
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		return dp[value][denominations.length];
	}

	public static int countWaysMemoization(int[] denominations, int[][] dp, int value, int x) {
		if (value == 0) {
			return 1;
		}
		int sum = 0;
		for (int i = 0; i < denominations.length && denominations[i] <= x && denominations[i] <= value; i++) {
			if (dp[value - denominations[i]][i] == 0) {
				dp[value - denominations[i]][i] = countWaysMemoization(denominations, dp, value - denominations[i], denominations[i]);
			}
			sum += dp[value - denominations[i]][i];
		}
		return sum;
	}

	public static int waysToMakeChangeRec(int[] denominations, int value, int x) {

		if (value == 0) {
			return 1;
		}
		int sum = 0;
		for (int i = 0; i < denominations.length && denominations[i] <= x && denominations[i] <= value; i++) {
			sum += waysToMakeChangeRec(denominations, value - denominations[i], denominations[i]);
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numDenominations = s.nextInt();
		int denominations[] = new int[numDenominations];
		for(int i = 0; i < numDenominations; i++){
			denominations[i] = s.nextInt();
		}

		int value = s.nextInt();

		System.out.println(countWaysToMakeChange(denominations, value));

	}

}
