package deck;

import cards.Card;
import cards.StandardCard;

import java.util.*;


public class Deck {
    private List<Card> dealerPile;
    private List<Card> discardPile;

    public Deck(){
        dealerPile = new ArrayList<>();
    }

    public void addCard(Card card){
        dealerPile.add(card);
    }

    //moves all the cards from discard pile to dealerPile
    //then randomizes the position of cards in dealerPile
    public void shuffle(){
        discardPile = new ArrayList<>();
        dealerPile.add(discardPile.remove(0));
        Collections.shuffle(dealerPile);

    }

    public static Card dealTopCard(Card card) {

        return  card;
    }

    public int countCard() { return dealerPile.size(); }
    public int discardCount(){ return discardPile.size(); }

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
