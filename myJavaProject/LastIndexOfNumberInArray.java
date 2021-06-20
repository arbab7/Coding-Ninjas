package myJavaProject;

import java.util.Scanner;

public class LastIndexOfNumberInArray {

	public static int lastIndex(int[] input, int x) {
		if (input.length == 0) {
			return -1;
		}
		int[] smallArray = new int[input.length - 1];
		for (int i = 0; i < smallArray.length; i++) {
			smallArray[i] = input[i + 1];
		}
		int i = lastIndex(smallArray, x);
		if (i != -1) {
			return i + 1;
		}
		if (input[0] == x) {
			return 0;
		}
		return i;
	}
	
	public static int lastindexBetter(int[] input, int x, int si) {
		if (si == input.length) {
			return -1;
		}
		int i = lastindexBetter(input, x, si + 1);
		if (i != -1) {
			return i;
		}
		if (input[si] == x) {
			return si;
		}
		return -1;
	}
	
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
//		System.out.println(lastIndex(input, x));
		System.out.println(lastindexBetter(input, x, 0));
	}

}
