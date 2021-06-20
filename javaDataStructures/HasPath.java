package javaDataStructures;

import java.util.*;
import java.util.Queue;

public class HasPath {

	public static boolean hasPathDFT(int[][] adjacencyMatrix, int v1, int v2) {
		boolean[] visited = new boolean[adjacencyMatrix.length];
		return hasPathDFTHelper(adjacencyMatrix, v1, v2, visited);
	}
	
	private static boolean hasPathDFTHelper(int[][] adjacencyMatrix, int i, int v2, boolean[] visited) {
		if (adjacencyMatrix[i][v2] == 1) {
			return true;
		}
		visited[i] = true;
		for (int j = 0; j < adjacencyMatrix.length; j++) {
			if (adjacencyMatrix[i][j] == 1 && visited[j] == false) {
				if (hasPathDFTHelper(adjacencyMatrix, j, v2, visited)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean hasPathBFT(int[][] adjacencyMatrix, int v1, int v2) {
		boolean[] visited = new boolean[adjacencyMatrix.length];
		
		Queue<Integer> pendingVertices = new LinkedList<Integer>();
		pendingVertices.add(v1);
		visited[v1] = true;
		
		while (!pendingVertices.isEmpty()) {
			int currentVertex = pendingVertices.poll();
			if (adjacencyMatrix[currentVertex][v2] == 1) {
				return true;
			}
			for (int i = 0; i < adjacencyMatrix.length; i++) {
				if (adjacencyMatrix[currentVertex][i] == 1 && visited[i] == false) {
					pendingVertices.add(i);
					visited[i] = true;
				}
			}
		}
		return false;
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
		System.out.println(hasPathDFT(adjacencyMatrix, v1, v2));
		System.out.println(hasPathBFT(adjacencyMatrix, v1, v2));
	}
	
}
