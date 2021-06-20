package javaDataStructures;

import java.util.*;

public class PrimAlgorithm {
	
	public static void prim(int[][] adjacencyMatrix) {
		int[] parent = new int[adjacencyMatrix.length];
		int[] weight = new int[adjacencyMatrix.length];
		boolean[] visited = new boolean[adjacencyMatrix.length];
		parent[0] = -1;
		weight[0] = 0;
		for (int i = 1; i < weight.length; i++) {
			weight[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < visited.length - 1; i++) {
			int minVertex = minVertex(visited, weight);
			visited[minVertex] = true;
			for (int j = 0; j < visited.length; j++) {
				if (visited[j] == false && adjacencyMatrix[minVertex][j] > 0 && weight[j] > adjacencyMatrix[minVertex][j]) {
					weight[j] = adjacencyMatrix[minVertex][j];
					parent[j] = minVertex;
				}
			}
		}
		for (int i = 1; i < visited.length; i++) {
			System.out.println(Math.min(parent[i], i) + " " + Math.max(parent[i], i) + " " + weight[i]);
		}
	}
	
	public static int minVertex(boolean[] visited, int[] weight) {
		int minVertex = -1;
		int minWeight = Integer.MAX_VALUE;
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == false && weight[i] < minWeight ) {
				minVertex = i;
				minWeight = weight[i];
				if (i == 0) {
					break;
				}
			}
		}
		return minVertex;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int[][] adjacencyMatrix = new int[V][V];
		for (int i = 0; i < E; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int w = s.nextInt();
			adjacencyMatrix[v1][v2] = w;
			adjacencyMatrix[v2][v1] = w;
		}
		prim(adjacencyMatrix);
		
	}
}
