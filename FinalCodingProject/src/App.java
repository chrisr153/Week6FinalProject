
public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		deck.shuffle();
		
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		for (int i=0; i < 52; i++) {
			if (i % 2 ==0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		for (int i=0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			System.out.println("----------------");
			
			if (i==25) {
				System.out.println("Final Round!");
			} else System.out.println("Round "+(i+1));
			
			System.out.println("Player 1: " + card1.describe());
			System.out.println("Player 2: " + card2.describe());
			
			
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 Receives Point. New Score: " + player1.getScore() );
			} else if (card1.getValue() < card2.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 Receives Point New Score:" + player2.getScore());
			} else {
				System.out.println("No Point Awarded. Draw");
			}
		}
			
		System.out.println("----------------");
		System.out.println("Player 1's Final Score: "+ player1.getScore());
		System.out.println("Player 2's Final Score: "+ player2.getScore());
		System.out.println("----------------");
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 Wins with a score of: "+ player1.getScore());
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 Wins with a score of: "+ player2.getScore() );
		} else {
			System.out.println("Draw. No Winner.");
		
		
		}
		


	}

}
