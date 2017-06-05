public class CheckLegality {
	
	public static boolean isLegal(Piece[][] board, int x1, int y1, int x2, int y2) {
		if (board[x1][y1] == null) return false;
		return board[x1][y1].checkLegality(x2, y2);
	}
}