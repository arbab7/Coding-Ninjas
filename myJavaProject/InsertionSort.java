package myJavaProject;
import java.util.Scanner;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int n=arr.length;
		for (int i = 1; i < arr.length; i++) {
			int j=i;
			while (j-1>=0 && arr[j]<arr[j-1]) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		} 
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


	public static void printArray(int[] arr) {

		for(int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = takeInput();

		insertionSort(arr);
		printArray(arr);

	}
}