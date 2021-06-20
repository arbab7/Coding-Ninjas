package javaDataStructures;

import java.util.*;

class Edge implements Comparable<Edge>{
	int v1;
	int v2;
	int weight;
	public Edge(int v1, int v2, int weight) {
		this.v1 = v1;
		this.v2 = v2;
		this.weight = weight;	
	}
	
	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight;
	}
	
	
}

public class KruskalAlgorithm {

	public static void kruskal(int v, Edge[] edges) {
		Arrays.sort(edges);
		int[] union = new int[v];
		for (int i = 1; i < union.length; i++) {
			union[i] = i;
		}
		int count = 0;
		int j = 0;
		for (Edge e : edges) {
			boolean temp = unionFind(e, union);
			if (temp) {
				System.out.println(Math.min(e.v1, e.v2) + " " + Math.max(e.v1, e.v2) + " " + e.weight);
				count++;
				if (count == v - 1) {
					return;
				}
			}
		}
	}
	
	public static boolean unionFind(Edge e, int[] union) {
		int temp1 = e.v1;
		int temp2 = e.v2;
		while (temp1 != union[temp1]) {
			temp1 = union[temp1];
		}
		while (temp2 != union[temp2]) {
			temp2 = union[temp2];
		}
		if (temp1 == temp2) {
			return false;
		}
		union[temp1] = temp2;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		Edge[] edges = new Edge[E];
		for (int i = 0; i < edges.length; i++) {
			Edge temp = new Edge(s.nextInt(), s.nextInt(), s.nextInt());
			edges[i] = temp;
		}
		kruskal(V, edges);
		
		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
	}
	
}
