package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.stockItems.instruments.Keyboard;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {
    Keyboard keyboard;

    @Before
    public void before(){
        keyboard = new Keyboard(200.00, 270.50, "Lovely beginners keyboard",  "Roland", "MU1","Black", "Keys", "Electric Keyboard", 88);
    }

    @Test
    public void hasKeyRange(){
        assertEquals(88, keyboard.getKeyRange());
    }

    @Test
    public void hasKeyBoardType(){
        assertEquals("Electric Keyboard", keyboard.getKeyboardType());
    }

    @Test
    public void canPlay(){
        assertEquals("Keyboard goes tinklity tinkle...", keyboard.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(70.50, keyboard.calculateMarkup(), 0.0);
    }
}

