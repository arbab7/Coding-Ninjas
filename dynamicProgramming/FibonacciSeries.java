package dynamicProgramming;

import java.util.Scanner;

public class FibonacciSeries {

	public static int fibonacciMemoization(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		int n1, n2;
		if (dp[n - 1] == -1) {
			n1 = fibonacciMemoization(n - 1, dp);
			dp[n - 1] = n1;
		}else {
			n1 = dp[n - 1];
		}
		if (dp[n - 2] == -1) {
			n2 = fibonacciMemoization(n - 2, dp);
			dp[n - 2] = n2;
		}else {
			n2 = dp[n - 2];
		}
		return n1 + n2;
	}
	
	public static int fibonacciIterative(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int dp[] = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] dp = new int[n + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i] = -1;
		}
		System.out.println(fibonacciMemoization(n, dp));
		System.out.println(fibonacciIterative(n));
	}
	
}
