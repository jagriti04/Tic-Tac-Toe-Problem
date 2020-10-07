import java.awt.datatransfer.Clipboard;

public class TicTacToeGame {
	private char[] board = new char[11];
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe game");
		
		TicTacToeGame ticTacToeGame = new TicTacToeGame();
		
		for (int i = 1; i<ticTacToeGame.board.length; i++) {
			ticTacToeGame.board[i] = ' ';
		}
	}
}
