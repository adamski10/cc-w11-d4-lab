import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(Deck deck) {
        this.deck = new ArrayList<Card>();
    }

    public int getDeckSize() {
      return this.deck.size();
    }


}

