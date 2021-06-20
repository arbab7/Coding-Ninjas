package myJavaProject;

import java.util.Scanner;

public class PrintAllPairs {
	
	public static int[] genArray() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]array=new int[n];
		for (int i = 0; i < n; i++) {
			array[i]=s.nextInt();
		}
		return array;
	}
	
	public static void printPairs(int[]array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				System.out.println("("+array[i]+","+array[j]+")");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr=genArray();
		printPairs(arr);
		
	}

}
