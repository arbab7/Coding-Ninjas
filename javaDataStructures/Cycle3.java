package javaDataStructures;

import java.util.*;

public class Cycle3 {

	public int solve(int n,int m,int U[],int V[]) {
		int[][] adjacencyMatrix = new int[n][n];
		for (int i = 0; i < m; i++) {
			int v1 = U[i] - 1;
			int v2 = V[i] - 1;
			adjacencyMatrix[v1][v2] = 1;
			adjacencyMatrix[v2][v1] = 1;
 		}
		int num = 0;
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			boolean[] visited = new boolean[n];
			num += count(adjacencyMatrix, i, i, visited, 0);
		}
		return num / 6;
	}
	
	public static int count(int[][] adjacencyMatrix, int startVertex, int currentVertex, boolean[] visited, int count) {
		if (count > 3) {
			return 0;
		}
		if (count == 2) {
			if (adjacencyMatrix[currentVertex][startVertex] == 1) {
				return 1;
			}
			return 0;
		}
		visited[currentVertex] = true;
		int num = 0;
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			if (adjacencyMatrix[currentVertex][i] == 1 && visited[i] == false) {
				num += count(adjacencyMatrix, startVertex, i, visited, count + 1);
			}
		}
		visited[currentVertex] = false;
		return num;
	}
	
	public static int[]u=new int [5005];
	public static int[]v=new int [5005];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		for(int i=0;i<m;i++)
		{
			u[i]=scan.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			v[i]=scan.nextInt();
		}
		System.out.println(new Cycle3().solve(n,m,u,v));
	}
}
