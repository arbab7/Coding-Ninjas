package myJavaProject;

import java.util.Scanner; 

public class FirstIndexOfANumberInArray {

	public static int firstIndexOfNumberInArray(int[] input, int x) {
		if (input.length == 0) {
			return -1;
		}
		if (input[0] == x) {
			return 0;
		}
		int[] smallArray = new int[input.length - 1];
		for (int i = 0; i < smallArray.length; i++) {
			smallArray[i] =input[i + 1];
		}
		int i = firstIndexOfNumberInArray(smallArray, x);
		if (i == -1) {
			return -1;
		}else {
			return i + 1;
		}
	}

	public static int firstIndexOfNumberInArray(int[] arr, int x, int si) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == x) {
			return si;
		}
		return firstIndexOfNumberInArray(arr, x, si + 1);
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
		System.out.println(firstIndexOfNumberInArray(input, x));
	}


}
