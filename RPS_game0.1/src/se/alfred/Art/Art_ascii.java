package se.alfred.Art;

public class Art_ascii {

	public static void printRightRockVsLeftRock() {
		System.out.println("    Rock          Tie         Rock     ");
		System.out.println("    _______                 _______    ");
		System.out.println("---'   ____)               (____   '---");
		System.out.println("      (_____)             (_____)	   ");
		System.out.println("      (_____)             (_____)	   ");
		System.out.println("      (____)               (____)	   ");
		System.out.println("---.__(___)                 (___)__.---");
	}
	
	public static void printRightRockVsLeftScissors() {
		System.out.println("    Rock         Win        Scissors   ");
		System.out.println("    _______                 _______    ");
		System.out.println("---'   ____)           ____(____   '---");
		System.out.println("      (_____)         (______          ");
		System.out.println("      (_____)         (__________      ");
		System.out.println("      (____)               (____)      ");
		System.out.println("---.__(___)                 (___)__.---");
	}
	
	public static void printRightRockVsLeftPaper() {
		System.out.println("    Rock        Lost          Paper    ");
		System.out.println("    _______                 _______    ");
		System.out.println("---'   ____)           ____(____   '---");
		System.out.println("      (_____)         (______          ");
		System.out.println("      (_____)        (_______          ");
		System.out.println("      (____)          (_______         ");
		System.out.println("---.__(___)             (__________.---");
	}
	
	public static void printRightScissorsVsLeftRock() {
		System.out.println("    Scissors       Lost        Rock     ");
		System.out.println("    _______                  _______    ");
		System.out.println("---'   ____)____            (____   '---");
		System.out.println("          ______)          (_____)      ");
		System.out.println("       __________)         (_____)      ");
		System.out.println("      (____)                (____)      ");
		System.out.println("---.__(___)                  (___)__.---");
	}
	
	public static void printRightScissorsVsLeftScissors() {
		System.out.println("    Scissors        Tie         Scissors   ");
		System.out.println("    _______                     _______    ");
		System.out.println("---'   ____)____           ____(____   '---");
		System.out.println("          ______)         (______          ");
		System.out.println("       __________)       (__________       ");
		System.out.println("      (____)                   (____)      ");
		System.out.println("---.__(___)                     (___)__.---");
	}
	
	public static void printRightScissorsVsLeftPaper() {
		System.out.println("    Scissors       Win        Paper     ");
		System.out.println("    _______                  _______    ");
		System.out.println("---'   ____)____        ____(____   '---");
		System.out.println("          ______)      (______          ");
		System.out.println("       __________)    (__________       ");
		System.out.println("      (____)           (_______         ");
		System.out.println("---.__(___)              (__________.---");
	}
	
	public static void printRightPaperVsLeftRock() {
		System.out.println("    Paper          Win       Rock      ");
		System.out.println("    _______                 _______    ");
		System.out.println("---'   ____)____           (____   '---");
		System.out.println("          ______)         (_____)      ");
		System.out.println("          _______)        (_____)      ");
		System.out.println("         _______)          (____)      ");
		System.out.println("---.__________)             (___)__.---");
	}
	
	public static void printRightPaperVsLeftScissors() {
		System.out.println("     Paper         Lost     Scissors   ");
		System.out.println("    _______                 _______    ");
		System.out.println("---'   ____)____       ____(____   '---");
		System.out.println("          ______)     (______          ");
		System.out.println("          _______)   (__________       ");
		System.out.println("         _______)          (____)      ");
		System.out.println("---.__________)             (___)__.---");
	}
	
	public static void printRightPaperVsLeftPaper() {
		System.out.println("     Paper         Tie          Paper     ");
		System.out.println("    _______                    _______    ");
		System.out.println("---'   ____)____          ____(____   '---");
		System.out.println("          ______)        (______          ");
		System.out.println("          _______)      (_______          ");
		System.out.println("         _______)        (_______         ");
		System.out.println("---.__________)            (__________.---");
	}
	
	public static void printNumberOne() {
         System.out.println(" .----------------. ");
         System.out.println("| .--------------. |");
         System.out.println("| |     __       | |");
         System.out.println("| |    /  |      | |");
         System.out.println("| |    `| |      | |");
         System.out.println("| |     | |      | |");
         System.out.println("| |    _| |_     | |");
         System.out.println("| |   |_____|    | |");
         System.out.println("| |              | |");
         System.out.println("| '--------------' |");
         System.out.println(" '----------------' ");
	}
	
	public static void printNumberTwo() {
		
		System.out.println(" .----------------. ");
		System.out.println("| .--------------. |");
		System.out.println("| |    _____     | |");
		System.out.println("| |   / ___ `.   | |");
		System.out.println("| |  |_/___) |   | |");
		System.out.println("| |   .'____.'   | |");
		System.out.println("| |  / /____     | |");
		System.out.println("| |  |_______|   | |");
		System.out.println("| |              | |");
		System.out.println("| '--------------' |");
		System.out.println(" '----------------' ");
		
	}
	
	public static void printNumberThree() {
		
		System.out.println(" .----------------. ");
		System.out.println("| .--------------. |");
		System.out.println("| |    ______    | |");
		System.out.println("| |   / ____ `.  | |");
		System.out.println("| |   `'  __) |  | |");
		System.out.println("| |   _  |__ '.  | |");
		System.out.println("| |  | \\____) |  | |");
		System.out.println("| |   \\______.'  | |");
		System.out.println("| |              | |");
		System.out.println("| '--------------' |");
		System.out.println(" '----------------' ");
		
	}
	
	//Clearboard
	public static void clearBoard() {
		for (int i = 0; i < 50; ++i) System.out.println();
	}
}
