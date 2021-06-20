package myJavaProject;

import java.util.Scanner;

public class SplitArray {

	public static boolean split(int arr[], int n, int start, int leftSum, int rightSum) 
	{ 
 
		if (start == n) 
			return leftSum == rightSum; 
 
		if (arr[start] % 5 == 0) 
			leftSum += arr[start]; 

		else if (arr[start] % 3 == 0) 
			rightSum += arr[start]; 

		else

			return split(arr, n, start + 1, leftSum + arr[start], rightSum)  || split(arr, n, start + 1, leftSum, rightSum + arr[start]); 

		return split(arr, n, start + 1, leftSum, rightSum); 
	} 



	public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		return split(input, input.length, 0, 0, 0); 

	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(splitArray(input));
	}

}
