package dynamicProgramming;

import java.util.Scanner;

public class Knapsack {

	public static int knapsack(int[] weight,int value[],int maxWeight, int n){
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */	
		//		return knapsackRecur(weight, value, maxWeight, n, 0);
//		int[][] dp = new int[n + 1][maxWeight + 1];
//
//		return knapsackMemoization(weight, value, maxWeight, n, dp, 0);
		
		int[][] dp = new int[n + 1][maxWeight + 1];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 1; j < maxWeight + 1; j++) {
				int ans1 = 0;
				if (j >= weight[i]) {
					ans1 = value[i] + dp[i + 1][j - weight[i]];
				}
				int ans2 = dp[i + 1][j];
				dp[i][j] = Math.max(ans1, ans2);
			}
		}
		return dp[0][maxWeight];
	}

	public static int knapsackMemoization(int[] weight,int value[],int maxWeight, int n, int[][] dp, int i) {
		if (i == n) {
			return 0;
		}
		if (maxWeight <= 0) {
			return 0;
		}
		
		int ans1 = 0;
		if (weight[i] <= maxWeight) {
			if (dp[i + 1][maxWeight - weight[i]] == 0) {
				dp[i + 1][maxWeight - weight[i]] = knapsackMemoization(weight, value, maxWeight - weight[i], n, dp, i + 1);
			}
			ans1 = value[i] + dp[i + 1][maxWeight - weight[i]];
		}
		
		if (dp[i + 1][maxWeight] == 0) {
			dp[i + 1][maxWeight] = knapsackMemoization(weight, value, maxWeight, n, dp, i + 1);
		}
		int ans2 = dp[i + 1][maxWeight];

		return Math.max(ans1, ans2);
	}

	public static int knapsackRecur(int[] weight, int[] value, int maxWeight, int n, int i) {
		if (i == n) {
			return 0;
		}
		if (maxWeight <= 0) {
			return 0;
		}
		int ans1 = Integer.MIN_VALUE;
		if (maxWeight >= weight[i]) {
			ans1 = value[i] + knapsackRecur(weight, value, maxWeight - weight[i], n, i + 1);
		}
		int ans2 = knapsackRecur(weight, value, maxWeight, n, i + 1);
		return Math.max(ans1, ans2);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int weight[] = new int[n];
		for(int i = 0 ; i < n; i++){
			weight[i] = s.nextInt();
		}
		int value[] = new int[n];
		for(int i = 0 ; i < n; i++){
			value[i] = s.nextInt();
		}
		int maxWeight = s.nextInt();
		System.out.println(knapsack(weight, value, maxWeight, n));		
	}
	
}
