package javaDataStructures;

import java.util.Scanner;

public class LargestPiece {

	public int solve(int n,String cake[]) {
        boolean[][] visited = new boolean[n][n];
        int largestPiece = 0;
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (cake[i].charAt(j) == '1' && visited[i][j] == false) {
					int temp = helper(n, cake, visited, i, j);
					if (temp > largestPiece) {
						largestPiece = temp;
					}
				}
			}
		}
        return largestPiece;
    }
	
	public static int helper(int n, String[] cake, boolean[][] visited, int i, int j) {
		if (i < 0 || j < 0 || i == n || j == n) {
			return 0;
		}
		if (cake[i].charAt(j) == '0' || visited[i][j] == true) {
			return 0;
		}
		visited[i][j] = true;
		int output = 1;
		output += helper(n, cake, visited, i + 1, j);
		output += helper(n, cake, visited, i - 1, j);
		output += helper(n, cake, visited, i, j + 1);
		output += helper(n, cake, visited, i, j - 1);
		return output;
	}
	
	public static String[]cake=new String [55];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<n;i++)
		{
			cake[i]=scan.nextLine();
		}
		System.out.println(new LargestPiece().solve(n,cake));
	}
}
