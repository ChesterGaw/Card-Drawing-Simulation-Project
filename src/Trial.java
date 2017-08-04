import java.util.ArrayList;
import java.util.Random;

public class Trial {
	
	private Deck playerDeck;
	private ArrayList<Card> playerHand;
	
	public Trial() {
		playerDeck = new Deck();
		playerDeck.initializeDeck();
		playerHand = new ArrayList<Card>();
	}
	
	public void drawCards (int drawCount, boolean withReplacement) {
		Random rand = new Random();
		int n;
		
		for (int i = 0; i < drawCount; i++) 
		{
			if (withReplacement == true) 
			{
				n = rand.nextInt(playerDeck.getCardList().size());

				playerHand.add(playerDeck.getCardList().get(n));
			} else {
				
				n  = rand.nextInt(playerDeck.getCardList().size());
				
				playerHand.add(playerDeck.getCardList().get(n));
				playerDeck.getCardList().remove(n);
			}	
		}
	}
	
	public boolean checkSum(int desiredSum) {
		
		int sum = 0;
		
		for(int i = 0; i < playerHand.size(); i++) 
			sum += playerHand.get(i).getValue();
		
		if(desiredSum == sum)
			return true;
		else return false;
		
	}
	
	public void printPlayerHand(){
		for(int i = 0; i < playerHand.size();i++) {
			System.out.println(playerHand.get(i).getSuit() + " " + playerHand.get(i).getValue()); 
		}
	}


}
