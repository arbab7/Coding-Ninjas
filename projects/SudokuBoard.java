package projects;

import java.util.Scanner;

public class SudokuBoard {

	private char[][] board;
	private boolean[][] initial;
	private Scanner s;
	private int size;
	private int numOfSolutions;

	public SudokuBoard() {
		board = new char[9][9];
		initial = new boolean[9][9];
		s = new Scanner(System.in);

		constructBoard();
		printBoard();
	}
	
	public SudokuBoard(int[][] board) {
		this.board = new char[9][9];
		initial = new boolean[9][9];
		constructBoard2(board);
		printBoard();
	}

	public void solve() {
		solve(0, 0, new boolean[9]);
		System.out.println("Total number of possible solutions: " + numOfSolutions);
		
	}

	private void solve(int i, int j, boolean[] value) {
		if (i > 8) {
			printBoard();
			numOfSolutions++;
			return;
		}

		if (j == 0) {
			for (int k = 0; k < value.length; k++) {
				if (initial[i][k]) {
					char c = board[i][k];
					value[c - 49] = true;
				}
			}
		}
		
		if (initial[i][j]) {
			if(j < 8) {
				solve(i, j + 1 , value);
			}else {
				solve(i + 1, 0, new boolean[9]);
			}
		}else {
			for (int k = 0; k < 9; k++) {
				char c = (char)(k + 49);
				if (!value[k] && isSafe(i, j, c)){
					board[i][j] = c;
					value[k] = true;
					if(j < 8) {
						solve(i, j + 1 , value);
					}else {
						solve(i + 1, 0, new boolean[9]);
					}
					board[i][j] = 0;
					value[k] = false;
				}
			}
		}
	}
	
	private boolean isSafe(int x, int y, char k) {
		for (int i = 0; i < 9; i++) {
			if (board[i][y] == k) {
				return false;
			}
		}
		int row = x - x % 3;
		int col = y - y % 3;
		for (int i = 0; i < 3; i++) {	
			for (int j = 0; j < 3; j++) {
				if (board[row + i][col + j] == k) {
					return false;
				}
			}
		}
		return true;
	}

	private void printBoard() {
		System.out.println("_________________________________________");
		System.out.println("-----------------------------------------");
		for (int k = 0; k < board.length; k++) {
			System.out.print("||");
			for (int l = 0; l < board.length; l++) {
				System.out.print(" " + board[k][l] + " |");
				if ((l + 1) % 3 == 0) {
					System.out.print("|");
				}
			}
			System.out.println();
			if ((k + 1) % 3 == 0) {
				System.out.println("-----------------------------------------");
			}
		}
		System.out.println("_________________________________________");
		System.out.println();
		System.out.println();
	}
	
	private void constructBoard() {
		System.out.println("Enter the number of initially filled places: ");
		size = s.nextInt();
		System.out.println("Enter coordinates and number in order(x, y, number)");
		for (int i = 0; i < size; i++) {
			int x = s.nextInt();
			while (x < 0 || x > 9) {
				System.out.println("Invalid positon..Re-enter X:");
				x =s.nextInt();
			}
			int y = s.nextInt();
			while (y < 0 || y > 9) {
				System.out.println("Invalid position..Re-enter Y:");
				y = s.nextInt();
			}
			char c = s.next().charAt(0);
			while (c < '1' || c > '9') {
				System.out.println("Invalid number..Re-enter number: ");
				c = s.next().charAt(0);
			}
			board[x][y] = c;
			initial[x][y] = true;
		}
	}
	
	public void constructBoard2(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] != 0) {
					this.board[i][j] = (char)(board[i][j] + 48);
					initial[i][j] = true;
				}
			}
		}
	}

}
