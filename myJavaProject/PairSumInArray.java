package myJavaProject;

import java.util.Arrays;

public class PairSumInArray {
	public static void pairSum(int[] arr, int num){
		/* Your class should be named PairSum
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
		 * Taking input is handled automatically.
		 */
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int j= i;
			while (j < arr.length && arr[i] + arr[j] <= num) {
				if (arr[i] + arr[j] == num) {
					System.out.println(arr[i] + " " + arr[j]);
				}
				j++;
			}
		}
	}
}
