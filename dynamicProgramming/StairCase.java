package dynamicProgramming;

public class StairCase {

	public static long staircase(int n){

        /* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
        if(n <= 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i< dp.length; i++){
            dp[i] = dp[i -1] + dp[i -2] + dp[i - 3];
        }
        return dp[n];

    }
	
}
