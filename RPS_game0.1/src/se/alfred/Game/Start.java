package se.alfred.Game;

import se.alfred.Util.calcRuntime;
import se.alfred.Art.Art_ascii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Start {
	
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private StringBuilder sb;
	
	public Start() {
		calcRuntime.startTimer();
	}

	public void run() {
		
		Player player1 = new Player(1);
		Player player2 = new Player(2);

		Art_ascii.clearBoard();
		
		do {
			player1 = getInputFromPlayerOne(player1);
			player2 = getChooseFromBotPlayerTwo(player2);
			try {
				printCounter();
				player1.setScore(checkRoundWinner(player1, player2));
				player2.setScore(checkRoundWinner(player2, player1));
				printScore(player1, player2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} while( true );
	}
	
	private int checkRoundWinner(Player p1, Player p2) throws InterruptedException {
		
		if(p1.getChoice() == p2.getChoice()) {
			
			if(p1.getChoice() == 1 && p1.getPlayerNr() == 1) {
				Art_ascii.printRightRockVsLeftRock();
			}
			
			if(p1.getChoice() == 2 && p1.getPlayerNr() == 1) {
				Art_ascii.printRightPaperVsLeftPaper();
			}
			
			if(p1.getChoice() == 3 && p1.getPlayerNr() == 1) {
				Art_ascii.printRightScissorsVsLeftScissors();
			}
			
			Thread.sleep(2000);
			return p1.getScore();
		}
		
		//Rock
		if(p1.getChoice() == 1 && p2.getChoice() == 3) {
			
			if(p1.getPlayerNr() == 1) {
				Art_ascii.printRightRockVsLeftScissors();
			}
			
			Thread.sleep(2000);
			return p1.getScore() + 1;
		}
		
		if(p1.getChoice() == 1 && p2.getChoice() == 2) {
			
			if(p1.getPlayerNr() == 1) {
				Art_ascii.printRightRockVsLeftPaper();
			}
			
			Thread.sleep(2000);
			return p1.getScore();
		}
		
		//Paper
		if(p1.getChoice() == 2 && p2.getChoice() == 3) {
			
			if(p1.getPlayerNr() == 1) {
				Art_ascii.printRightPaperVsLeftScissors();
			}
			
			Thread.sleep(2000);
			return p1.getScore();
		}
		
		if(p1.getChoice() == 2 && p2.getChoice() == 1) {
			
			if(p1.getPlayerNr() == 1) {
				Art_ascii.printRightPaperVsLeftRock();
			}
			
			Thread.sleep(2000);
			return p1.getScore() + 1;
		}
		
		//Scissors
		if(p1.getChoice() == 3 && p2.getChoice() == 1) {
			
			if(p1.getPlayerNr() == 1) {
				Art_ascii.printRightScissorsVsLeftRock();
			}
			
			Thread.sleep(2000);
			return p1.getScore();
		}
		
		if( p1.getChoice() == 3 && p2.getChoice() == 2 ) {
			
			if( p1.getPlayerNr() == 1 ) {
				Art_ascii.printRightScissorsVsLeftPaper();
			}
			
			Thread.sleep(2000);
			return p1.getScore() + 1;
		}
		
		Thread.sleep(2000);
		return p1.getScore();
	}
	
	private void printScore(Player player1, Player player2) {

		Art_ascii.clearBoard();
		System.out.println("The score is: ");
		System.out.println("Player1: " + player1.getScore());
		System.out.println("CPU: " + player2.getScore());
	}
	
	private void printCounter() throws InterruptedException {
		
		Art_ascii.clearBoard();
		se.alfred.Art.Art_ascii.printNumberOne();
		Thread.sleep(500);
		Art_ascii.clearBoard();
		se.alfred.Art.Art_ascii.printNumberTwo();
		Thread.sleep(500);
		Art_ascii.clearBoard();
		se.alfred.Art.Art_ascii.printNumberThree();
		Thread.sleep(500);
		Art_ascii.clearBoard();
	}
	
	private Player getChooseFromBotPlayerTwo(Player player2) {
		
		//Random 1 to 3
		Random rand = new Random();
		int n = rand.nextInt(3) + 1;
		player2.setChoice(n);

		return player2;
	}	
	
	private Player getInputFromPlayerOne(Player player1) {
		
		try {
			do {
			
				System.out.println("Input: (1 = Rock, 2 = Paper, 3 = Scissors)");
				sb = new StringBuilder(br.readLine());
				player1.setChoice(Integer.valueOf(sb.toString()));
				
				if ( player1.getChoice() > 0 && player1.getChoice() < 4 ) {
					Art_ascii.clearBoard();
					return player1;
				}
				
				Art_ascii.clearBoard();
				System.out.println("Du måste välja mellan 1 och 3");
			
			} while( true );
				
		} catch ( IOException e ) {
			e.printStackTrace();
		}

		return player1;
	}
}
