package pack2;
import acm.program.*;

public class ArrayExample extends ConsoleProgram{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final int SENTINEL = -1;
	public void run() {
		setFont("Courier-24");
		
		int maxlength = readInt("Max size of the array: ");
		int[] midtermScores = new int[maxlength];
		int numActualScores = 0;
		
		for(int i = 0; i < maxlength; i++) {
			midtermScores[i] = readInt("Next Score:");
			if (midtermScores[i] == SENTINEL) break;
			numActualScores++;
		}
		
		println("Average score: " + computeAverage(midtermScores, numActualScores));
	}
	
	private double computeAverage(int[] arr, int numActualScores) {
		double average = 0;
		for( int i = 0; i < numActualScores; i++) {
			average += arr[i];
		}
		average = average/numActualScores;
		return average;
	}
}
