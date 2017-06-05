public class Bishop extends Piece {

	public Bishop(Piece[][] board, int x, int y, boolean color) {
		super(board, x, y, color);
	}

	public boolean isLegal(int x2, int y2) {
		if (Math.abs(x - x2) != Math.abs(y - y2)) return false;
		if (pieceBetween(x, y, x2, y2)) return false;
		return true;
	}
}