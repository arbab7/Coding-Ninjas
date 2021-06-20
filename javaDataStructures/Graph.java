package javaDataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {

	public static void depthfirstTraversal(int[][] adjacencyMatrix) {
		boolean[] visited = new boolean[adjacencyMatrix.length];
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == false) {
				depthFirstTravHelper(adjacencyMatrix, i, visited);
			}
		}
		System.out.println();
	}

	public static void depthFirstTravHelper(int[][] adjacencyMatrix, int currentVertex, boolean[] visited) {
		visited[currentVertex] = true;
		System.out.print(currentVertex + " ");
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			if (adjacencyMatrix[currentVertex][i] == 1 && visited[i] == false) {
				depthFirstTravHelper(adjacencyMatrix, i, visited);
			}
		}
	}

	public static void breadthFirstTraversal(int[][] adjacencyMatrix) {
		Queue<Integer> pendingVertices = new LinkedList<Integer>();
		boolean[] visited = new boolean[adjacencyMatrix.length];
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == false) {
				pendingVertices.add(i);
				visited[i] = true;
				while (!pendingVertices.isEmpty()) {
					int currentVertex = pendingVertices.poll();
					System.out.print(currentVertex + " ");
					for (int j = 0; j < visited.length; j++) {
						if (adjacencyMatrix[currentVertex][j] == 1 && visited[j] == false) {
							pendingVertices.add(j);
							visited[j] = true;
						}

					}
				}				
			}
		}

		System.out.println();
	}

	public static int[][] createAdjMatrixGraph() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		int[][] adjacencyMatrix = new int[n][n];
		for (int i = 0; i < e; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			adjacencyMatrix[v1][v2] = 1;
			adjacencyMatrix[v2][v1] = 1;
		}
		return adjacencyMatrix;
	}

	public static void main(String[] args) {
		int[][] adjacencyMatrix = createAdjMatrixGraph();
		depthfirstTraversal(adjacencyMatrix);
		breadthFirstTraversal(adjacencyMatrix);
	}

}
