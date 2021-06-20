package myJavaProject;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[]arr,int val) {
		int index=-1, s=0,e=arr.length-1;
		while (s<=e) {
			int m=(s+e)/2;
			if (arr[m]>val) {
				e=m-1;
			}else if (arr[m]<val) {
				s=m+1;
			}else if (arr[m]==val) {
				index=m;
				break;
			}

		}
		return index;
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
		// TODO Auto-generated method stub

		int[] arr = takeInput();
		int val = s.nextInt();
		System.out.println(binarySearch(arr, val));

	}
}