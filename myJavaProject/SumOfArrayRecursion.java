package myJavaProject;

import java.util.Scanner;

public class SumOfArrayRecursion {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
	
		if (input.length == 1) {
			return input[0];
		}
		int element = input[0];
		
		int[] smallArray = new int[input.length - 1];
		for (int i = 0; i < smallArray.length; i++) {
			smallArray[i] = input[i + 1];
		}
		int output = element + sum(smallArray);
		return output;
		
	}
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(sum(input));
	}
}
