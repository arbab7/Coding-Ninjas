package myJavaProject;

import java.util.Scanner;

public class SecondLargestNumber {
	

    public static int secondLargestElement(int[] arr) {
        int secMax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
			if (arr[i]>=max) {
				max=arr[i];
			}
		}
        for (int i = 0; i < arr.length; i++) {
			if (arr[i]>=secMax&&arr[i]<max) {
				secMax=arr[i];
			}
		}
        return secMax;
        
    }


	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();

		System.out.println(secondLargestElement(arr));
	}
}