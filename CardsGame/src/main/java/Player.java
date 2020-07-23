import java.util.ArrayList;

public class Player {

    private ArrayList<PlayingCard> cards;
    private String name;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<PlayingCard>();
    }

    public String getPlayerName() {
        return this.name;
    }
}
