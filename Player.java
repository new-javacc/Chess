public class Player {

	private String name;
	private boolean isWhite;

	public Player(String name, boolean white) {
		this.name = name;
		isWhite = white;
	}

	public String getName() {return name;}
	public boolean isWhite() {return isWhite;}
}