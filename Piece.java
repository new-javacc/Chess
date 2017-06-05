public abstract class Piece {
	
	protected boolean color;
	protected int x, y;
	protected Piece[][] board;

	public Piece(Piece[][] board, int x, int y, boolean color) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.board = board;
		board[x][y] = this;
	}

	public boolean getColor() {return color;}
	public int getX() {return x;}
	public int getY() {return y;}

	public abstract boolean isLegal(int x2, int y2);

	public boolean isOnBoard(int x2, int y2) {
		return (x2 >= 0 && x2 < board.length && y2 >= 0 && y2 < board[0].length);
	}

	public void moveTo(int x2, int y2) {
		if (!isLegal(x2, y2)) return;
		x = x2;
		y = y2;
		board[x][y] = null;
		board[x2][y2] = this;
	}
}