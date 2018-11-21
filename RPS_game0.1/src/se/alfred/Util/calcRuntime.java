package se.alfred.Util;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class calcRuntime {

	private static long startTime;
	
	public static void startTimer() {
		startTime = System.currentTimeMillis();
	}
	
	public static void showTimer() {
		long endTime = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.println("");
		System.out.print("Execution time is " + formatter.format((endTime - startTime) / 1000d) + " seconds");
	}
}
