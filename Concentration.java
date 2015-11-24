//import cs1.Keyboard;  //if comfortable with Scanner, you may comment this out
import java.util.Scanner;
		
public class Concentration {

		//instance variables
		private Tile[][] _board;     //storage for 4x4 grid of Tiles.
		private int _numberFaceUp;   //count of Tiles with faces visible
		private String[] _words;     //list of unique Strings used for Tile vals
		private static int _numRows = 4;
		private gamePhase = 1;
		private score = 1000;

		//insert constructor and methods here
		_board = new Tile[4][4];
		_words = {"a","b","c","d","e","f","g","h"};

		private static void swap( int x1, int y1, int x2, int y2 ) {
			String temp = _board[x1][y1];
		    	_board[x1][y1] = _board[x2][y2];
		    	_board[x2][y2] = temp;			
    		}

		private static void shuffle(){
			int len1 = _board.length;
			int len2 = _board[0].length;
			for (int i = 0; i < len1; i++)
			
				swap(i, i + (int)(Math.random()*(len-i)));
		}
		}		
		
		public Concentration(){
			for (int i = 0; i < _board.length; i++)
				for (int j = 0; j < _board[i].length; j++)
					_board[i][j] = _words[(i+j) % 8];
			shuffle();
		}

		
		public static void play(){
			Scanner in = new Scanner(System.in);
			while (gamePhase != 0){
			

			}
			System.out.println("The game is over.");
			System.out.println("Your score is " + score + ".");	
		}


		//DO NOT MODIFY main()
		public static void main(String[] args){
				Concentration game = new Concentration();
				game.play();
		}

}//end class Concentration

