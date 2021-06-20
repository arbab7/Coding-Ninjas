package javaDataStructures;

public class Islands {

	public int solve(int n,int m,int U[],int V[]) {
		int[][] adjacentMatrix = new int[n][n];
		for (int i = 0; i < m; i++) {
			int v1 = U[i] - 1;
			int v2 = V[i] - 1;
			adjacentMatrix[v1][v2] = 1;
			adjacentMatrix[v2][v1] = 1;
		}
		return islandsDFS(adjacentMatrix);
	}
	
	public static int islandsDFS(int[][] adjacentMatrix) {
		boolean[] visited = new boolean[adjacentMatrix.length];
		int count = 0;
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == false) {
				count++;
				helper(adjacentMatrix, i, visited);
			}
		}
		return count;
	}

	public static void helper(int[][] adjacentMatrix, int currentVertix, boolean[] visited) {
		visited[currentVertix] = true;
		for (int i = 0; i < adjacentMatrix.length; i++) {
			if (adjacentMatrix[currentVertix][i] == 1 && visited[i] == false) {
				helper(adjacentMatrix, i, visited);
			}
		}
	}
	
}
