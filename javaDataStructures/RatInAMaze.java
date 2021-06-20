package javaDataStructures;

public class RatInAMaze {

	public static boolean ratInAMaze(int maze[][]){

		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/ 

		int[][] path = new int[maze.length][maze.length];
		return helper(maze, path, 0 , 0);
		
	}
	
	public static boolean helper(int[][] maze, int[][] path, int i, int j) {
		if (i < 0 || i == maze.length || j < 0 || j == maze.length) {
			return false;
		}
		if (maze[i][j] == 0 || path[i][j] == 1) {
			return false;
		}
		if (i == maze.length - 1 && j == maze.length - 1) {
			return true;
		}
		path[i][j] = 1;
		boolean pathTop = helper(maze, path, i - 1, j);
		if (pathTop) {
			return true;
		}
		boolean pathRight = helper(maze, path, i, j + 1);
		if (pathRight) {
			return true;
		}
		boolean pathBottom = helper(maze, path, i + 1, j);
		if (pathBottom) {
			return true;
		}
		boolean pathLeft = helper(maze, path, i, j - 1);
		if (pathLeft) {
			return true;
		}
		return false;
	}
}
