import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		rFunctions R = new rFunctions();
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Trial> trialsReplace = new ArrayList<Trial>();
		ArrayList<Trial> trialsNoReplace = new ArrayList<Trial>();
		
		int numberOfSuccessReplace = 0;
		int numberOfSuccessNoReplace = 0;
		
		
		int desiredSum = 0;
		int numOfCards = 0;
		int numOfTrials = 0;
		
		System.out.println("Card Drawing Simulation Project!");
		
		System.out.println("Please enter sum of cards: ");
		desiredSum = sc.nextInt();
		
		System.out.println("Please enter number of cards to be drawn: ");
		numOfCards = sc.nextInt();
		
		System.out.println("Please enter number of trials: ");
		numOfTrials = sc.nextInt();
		
		for(int i = 0; i < numOfTrials; i++) {
			trialsReplace.add(new Trial());
			trialsReplace.get(i).drawCards(numOfCards, true);
			if(trialsReplace.get(i).checkSum(desiredSum) == true)
				numberOfSuccessReplace++;
			
			trialsNoReplace.add(new Trial());
			trialsNoReplace.get(i).drawCards(numOfCards, false);
			if(trialsNoReplace.get(i).checkSum(desiredSum) == true)
				numberOfSuccessNoReplace++;
			
			System.out.println("Trial " + (i + 1));
			trialsReplace.get(i).printPlayerHand();
		}
		
//		int x = sc.nextInt();
//		int size = sc.nextInt();
//		float prob = sc.nextFloat();
//		
//		double result = R.dbinom(x, size, prob);
//		System.out.println("Answer: " + result);
		
	}
}
