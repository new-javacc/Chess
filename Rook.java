public class Rook extends Piece {

	public Rook(Piece[][] board, int x1, int y1, boolean color) {
		super(board, x1, y1, color);
	}

	@Override
	public boolean isLegal(int x2, int y2) {
		if (x != x2 && y != y2) return false;
		if (!isOnBoard(x2, y2)) return false;
		if (pieceBetween(x, x2, y, true)) return false;
		if (pieceBetween(y, y2, x, false)) return false;
		return true;
	}

	public boolean pieceBetween(int a1, int a2, int b, boolean vertical) {
		if (a1 == a2) return false;
		for (int i = a1 + 1; i < a2; i++) {
			if (vertical && board[i][b] != null) return true;
			if (!vertical && board[b][i] != null) return true;
		}
		if (vertical && board[a2][b] != null && board[a2][b].getColor() == color) return true;
		if (!vertical && board[b][a2] != null && board[b][a2].getColor() == color) return true;
		return false;
	}
}