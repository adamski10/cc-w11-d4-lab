import java.util.ArrayList;

public class Deck {

    private ArrayList<PlayingCard> deck;

    public Deck() {
        this.deck = new ArrayList<PlayingCard>();

    }

    public int getDeckSize() {
      return this.deck.size();
    }

    public void populateDeck(){
         this.deck.clear();

        for(RankType rank : RankType.values()){
            for(SuitType suit : SuitType.values()) {
                this.deck.add(new PlayingCard(suit, rank));
            }
        }
    }


}

