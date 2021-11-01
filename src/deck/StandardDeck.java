package deck;

import cards.Card;
import cards.StandardCard;

import java.util.ArrayList;

public class StandardDeck extends Deck {

    private static final String[] RANK = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final String[] SUIT = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};


    public StandardDeck() {
        super();
        for(int i = 0; i <= RANK.length - 1; ++i) {
            for(int j = 0; j <= SUIT.length - 1; ++j) {
                addCard((new StandardCard(RANK[i], SUIT[j])));
            }
        }
    }

    public StandardCard dealTopCard(){
        return (StandardCard) super.dealTopCard();
    }

}
