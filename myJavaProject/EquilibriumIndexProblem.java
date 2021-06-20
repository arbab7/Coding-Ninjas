package myJavaProject;

import java.util.Scanner;

public class EquilibriumIndexProblem {


	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(ArrayEquilibriumProbClass.arrayEquilibrium(arr));
	}
}