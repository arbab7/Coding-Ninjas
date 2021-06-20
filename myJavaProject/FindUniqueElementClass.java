package myJavaProject;

import java.util.Arrays;

public class FindUniqueElementClass {
	public static int findUnique(int[] arr){
		/* Your class should be named FindUnique
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length-1; i += 2) {
			if (arr[i] != arr[i+1]) {
				return arr[i];
			}
		}
		return arr[arr.length-1];
	}

}
