//Assignment: Card Game
//Author: Vladimir Ivanov
//File: DeckClientTest.java
//Date: 11/5/21
import static org.junit.Assert.*;

import cards.Card;
import cards.SetCard;
import cards.StandardCard;
import deck.Deck;
import deck.StandardDeck;
import org.junit.Test;

/**
 * test getters of the Card, StandardCard, and SetCard classes
 */
public class DeckClientTest {

    //Test Card
    @Test
    public void testGetCardText() {
        Card card = new Card("Ace");
        assertEquals("Not an ace", "Ace", card.getCardText());
    }

    @Test
    public void testCard() {
        Card card = new StandardCard("Ace", "Clubs");
        assertEquals("The card did not match the description", "Ace of Clubs", card.toString());
    }

    //Test Standard Card

    StandardCard card = new StandardCard("Ace", "Clubs");

    @Test
    public void testGetSuit(){
        assertEquals("The suit is incorrect", "Clubs", card.getSuit());
    }
    @Test
    public void testGetRank(){
        assertEquals("The suit is incorrect", "Ace", card.getRank());
    }


    //Test SetCard

    SetCard sCard = new SetCard("Square", 10, "off-white", "pink");

    @Test
    public void testGetShape(){
        assertEquals("Square", sCard.getShape());

    }
    @Test
    public void testGetNumber(){
        assertEquals(10, sCard.getNumber());
    }

    @Test
    public void testGetShading(){
        assertEquals("off-white", sCard.getShading());
    }
    @Test
    public void testGetColor(){
        assertEquals("pink", sCard.getColor());
    }

  //testDeck

    Deck deck = new Deck();
    @Test(expected = IndexOutOfBoundsException.class)
    public void testDealTopCard(){
        Deck deck = new Deck();
        deck.dealTopCard();
      }
    @Test
    public void testDiscardCount(){
        assertEquals(0, deck.discardCount());
    }
    @Test
    public void testCountCard(){
        deck.addCard(new Card("Ten of Spades"));
        assertEquals(1, deck.countCard());
    }

    //test StandardDeck
    @Test
    public void testStandardDeck(){
        StandardDeck deck = new StandardDeck();
        assertTrue(52 == deck.countCard());
        assertEquals("2 of Clubs", deck.dealTopCard().getCardText());
    }

 }



