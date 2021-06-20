package myJavaProject;

import java.util.Scanner;

public class PrintLikeWave {

	static Scanner s = new Scanner(System.in);
	
	
	public static int[][] takeInput2D(){
		
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static void wavePrint(int[][]input) {
		int n=input.length;
		if (n==0) {
			return;
		}
		int m=input[0].length;
		
		for (int i = 0; i < m; i++) {
			if (i%2==0) {
				for (int j = 0; j < n; j++) {
					System.out.print(input[j][i]+" ");
				}
			}else {
				for (int j = n-1; j >=0; j--) {
					System.out.print(input[j][i]+" ");
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
	
		int input[][] = takeInput2D();
		wavePrint(input);
		
	}

}


