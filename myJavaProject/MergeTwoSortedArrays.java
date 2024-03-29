package myJavaProject;

import java.util.Scanner;


public class MergeTwoSortedArrays {


	public static int[] merge(int arr1[], int arr2[]){
		int m=arr1.length;
		int n=arr2.length;
		int i=0,j=0,k=0;
		int[] arr3=new int[m+n];
		while (i<m&&j<n) {
			if (arr1[i]<=arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				k++;
			}else {
				arr3[k]=arr2[j];
				j++;
				k++;
			}
		}
		while (i<m) {
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while (j<n) {
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		return arr3;

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

		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		int ans[] = merge(arr1, arr2);
		for(int i = 0; i < ans.length; i++){
			System.out.print(ans[i] + " ");
		}
	}

}
