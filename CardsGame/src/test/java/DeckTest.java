import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before() {
        deck = new Deck(deck);
    }

    @Test
    public void canGetDeckSize() {
        assertEquals(0, deck.getDeckSize());
    }


}
