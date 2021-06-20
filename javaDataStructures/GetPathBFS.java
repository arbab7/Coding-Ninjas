package javaDataStructures;

import java.util.*;
import java.util.Queue;

public class GetPathBFS {

	public static void getPathBFS(int[][] adjacencyMatrix, int v1, int v2) {
		Queue<Integer> pendingvertices = new LinkedList<Integer>();
		boolean[] visited = new boolean[adjacencyMatrix.length];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		pendingvertices.add(v1);
		visited[v1] = true;
		
		while (!pendingvertices.isEmpty()) {
			int currentVertex = pendingvertices.poll();
			for (int i = 0; i < adjacencyMatrix.length; i++) {
				if (adjacencyMatrix[currentVertex][i] == 1 && visited[i] == false) {
					pendingvertices.add(i);
					map.put(i, currentVertex);
					visited[i] = true;
					if (i == v2) {
						break;
					}
				}
			}
		}
		
		if (map.containsKey(v2)) {
			System.out.print(v2 + " ");
			int key = v2;
			while (map.containsKey(key)) {
				int value = map.get(key);
				System.out.print(value + " ");
				key = value;
			}
		}
		
		
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
		getPathBFS(adjacencyMatrix, v1, v2);
	}
	
}
