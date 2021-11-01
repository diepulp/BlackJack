//Assignment: Card Game
//Author: Vladimir Ivanov
//File: Card.java
//Date: 10/31/21
package cards;

/**
 * Creates a generic card object
 */
public class Card {
    private String cardText;

    public Card(String text){
        this.cardText = text;
    }

    /**
     * card information
     * @return string representation of the card features
     */
    public String getCardText(){
        return this.cardText;
    }
    public String toString(){
        return this.cardText;
    }
}
