package Program;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class application {

	public static void main(String[] args) {
	
		
		Position pos = new Position(3, 5);

		Board board = new Board(8,8);
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		
	}

}
