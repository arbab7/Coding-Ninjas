package dynamicProgramming;

public class LootHouses {

	public static int getMaxMoney(int arr[], int n){

		/*Your class should be named Solution.
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/

		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return arr[0];
		}
		if (n == 2) {
			return Math.max(arr[0], arr[1]);
		}
		int[] dp = new int[n];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
		}
		return dp[n - 1];
	}
	
}
