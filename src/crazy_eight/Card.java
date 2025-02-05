package crazy_eight;

import java.util.ArrayList;

public class Card {
    private String faceValue;
    private enum Suit {HEARTS, DIAMONDS, CLUBS, SPADES};
    private Suit suit;


    public String getFaceValue() {
        return faceValue;
    }
    private void validateFaceValue(String faceValue){
        try{
            int num = Integer.parseInt(faceValue);
            if(num < 2 || num > 10)
                throw new IllegalArgumentException("Invalid face value: Number is not between 2 and 10");
        }
        catch (NumberFormatException e){
            if(
                    faceValue.equalsIgnoreCase("K")
                    ||
                            faceValue.equalsIgnoreCase("Q")
                            ||
                            faceValue.equalsIgnoreCase("J")
                            ||
                            faceValue.equalsIgnoreCase("A")
            ){
                return;
            }
            throw new IllegalArgumentException("Invalid face value: face Value is not K,Q,J or A");
        }
    }
    public void setFaceValue(String faceValue) {
        validateFaceValue(faceValue);
        this.faceValue = faceValue.toUpperCase();
    }

    public Suit getSuit() {
        return suit;
    }
    public void setSuit(String suit){
        this.suit = Suit.valueOf(suit.toUpperCase());
    }
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Card(Suit suit, String faceValue) {
        setSuit(suit);
        setFaceValue(faceValue);
    }

    public static ArrayList<Card> CreateDeck(){

        ArrayList<Card> deck = new ArrayList<>();
        String[] faceCards = {"K", "J", "Q", "A"};
        for(Suit suit : Suit.values()){
            for(int i = 2; i <= 10; i++){
                deck.add(new Card(suit, String.valueOf(i)  ));
            }
            for(String faceCard : faceCards){
                deck.add(new Card(suit, faceCard));
            }
        }

        return deck;
    }
    public static ArrayList<Card> CreateDecks(int numberOfDecks){
        if(numberOfDecks < 2)
            throw new IllegalArgumentException("You must add at least two decks of cards");
        ArrayList<Card> deck = new ArrayList<>();
        for(int i = 0; i < numberOfDecks; i++){
            deck.addAll(CreateDeck());
        }

        return deck;
    }
    public String toString(){
        return String.format("Card= %s of %s\n", faceValue, suit);
    }
}
