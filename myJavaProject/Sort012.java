package myJavaProject;

import java.util.Scanner;

public class Sort012 {

    public static void sort012(int[] arr){
    	int z=0, t=0;
    	for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				z++;
			}else if (arr[i]==2) {
				t++;
			}
		}
    	int i;
    	for (i = 0; i < z; i++) {
			arr[i]=0;
		}
    	
    	while (i<arr.length-t) {
			arr[i]=1;
			i++;
		}
    	while (i<arr.length) {
			arr[i]=2;
			i++;
		}
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


	public static void printArray(int[] arr) {
		for (int elem : arr) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = takeInput();

		sort012(arr);
		printArray(arr);
	}
}