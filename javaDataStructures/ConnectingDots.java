package javaDataStructures;

import java.util.*;

public class ConnectingDots {

	final static int[][]adjacent = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
	
	int solve(String[] board , int n, int m)
	{
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				boolean[][] visited = new boolean[n][m];
				if (helper(board, n, m, board[i].charAt(j), visited, i, j, i, j, 0)) {
					return 1;
				}
			}
		}
		return 0;
	}	
	
	public static boolean helper(String[] board, int n, int m, char c, boolean[][] visited, int startI, int startJ, int i, int j, int count) {
		if (i < 0 || j < 0 || i == n || j == m) {
			return false;
		}
		if (i == startI && j == startJ && count > 3) {
			return true;
		}
		if (board[i].charAt(j) != c || visited[i][j]) {
			return false;
		}
		visited[i][j] = true;
		for (int k = 0; k < 4; k++) {
			int x = i + adjacent[k][0];
			int y = j + adjacent[k][1];
			if (helper(board, n, m, c, visited, startI, startJ, x, y, count + 1)) {
				return true;
			}
		}
		visited[i][j] = false;
		return false;
	}
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N,M,i;
		
		N = scan.nextInt();
		M = scan.nextInt();
		
		String[] board = new String[N];
		
		for(i = 0; i < N; i++){
			
			board[i] = scan.next();
			
		}
		System.out.println(new ConnectingDots().solve(board,N,M));

	}
	
}
