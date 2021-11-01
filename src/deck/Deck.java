//Assignment: Card Game
//Author: Vladimir Ivanov
//File: Deck.java
//Date: 10/31/21
package deck;
import cards.Card;
import java.util.*;

/**
 * Deck represents two groups of cards
 * which are placed in a dealer and discard pile respectively
 */
public class Deck {
    private final List<Card> dealerPile = new ArrayList<>();
    private final List<Card> discardPile = new ArrayList<>();

    public Deck(){}

    /**
     * adds a card into a deler pile
     * @param card card
     */
    public void addCard(Card card){
        dealerPile.add(card);
    }

    /**
     *  moves all the cards from discard pile to dealerPile
     *  then randomizes the position of cards in dealerPile
     */

    public void shuffle(){
        discardPile.add(dealerPile.remove(0));
        Collections.shuffle(dealerPile);

    }

    /**
     * removes the top card from dealer pile
     *  adds it to the discard
     * @return card object
     */
    public Card dealTopCard() {
        Card removed = dealerPile.remove(0);
        discardPile.add(removed);
      return removed;
    }

    /**
     * counts the total cards in the dealer pile
     * @return size of the dealer pile ArrayList
     */
    public int countCard() { return dealerPile.size(); }

    /**
     * caount the discarded cards
     * @return integer count of the discard pile
     */
    public int discardCount(){ return discardPile.size(); }

    /**
     *
     * @return visual representation of cards in the deck
     */
    public String toString(){

        StringBuilder sb = new StringBuilder()
                .append(countCard())
                .append(" cards in the deck\n")
                .append("**********************\n");

        for (int i = 0; i < dealerPile.size(); i++) {
            sb.append(dealerPile.get(i));
            sb.append("\n");
        }
        sb.append("\n");
        sb.append(discardCount());
        sb.append(" cards in the discard\n");
        sb.append("**********************");
        return sb.toString();
    }
}
