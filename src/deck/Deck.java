package deck;

import cards.Card;


import java.util.*;


public class Deck {
    private final List<Card> dealerPile = new ArrayList<>();
    private final List<Card> discardPile = new ArrayList<>();

    public Deck(){}

    public void addCard(Card card){
        dealerPile.add(card);
    }

    //moves all the cards from discard pile to dealerPile
    //then randomizes the position of cards in dealerPile
    public void shuffle(){
        discardPile.add(dealerPile.remove(0));
        Collections.shuffle(dealerPile);

    }

    public Card dealTopCard() {
        Card removed = dealerPile.remove(0);
        discardPile.add(removed);
      return removed;
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
