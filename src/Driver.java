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

        System.out.println(deck);
        deck.dealTopCard();
       System.out.println(deck);
//        deck.shuffle();
//        System.out.println(deck);
//        deck.shuffle();
//        System.out.println(deck);
//        deck.dealTopCard();
//        System.out.println(deck.discardCount());

//        Deck sDeck = new StandardDeck();
//        System.out.println(sDeck);
//        sDeck.dealTopCard();
//        System.out.println(sDeck);
        deck.dealTopCard();
        System.out.println(deck.dealTopCard().getCardText());
    }
}
