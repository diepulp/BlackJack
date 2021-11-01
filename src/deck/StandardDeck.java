//Assignment: Card Game
//Author: Vladimir Ivanov
//File: StandardDeck.java
//Date: 10/31/21

/**
 * Standard Deck class creates a standard card object
 */
package deck;
import cards.StandardCard;
public class StandardDeck extends Deck {

    private static final String[] RANK = new String[]{"2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King", "Ace"};
    private static final String[] SUIT = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};

    /**
     * Generates a 52 standard card deck
     */
    public StandardDeck() {
        super();
        for(int i = 0; i <= RANK.length - 1; ++i) {
            for(int j = 0; j <= SUIT.length - 1; ++j) {
                addCard((new StandardCard(RANK[i], SUIT[j])));
            }
        }
    }

    /**
     * uses parent method and cast the card into standard card
     * @return StandardCard object
     */
    public StandardCard dealTopCard(){
        return (StandardCard) super.dealTopCard();
    }
}
