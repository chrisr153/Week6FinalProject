import java.util.*;

class Deck {
	
	public List<Card> cards;
	
	Deck() {
		
		cards = new ArrayList<>();
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        for (int i = 0; i < suits.length; i++) {
            for (int c = 0; c < names.length; c++) {
                cards.add(new Card(c + 2, names[c] + " of " + suits[i]));
            }
        }
    }
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}
}



	
	
		

