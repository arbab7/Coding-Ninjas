package javaDataStructures;

import java.util.*;

public class CodingNinjas {

	int solve(String[] graph , int N, int M)
	{
		String s = "CODINGNINJA";
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (graph[i].charAt(j) == 'C') {
					boolean[][] visited = new boolean[N][M];
					boolean ans = helper(graph, N, M, i, j, visited, s, 0);
					if (ans) {
						return 1;
					}
				}
			}
		}
		return 0;
	}	

	public static boolean helper(String[] graph, int N, int M, int i, int j, boolean[][] visited, String s, int k) {
		if (i < 0 || j < 0 || i == N || j == M) {
			return false;
		}
		if (graph[i].charAt(j) != s.charAt(k) || visited[i][j]) {
			return false;
		}
		if (k == 10) {
			return true;
		}
		visited[i][j] = true;
		boolean ans1 = helper(graph, N, M, i - 1, j, visited, s, k + 1);
		boolean ans2 = helper(graph, N, M, i - 1, j + 1, visited, s, k + 1);
		boolean ans3 = helper(graph, N, M, i, j + 1, visited, s, k + 1);
		boolean ans4 = helper(graph, N, M, i + 1, j + 1, visited, s, k + 1);
		boolean ans5 = helper(graph, N, M, i + 1, j, visited, s, k + 1);
		boolean ans6 = helper(graph, N, M, i + 1, j - 1, visited, s, k + 1);
		boolean ans7 = helper(graph, N, M, i, j - 1, visited, s, k + 1);
		boolean ans8 = helper(graph, N, M, i - 1, j - 1, visited, s, k + 1);
		visited[i][j] = false;
		return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N,M,i;

		N = scan.nextInt();
		M = scan.nextInt();

		String[] Graph = new String[N];

		for(i = 0; i < N; i++){

			Graph[i] = scan.next();

		}
		System.out.println(new CodingNinjas().solve(Graph,N,M));

	}

}
