package myJavaProject;

import java.util.Scanner;

public class Recursion {
	
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int smallOutput = factorial(n - 1);
		int output = n * smallOutput;
		return output;
	}

	public static int sumOfN(int n) {
		if (n == 1) {
			return 1;
		}
		int smallOutput = sumOfN(n - 1);
		int output = n + smallOutput;
		return output;
	}
	
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int fib1 = fibonacci(n - 1);
		int fib2 = fibonacci(n - 2);
		int output = fib1 + fib2;
		return output;
	}
	
	public static boolean arrayIsSorted(int[] arr) {
		if (arr.length == 1) {
			return true;
		}
		if (arr[0] > arr[1]) {
			return false;
		}
		int[] smallArray = new int[arr.length - 1];
		for (int i = 0; i < smallArray.length; i++) {
			smallArray[i] = arr[i + 1];
		}
		
		boolean output = arrayIsSorted(smallArray);
		return output;
	}
	
	public static boolean arrayIsSortedBetter(int[] arr, int si) {
		if (si == arr.length - 1) {
			return true;
		}
		if (arr[si] > arr[si + 1]) {
			return false;
		}
		return arrayIsSortedBetter(arr, si + 1);
	}
	
	public static String replacePi(String input) {
		if (input.length() <= 1) {
			return input;
		}
		if (input.charAt(0) == 'p' && input.charAt(1) == 'i') {
			String smallString = input.substring(2);
			return "3.14" + replacePi(smallString);
		}
		else {
			String smallString = input.substring(1);
			return input.charAt(0) + replacePi(smallString);
		}
	}
	
	public static int binarySearch(int[] arr, int x, int si, int ei) {
		if (arr.length == 0) {
			return -1;
		}
		if (si > ei) {
			return -1;
		}
		int midIndex = (si + ei) / 2;
		if (arr[midIndex] == x) {
			return midIndex;
		}
		else if (arr[midIndex] < x) {
			return binarySearch(arr, x, midIndex + 1, ei);
		}
		else {
			return binarySearch(arr, x, si, midIndex - 1);
		}
	}
	
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		System.out.println(factorial(n));
//		System.out.println(sumOfN(n));
//		System.out.println(CalculatePower.power(2, n));
//		System.out.println(fibonacci(n));
		int[]array = {2, 7, 8, 14, 19};	
//		System.out.println(arrayIsSorted(array));
//		System.out.println(arrayIsSortedBetter(array, 0));
//		String s = "aupipeepiti";
//		System.out.println(replacePi(s));
		System.out.println(binarySearch(array, 14, 0, array.length - 1));
	}
	
}
