package myJavaProject;

import java.util.Scanner;
import java.util.Arrays;

public class MaximumProfitOnApp {

	public static int maximumProfit(int budget[]) {

		// Write your code here
		Arrays.sort(budget);
//		int output = Integer.MIN_VALUE;
//		int n = budget.length;
//
//		for(int i = 0; i < n; i++)
//		{
//			output = Math.max(output, budget [i] * (n - i));
//		}
//		return output;
		
		if (budget.length == 0) {
			return 0;
		}
		if (budget.length == 1) {
			return budget[0];
		}
		int[] smallArray = new int[budget.length - 1];
		for (int i = 0; i < smallArray.length; i++) {
			smallArray[i] = budget[i + 1];
		}
		int maxProfit = maximumProfit(smallArray);
		if (budget[0] <= budget[1]) {
			if (budget[0] * budget.length >= maxProfit) {
				return budget[0] * budget.length;
			}
		}
		return maxProfit;
		
		
	}



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();

		System.out.println(maximumProfit(input));
	}

}
