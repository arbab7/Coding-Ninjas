package myJavaProject;

import java.util.Arrays;

public class DuplicateInArrayClass {

	public static int duplicate(int[] arr) {
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i + 1]) {
				return arr[i];
			}
		}
		return Integer.MIN_VALUE;
	}
	
}
