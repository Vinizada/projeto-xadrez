package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}
	public boolean possibleMoves() {
		return false;
	}
	public boolean possibleMove(Position position) {
		this.position = position;
		return false;
	}
	public boolean isThereAnyPossibleMove() {
		return false;	
	}
	protected Board getBoard() {
		return board;
	}

}
