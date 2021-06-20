package javaDataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPathDFS {

	public static ArrayList<Integer> getPathDFS(int[][] adjacencyMatrix, int v1, int v2, boolean[] visited) {
		if (v1 == v2) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(v2);
			return output;
		}
		visited[v1] = true;
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			if (adjacencyMatrix[v1][i] == 1 && visited[i] == false) {
				output = getPathDFS(adjacencyMatrix, i, v2, visited);
				if (!output.isEmpty()) {
					output.add(v1);
					return output;
				}
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int[][] adjacencyMatrix = new int[V][V];
		for (int i = 0; i < E; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			adjacencyMatrix[v1][v2] = 1;
			adjacencyMatrix[v2][v1] = 1;
		}
		int v1 = s.nextInt();
		int v2 = s.nextInt();
		boolean[] visited = new boolean[adjacencyMatrix.length];
		ArrayList<Integer> outout = getPathDFS(adjacencyMatrix, v1, v2, visited);
		for (Integer i : outout) {
			System.out.print(i + " ");
		}
	}
}
