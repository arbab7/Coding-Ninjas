package dynamicProgramming;

public class MinimumStepsTo1 {

	public static int countStepsTo1(int n){

		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */

		if (n == 1) {
			return 0;
		}
		int minimum = countStepsTo1(n - 1);
		if (n % 2 == 0) {
			minimum = Math.min(minimum, countStepsTo1(n / 2));
		}
		if (n % 3 == 0) {
			minimum = Math.min(minimum, countStepsTo1(n / 3));
		}
		return 1 + minimum;
	}

}
