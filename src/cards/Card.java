package cards;

public class Card {
    private String cardText;

    public Card(String text){
        this.cardText = text;
    }

    public String getCardText(){
        return this.cardText;
    }
    public String toString(){
        return this.cardText;
    }
}
