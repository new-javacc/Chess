public class RookTester {
	public static void main(String[] args) {
		Piece[][] board = new Piece[8][8];
		board[0][2] = new Rook(board, 0, 2, false);
		Rook r = new Rook(board, 0, 0, true);
		System.out.println(r.isLegal(1, 1));
		System.out.println(r.isLegal(1, 0));
		System.out.println(r.isLegal(0, 2));
	}
}