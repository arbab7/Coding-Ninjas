package projects;

import java.util.Scanner;

public class TicTacToe {
	private Player p1, p2;
	private BoardTicTacToe board;
	
	public void startGame() {
		Scanner s = new Scanner(System.in);
		p1 = takePlayerInput(1);
		p2 = takePlayerInput(2);
		while (p1.getSymbol() == p2.getSymbol()) {
			System.out.println("Symbol Already taken! Take another symbol");
			p2.setSymbol(s.next().charAt(0));
		}
		board = new BoardTicTacToe(p1.getSymbol(), p2.getSymbol());
		
		int status = BoardTicTacToe.INCOMPLETE;
		boolean player1Turn = true;
	
		while (status == BoardTicTacToe.INCOMPLETE || status == BoardTicTacToe.INVALID) {
			if (player1Turn) {
				System.out.println(p1.getName() + "'s turn");
				System.out.println("Enter x: ");
				int x = s.nextInt();
				System.out.println("Enter y: ");
				int y = s.nextInt();
				status = board.ticTacToeMove(p1.getSymbol(), x, y);
				if (status != BoardTicTacToe.INVALID) {
					player1Turn = false;
				}
				
			}else {
				System.out.println(p2.getName() + "'s turn");
				System.out.println("Enter x: ");
				int x = s.nextInt();
				System.out.println("Enter y: ");
				int y = s.nextInt();
				status = board.ticTacToeMove(p2.getSymbol(), x, y);
				if (status != BoardTicTacToe.INVALID) {
					player1Turn = true;
				}
			}
		}
		if (status == BoardTicTacToe.PLAYER1_WINS) {
			System.out.println(p1.getName() + " wins!!");
		}else if (status == BoardTicTacToe.PLAYER2_WINS) {
			System.out.println(p2.getName() + " wins!!");
		}else {
			System.out.println("Draw!!");
		}
	}

	private Player takePlayerInput(int num){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player " + num + " name: ");
		String name = s.nextLine();
		System.out.println("Enter Player " + num + " symbol: ");
		char symbol = s.next().charAt(0);
		Player p = new Player(name, symbol);
		return p;	
	}
	
}
