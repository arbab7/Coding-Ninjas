package myJavaProject;

import java.util.Scanner;

public class LeadersInArray {

	public static void leaders(int[] input) {
		int n=input.length;
		for (int i = 0; i < input.length; i++) {
			boolean g=true;
			for (int j = i; j < input.length; j++) {
				if (input[i]<input[j]) {
					g=false;
					i=j-1;
					break;
				}
			}
			if (g) {
				System.out.print(input[i]+" ");
			}

		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = s.nextInt();
		}
		leaders(input);		
	}

}
