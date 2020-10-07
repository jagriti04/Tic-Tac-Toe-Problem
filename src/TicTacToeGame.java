import java.util.Scanner;

public class TicTacToeGame {
	private char[] board = new char[10];
	
	//UC1 create board
	public void boardCreation() {
		for (int position = 1; position<board.length; position++) {
			board[position] = ' ';
		}
	}
	
	//UC2 ask user to choose either X or O
	public char chooseXorO() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to Choose X and 2 to O:");
		
		int userChoose = sc.nextInt();
		char userLetter =' ';
		switch (userChoose) {
				case 1: userLetter = 'X';
					    break;
				
				case 2: userLetter = 'O';
						break;
				
				default:
						break;
		}
		return userLetter;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe game");	
		TicTacToeGame ticTacToeGame = new TicTacToeGame();		
		ticTacToeGame.boardCreation();
		
		char userLetter = ticTacToeGame.chooseXorO();
		System.out.println(userLetter);
	}
}
