package javaDataStructures;

public class NQueens {

	public static void placeNQueens(int n) {
		int[][] board = new int[n][n];
		placeQueens(board, n, 0);
	}

	public static void placeQueens(int[][] board, int n, int row) {
		if (row == n) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					System.out.print(board[i][j] + " ");
				}
			}
			System.out.println();
			return;
		}

		for (int col = 0; col < board.length; col++) {
			boolean canPlace = true;
			for (int i = 0; row - i >= 0; i++) {
				if (board[row - i][col] == 1) {
					canPlace = false;
					break;
				}
				if (col - i >= 0 && board[row - i][col - i] == 1) {
					canPlace = false;
					break;
				}
				if (col + i < board.length && board[row - i][col + i] == 1) {
					canPlace = false;
					break;
				}
			}
			if (canPlace) {
				board[row][col] = 1;
				placeQueens(board, n, row + 1);
				board[row][col] = 0;
			}
		}
	}

}
