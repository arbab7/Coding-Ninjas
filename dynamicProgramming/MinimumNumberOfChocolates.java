package dynamicProgramming;

import java.util.Scanner;

public class MinimumNumberOfChocolates {
	
	static int minSum = Integer.MAX_VALUE;
	
	public static int getMin(int arr[], int N){

//		rec(arr, N, 0, 0);
//		return minSum;
		int[] dp = new int[N];
		dp[0] = 1;
		for (int i = 1; i < dp.length; i++) {
			if (arr[i] > arr[i - 1]) {
				dp[i] = 1 + dp[i - 1];
			}else {
				dp[i] = 1;
			}
		}
		int minNum = dp[N - 1];
		for (int i = N - 2; i >= 0; i--) {
			if (arr[i] > arr[i + 1] && dp[i] <= dp[i + 1]) {
				dp[i] = 1 + dp[i + 1];
			}
			minNum += dp[i];
		}
		return minNum;
	}

	public static int rec(int[] arr, int N, int i, int value) {
		if (i == N) {
			return 0;
		}
		int ans;
		if (i > 0 && arr[i] > arr[i - 1]) {
			ans = value + 1;
		}else {
			ans = 1;
		}
		if (i == N - 1) {
			minSum = ans;
			return ans;
		}
		int temp = rec(arr, N, i + 1, ans);
		if (arr[i] > arr[i + 1] && ans <= temp) {
			minSum += temp + 1;
			return temp + 1;
		}
		minSum += ans;
		return ans;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		System.out.println(getMin(arr, N));
	}
}
