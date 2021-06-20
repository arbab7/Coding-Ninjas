package myJavaProject;

import java.util.Scanner;

public class LinearSearch {
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static int linearSearch(int[] array, int value) {
		int x=-1;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==value) {
				x=i;
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = takeInput();
		int val = s.nextInt();		
		System.out.println(linearSearch(input,val));
	}
}
