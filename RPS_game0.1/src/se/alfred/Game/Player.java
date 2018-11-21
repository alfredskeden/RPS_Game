package se.alfred.Game;

public class Player {

	private int choice = 0;
	private int score = 0;
	private int playerNr = 0;
	
	public Player(int playerNr) {
		this.playerNr = playerNr;
	}
	
	public void setChoice(int choice) {
		this.choice = choice;
	}
	
	public int getChoice() {
		return choice;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
	public int getPlayerNr() {
		return playerNr;
	}
	
	public void setPlayerNr(int playerNr) {
		this.playerNr = playerNr;
	}
}
