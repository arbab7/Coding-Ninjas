package myJavaProject;

import java.util.Scanner;

public class SwapAlternate {

	static Scanner s = new Scanner(System.in);
	
	private static void swapAlternate(int[]array) {
		for (int i = 0; i < array.length/2; i++) {
			int c=array[2*i];
			array[2*i]=array[2*i+1];
			array[2*i+1]=c;
		}
	}
	
	private static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = takeInput();
		swapAlternate(input);
		printArray(input);
	}
}