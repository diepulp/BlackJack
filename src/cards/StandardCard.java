//Assignment: Card Game
//Author: Vladimir Ivanov
//File: StandardDeck.java
//Date: 10/31/21
package cards;

/**
 * StandardCard class generates a standardCard object
 * extends generic card class
 */
public class StandardCard extends Card {
    private final String RANK;
    private final String SUIT;

    public StandardCard(String rank, String suit) {
        super(rank + " of " + suit);
        RANK = rank;
        SUIT = suit;
    }

    public String getRank() {
        return RANK;
    }

    public String getSuit() {
        return SUIT;
    }
    public String toString(){
        return super.getCardText();
    }
}
