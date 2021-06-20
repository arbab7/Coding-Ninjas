package javaDataStructures;

import java.util.*;

public class DijkstraAlgorithm {

	public static void dijsktra(int[][] adjacencyMatrix) {
		boolean visited[] = new boolean[adjacencyMatrix.length];
		int weight[] = new int[adjacencyMatrix.length];
		for (int i = 1; i < weight.length; i++) {
			weight[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < visited.length; i++) {
			int minVertex = minVertex(visited, weight);
			visited[minVertex] = true;
			for (int j = 0; j < visited.length; j++) {
				if (visited[j] == false && adjacencyMatrix[minVertex][j] > 0) {
					int temp = weight[minVertex] + adjacencyMatrix[minVertex][j];
					if (temp < weight[j]) {
						weight[j] = temp;
					}
				}
			}
		}
		for (int i = 0; i < weight.length; i++) {
			System.out.println(i + " " + weight[i]);
		}
	}
	
	public static int minVertex(boolean[] visited, int[] weight) {
		int minVertex = -1;
		int minWeight = Integer.MAX_VALUE;
		for (int i = 0; i < weight.length; i++) {
			if (visited[i] == false && weight[i] < minWeight) {
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
			int weight = s.nextInt();
			adjacencyMatrix[v1][v2] = weight;
			adjacencyMatrix[v2][v1] = weight;
		}
		dijsktra(adjacencyMatrix);
	}
	
}
