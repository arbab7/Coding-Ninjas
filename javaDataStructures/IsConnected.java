package javaDataStructures;

import java.util.*;
import java.util.Queue;

public class IsConnected {

	public static boolean isConnectedDFS(int[][] adjacentMatrix) {
		boolean[] visited = new boolean[adjacentMatrix.length];
		isConDFSHelper(adjacentMatrix, 0, visited);
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == false) {
				return false;
			}
		}
		return true;
	}
	
	private static void isConDFSHelper(int[][] adjacentMatrix, int currentVertex, boolean[] visited) {
		visited[currentVertex] = true;
		for (int i = 0; i < adjacentMatrix.length; i++) {
			if (adjacentMatrix[currentVertex][i] == 1 && visited[i] == false) {
				isConDFSHelper(adjacentMatrix, i, visited);
			}
		}
	}
	
	public static boolean isConnectedBFS(int[][] adjacentMatrix) {
		boolean[] visited = new boolean[adjacentMatrix.length];
		
		Queue<Integer> pendingVertices = new LinkedList<Integer>();
	
		pendingVertices.add(0);
		visited[0] = true;
		
		while (!pendingVertices.isEmpty()) {
			int currentVertex = pendingVertices.poll();
			for (int i = 0; i < adjacentMatrix.length; i++) {
				if (adjacentMatrix[currentVertex][i] == 1 && visited[i] == false) {
					pendingVertices.add(i);
					visited[i] = true;
				}
			}
		}
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == false) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int[][] adjacentMatrix = new int[V][V];
		for (int i = 0; i < E; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			adjacentMatrix[v1][v2] = 1;
			adjacentMatrix[v2][v1] = 1;
		}
		System.out.println(isConnectedDFS(adjacentMatrix));
		System.out.println(isConnectedBFS(adjacentMatrix));
	}
	
}
