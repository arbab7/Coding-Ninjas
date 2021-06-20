package myJavaProject;

import java.util.Scanner;

public class QuickSort {

	static Scanner s = new Scanner(System.in);

	public static void quickSort(int[] input) {
		if (input.length <= 1) {
			return;
		}
		int pivotelement = input[0];
		int count = 0;
		for (int i = 1; i < input.length; i++) {
			if (input[i] < pivotelement) {
				count++;
			}
		}
		input[0] = input[count];
		input[count] = pivotelement;

		int si = 0;
		int se = input.length - 1;
		while (si < se) {
			if (input[si] < pivotelement) {
				si++;
			}
			else if (input[se] >= pivotelement ) {
				se--;
			}else {
				int temp = input[si];
				input[si] = input[se];
				input[se] = temp;
				si++;
				se--;
			}
		}
		
		int[] smallArray1 = new int[count];
		for (int i = 0; i < smallArray1.length; i++) {
			smallArray1[i] = input[i];
		}
		int[] smallArray2 = new int[input.length - 1 - count];
		for (int i = 0; i < smallArray2.length; i++) {
			smallArray2[i] = input[count + 1 + i];
		}
		quickSort(smallArray1);
		quickSort(smallArray2);
		for (int i = 0; i < smallArray1.length; i++) {
			input[i] = smallArray1[i];
		}
		for (int i = 0; i < smallArray2.length; i++) {
			input[count + 1 + i] = smallArray2[i];
		}
	}

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
		quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
