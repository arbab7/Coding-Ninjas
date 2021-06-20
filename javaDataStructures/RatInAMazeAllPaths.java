package javaDataStructures;

public class RatInAMazeAllPaths {

	public static void ratInAMaze(int maze[][]){

        /* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Print output as specified in the question
		 */

        int[][] path = new int[maze.length][maze.length];
        solveMaze(maze, path, 0, 0);

    }

    public static void solveMaze(int[][] maze, int[][] path, int i, int j) {
        if (i < 0 || i == maze.length || j < 0 || j == maze.length) {
            return;
        }
        if (maze[i][j] == 0 || path[i][j] == 1) {
            return;
        }
        path[i][j] = 1;
        if (i == maze.length - 1 && j == maze.length - 1) {
            printPath(path);
            path[i][j] = 0;
            return;
        }
        solveMaze(maze, path, i - 1, j);
        solveMaze(maze, path, i, j + 1);
        solveMaze(maze, path, i + 1, j);
        solveMaze(maze, path, i, j - 1);
        path[i][j] = 0;
    }

    public static void printPath(int[][] path) {
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[i].length; j++) {
                System.out.print(path[i][j] + " ");
            }
        }
        System.out.println();
    }
	
}
