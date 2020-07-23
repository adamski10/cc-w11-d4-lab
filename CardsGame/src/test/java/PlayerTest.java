import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

     private Player player1;
     private Deck deck;

     @Before
    public void before() {
         player1 = new Player("Bob");
         deck = new Deck();
     }

     @Test
    public void canGetPlayerName() {
         assertEquals("Bob", player1.getPlayerName());
     }
     
     @Test
     public void canGetCard(){
       deck.populateDeck();
       player1.getCard(deck);
       assertEquals(1, player1.countCards());
     }
}
