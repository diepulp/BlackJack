import cards.Card;
import cards.StandardCard;
import deck.Deck;
import deck.StandardDeck;

public class Driver {
    public static void main(String[] args) {

        Card card = new StandardCard("Ace", "clubs");
        System.out.println(card);
        System.out.println(card.getCardText());
        System.out.println( ((StandardCard) card).getSuit());

        Deck deck = new StandardDeck();
        deck.addCard(card);
        System.out.println(deck);
    }
}
