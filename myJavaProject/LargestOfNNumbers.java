package myJavaProject;

import java.util.Scanner;

public class LargestOfNNumbers {

	public static int[] takeinput() {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] array=new int[N];
		for (int i = 0; i <N; i++) {
			System.out.println("Enter element at index position "+i);
			array[i]=s.nextInt();
		}
		return array;
	}
	
	public static int largestNum(int[] array) {
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr=takeinput();
		System.out.println(largestNum(arr));
	}

}
