package projects;

public class BoardTicTacToe{
	private char[][] board;
	private int boardSize;
	private char p1Symbol, p2Symbol;
	private int count;
	public final static int PLAYER1_WINS = 1;
	public final static int PLAYER2_WINS = 2;
	public final static int DRAW = 3;
	public final static int INCOMPLETE = 4;
	public final static int INVALID = 5;
	
	public BoardTicTacToe(char p1Symbol, char p2Symbol) {
		this.p1Symbol = p1Symbol;
		this.p2Symbol = p2Symbol;
		createTicTacToeBoard(3);	
	}

	public BoardTicTacToe(char p1Symbol, char p2Symbol, int size) {
		createTicTacToeBoard(size);
		this.p1Symbol = p1Symbol;
		this.p2Symbol = p2Symbol;
	}

	public int ticTacToeMove(char symbol, int x, int y) {
		if (x < 0 || x >= boardSize || y < 0 || y >= boardSize || board[x][y] != 0) {
			System.out.println("Invalid move!");
			return INVALID;
		}
		board[x][y] = symbol;
		count++;
		print();
		for (int i = 0; i < boardSize; i++) {
			if(board[x][i] == 0 || board[x][i] != symbol) {
				break;
			}
			if (i == boardSize - 1) {
				return outcome(symbol);
			}
		}
		for (int i = 0; i < boardSize; i++) {
			if (board[i][y] == 0 || board[i][y] != symbol) {
				break;
			}
			if (i == boardSize - 1) {
				return outcome(symbol);
			}
		}
		for (int i = 0; i < boardSize; i++) {
			if (board[i][i] == 0 || board[i][i] != symbol) {
				break;
			}
			if (i == boardSize - 1) {
				return outcome(symbol);
			}
		}
		for (int i = 0; i < board.length; i++) {
			if (board[boardSize - 1 - i][i] == 0 || board[boardSize - 1 - i][i] != symbol) {
				break;
			}
			if (i == boardSize - 1) {
				return outcome(symbol);
			}
		}

		if (count == boardSize * boardSize) {
			return DRAW;
		}
		return INCOMPLETE;

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

	private int outcome(char symbol) {
		if (symbol == p1Symbol) {
			return PLAYER1_WINS;
		}
		return PLAYER2_WINS;
	}

	private void createTicTacToeBoard(int size) {
		boardSize = size;
		board = new char[boardSize][boardSize];
	}
}