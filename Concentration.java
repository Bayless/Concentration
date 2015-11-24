//Team Fern - Joel Ye, Bayle Smith-Salzberg
//APCS1 pd10
//HW36 -- Some Folks Call it a Memory
//2015-11-23

//import cs1.Keyboard;  //if comfortable with Scanner, you may comment this out
import java.util.Scanner;
		
public class Concentration {

    //instance variables
    private Tile[][] _board;     //storage for 4x4 grid of Tiles.
    private int _numberFaceUp;   //count of Tiles with faces visible
    private String[] _words;     //list of unique Strings used for Tile vals
    private static int _numRows = 4;
    private int gamePhase = 1;
    private int score = 1000;

    //insert constructor and methods here

    		
    public Concentration(){
	_board = new Tile[4][4];
	_words = new String[] {"a","b","c","d","e","f","g","h"};

	for (int i = 0; i < _board.length; i++)
	    for (int j = 0; j < _board[i].length; j++)
			_board[i][j] = new Tile(_words[(i+j) % 8]);
	shuffle();
    }

    
    public static String print() {
	String ret = "";
	for (int i = 0; i< _board.length; i++){
	    ret += "row " + i+1 + ": \t";
	    for (int x = 0; x < _board[i].length;x++){
		ret += _board[i][x] + " ";
		if (x == _board[i].length-1)
		    ret += "\n";
	    }
	}
	return ret;
    }
	
    public Tile[][] getBoard(){
		return _board;
    }

    private void swap( int x1, int y1, int x2, int y2 ) {
	Tile temp = getBoard()[x1][y1];
		_board[x1][y1] = getBoard()[x2][y2];
		_board[x2][y2] = temp;			
    }

	//Iterates through array. Swaps current Tile with one at point further down.
    private void shuffle(){
	int len1 = _board.length;
	int len2 = _board[0].length;
	for (int i = 0; i < len1; i++)
	    for (int j = 0; j < len2; j++){
			int rowAdd = (int)(Math.random()*(len1 - i));
			int colNum = 0;
			if (rowAdd == 0)
				colNum = j + (int)(Math.random()*(len2-j));
			else
				colNum = (int)(Math.random()*len2);
			swap (i, j, i + rowAdd,  colNum);
		}
    }	


		
    public void play(){
	Scanner in = new Scanner(System.in);
	while (gamePhase != 0){
			

	}
	System.out.println("The game is over.");
	System.out.println("Your score is " + score + ".");	
    }


    //DO NOT MODIFY main()
    public static void main(String[] args){
	Concentration test = new Concentration();
				   
	/*	Concentration game = new Concentration();
		game.play(); */
    }

}//end class Concentration

