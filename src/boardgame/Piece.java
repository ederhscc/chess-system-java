package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//Apenas classes do mesmo pacote e subclasses poder�o acessar.
	protected Board getBoard() {
		return board;
	}
	
}
