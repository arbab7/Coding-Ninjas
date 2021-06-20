package dynamicProgramming;

public class MinimumNumberOfSquares {

	public static int minCount(int n) {
		// Write your code here
        if(n == 0 || n == 1){
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i < dp.length; i++){
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
				int temp = 1 + dp[i- j * j];
				min = Math.min(min, temp);
			}
            dp[i] = min;
        }
        
        return dp[n];

	}
	
}
