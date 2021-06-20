package projects;

public class OthelloBoard {

	private int board[][];
	final static int player1Symbol = 1;
	final static int player2Symbol = 2;
	int p1Count;
	int p2Count;
	int count;
	final static int[][]directions = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

	public OthelloBoard() {
		board = new int[8][8];
		board[3][3] = player1Symbol;
		board[3][4] = player2Symbol;
		board[4][3] = player2Symbol;
		board[4][4] = player1Symbol;
		p1Count = 2;
		p2Count = 2;
		count  = 4;
	}

	public void print() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean move(int symbol, int x, int y){
		if (x < 0 || y < 0 || x >= 8 || y >= 8 || board[x][y] != 0) {
			return false;
		}
		boolean[][] othello = new boolean[8][8];
		boolean possibleMove = false;
		for (int i = 0; i < othello.length; i++) {
			for (int j = 0; j < othello.length; j++) {
				possibleMove = possibleMove | possibleMove(othello, symbol, i, j, false);
			}
		}
		if (!possibleMove) {
			return false;
		}
		if (othello[x][y] == false) {
			return false;
		}
		count++;
		possibleMove(othello, symbol, x, y, true);

		print();
		if (count == 8 * 8) {
			return false;
		}
		return true;

	}

	private boolean possibleMove(boolean[][] othello, int symbol, int x, int y, boolean move) {
		boolean ans = false;
		for (int[] arr : directions) {
			int tempX = x + arr[0];
			int tempY = y + arr[1];
			if (tempX >= 0 && tempY >= 0 && tempX < 8 && tempY < 8 && board[tempX][tempY] != 0 && board[tempX][tempY] != symbol) {
				int temp = 0;
				int i = tempX;
				int j = tempY;
				while (i >= 0 && j >= 0 && i < 8 && j < 8) {
					if (board[i][j] == 0) {
						break;
					}
					if (board[i][j] == symbol) {
						if (move) {
							temp = Math.max(Math.abs(tempX - i), Math.abs(tempY - j));
							board[x][y] = symbol;
						}else {
							othello[x][y] = true;
							ans = true;
						}
						break;

					}
					i += arr[0];
					j += arr[1];
				}
				if (move) {
					for (int k = 0; k < temp; k++) {
						board[tempX][tempY] = symbol;
						if (symbol == player1Symbol) {
							p1Count++;
							p2Count--;
						}else {
							p2Count++;
							p1Count--;
						}
						tempX += arr[0];
						tempY += arr[1];
					}
				}
			}
		}


		return ans;
	}
}

