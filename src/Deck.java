import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private ArrayList<Card> cardList;

	public ArrayList<Card> getCardList() {
		return cardList;
	}

	public void setCardList(ArrayList<Card> cardList) {
		this.cardList = cardList;
	}
	
	public void initializeDeck() {
		
		cardList = new ArrayList<Card>();
		
		for (int i = 1; i <= 4; i++) // Suit
		{
			for (int j = 1; j <= 13; j++) // Face cards
			{
				if (i == 1) // Clubs
					cardList.add(new Card("Clubs",j));
				else if (i == 2) // Spades 
			    	cardList.add(new Card("Spades",j));
				else if (i == 3) // Hearts 
			    	cardList.add(new Card("Hearts",j));
				else if (i == 4) // Diamonds 
			    	cardList.add(new Card("Diamonds",j));
			}
		} 
	}
	
	public ArrayList<Card> drawCards (int drawCount, boolean withReplacement) {
		ArrayList<Card> drawnCards = new ArrayList<Card>();
		Random rand = new Random();
		int n;
		
		for (int i = 0; i < drawCount; i++) 
		{
			if (withReplacement == true) 
			{
				n = rand.nextInt(cardList.size());

				drawnCards.add(cardList.get(n));
			} else {
				
				n  = rand.nextInt(cardList.size());
				
				drawnCards.add(cardList.get(n));
				cardList.remove(n);
			}
				
			
		}
		
		
		
		return drawnCards;
	}

}
