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
		System.out.println("Enter X or O:");
		char userLetter = sc.next().charAt(0);
		return userLetter;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe game");	
		TicTacToeGame ticTacToeGame = new TicTacToeGame();		
		ticTacToeGame.boardCreation();
		
		char userLetter = ticTacToeGame.chooseXorO();
		System.out.println("User"+userLetter);
		char computerLetter = ' ';
		if (userLetter =='X' || userLetter=='x') {
			computerLetter = 'O';
		} else {
			computerLetter = 'X';
		}
		System.out.println("comp" + computerLetter);
		
	}
}
