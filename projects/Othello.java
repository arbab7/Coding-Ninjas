package projects;

import java.util.Scanner;

public class Othello {

	private Player p1, p2;
	private BoardOthello board;
	
	public void startGame() {
		Scanner s = new Scanner(System.in);
		p1 = takeplayerInput(1);
		p2 = takeplayerInput(2);
		while (p1.getSymbol() == p2.getSymbol()) {
			System.out.println("Symbol already taken! Take another symbol");
			char symbol = s.next().charAt(0);
			p2.setSymbol(symbol);
		}
		
		board = new BoardOthello(p1.getSymbol(), p2.getSymbol());
		
		int status = BoardOthello.INCOMPLETE;
		boolean player1Turn = true;
		while (status == BoardOthello.INCOMPLETE || status == BoardOthello.INVALID) {
			if (player1Turn) {
				System.out.println(p1.getName() + "'s turn: ");
				System.out.println("Enter x: ");
				int x = s.nextInt();
				System.out.println("Enter y: ");
				int y = s.nextInt();
				status = board.othelloMove(p1.getSymbol(), x, y);
				if (status != BoardOthello.INVALID) {
					player1Turn = false;
				}
			}else {
				System.out.println(p2.getName() + "'s turn: ");
				System.out.println("Enter x: ");
				int x = s.nextInt();
				System.out.println("Enter y: ");
				int y = s.nextInt();
				status = board.othelloMove(p2.getSymbol(), x, y);
				if (status != BoardOthello.INVALID) {
					player1Turn = true;
				}
			}
		}
		if (status == BoardOthello.PLAYER1_WINS) {
			System.out.println(p1.getName() + " wins!!");
		}else if (status == BoardOthello.PLAYER2_WINS) {
			System.out.println(p2.getName() + " wins!!");
		}else {
			System.out.println("Draw!!");
		}
	}
	
	private Player takeplayerInput(int num) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter player" + num + "'s name:");
		String name = s.next();
		System.out.println("Enter player" + num + "'s symbol:");
		char symbol = s.next().charAt(0);
		return new Player(name, symbol);
	}
}
