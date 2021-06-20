package projects;

public class BoardOthello {
	private char[][] board;
	private int boardSize;
	private char p1Symbol, p2Symbol;
	private int count;
	private int p1Count;
	private int p2Count;
	public final static int PLAYER1_WINS = 1;
	public final static int PLAYER2_WINS = 2;
	public final static int DRAW = 3;
	public final static int INCOMPLETE = 4;
	public final static int INVALID = 5;
	final static int[][]directions = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};


	public BoardOthello(char p1Symbol, char p2Symbol) {
		this.p1Symbol = p1Symbol;
		this.p2Symbol = p2Symbol;
		createOthelloBoard();
	}


	public int othelloMove(char symbol, int x, int y) {
		if (x < 0 || y < 0 || x >= boardSize || y >= boardSize || board[x][y] != 0) {
			System.out.println("Invalid move!");
			return INVALID;
		}
		boolean[][] othello = new boolean[boardSize][boardSize];
		boolean possibleMove = false;
		for (int i = 0; i < othello.length; i++) {
			for (int j = 0; j < othello.length; j++) {
				possibleMove = possibleMove | possibleMove(othello, symbol, i, j, false);
			}
		}
		if (possibleMove) {


			if (othello[x][y] == false) {
				System.out.println("Invalid Move");
				return INVALID;
			}
			count++;

			possibleMove(othello, symbol, x, y, true);

			print();
			if (count == boardSize * boardSize) {
				return outcome();
			}
		}
		return INCOMPLETE;
	}

	private boolean possibleMove(boolean[][] othello, char symbol, int x, int y, boolean move) {
		boolean ans = false;

		for (int[] arr : directions) {
			int tempX = x + arr[0];
			int tempY = y + arr[1];
			if (tempX >= 0 && tempY >= 0 && tempX < boardSize && tempY < boardSize && board[tempX][tempY] != 0 && board[tempX][tempY] != symbol) {
				int temp = 0;
				int i = tempX;
				int j = tempY;
				while (i >= 0 && j >= 0 && i < boardSize && j < boardSize) {
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
						if (symbol == p1Symbol) {
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

	private void print() {
		for (int i = 0; i < boardSize; i++) {
			System.out.print("_____");
		}
		System.out.println();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print("| " + board[i][j] + " |");
			}
			System.out.println();
		}
		for (int i = 0; i < boardSize; i++) {
			System.out.print("_____");
		}
		System.out.println();
	}

	private int outcome() {
		if (p1Count > p2Count) {
			return PLAYER1_WINS;
		}else if (p1Count < p2Count) {
			return PLAYER2_WINS;
		}
		return DRAW;
	}

	private void createOthelloBoard() {
		boardSize = 8;
		board = new char[boardSize][boardSize];
		board[3][3] = p2Symbol;
		board[3][4] = p1Symbol;
		board[4][3] = p1Symbol;
		board[4][4] = p2Symbol;
		p1Count = 2;
		p2Count = 2;
		count = 4;
	}
}
