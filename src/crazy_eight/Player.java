package crazy_eight;

import java.util.ArrayList;
import java.util.Random;

public class Player {

    private String name;
    private ArrayList<Card> cards = new ArrayList<>();
    private Random rand = new Random();
    private static final int MAX_NUMBER_OF_CARDS = 5;
    public Player(String name, ArrayList<Card> deck) {

        setName(name);
        for(int i = 0; i < MAX_NUMBER_OF_CARDS; i++){
            Card randomCard = deck.get(rand.nextInt(deck.size()));
            cards.add(randomCard);
            deck.remove(randomCard);
        }
    }

    public void setName(String name) {
        if(name.length() < 3)
            throw new IllegalArgumentException(name + " is too short. Must be at least 3 characters");
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
