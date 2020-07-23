import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

     private Player player1;

     @Before
    public void before() {
         player1 = new Player("Bob");
     }

     @Test
    public void canGetPlayerName() {
         assertEquals("Bob", player1.getPlayerName());
     }
}
