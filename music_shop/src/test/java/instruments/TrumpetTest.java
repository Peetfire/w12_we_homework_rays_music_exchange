package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.stockItems.instruments.Trumpet;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(300, 450.00, "Nice shiny trumpet", "Bach", "TR-501 S", "Brass", "Brass", "Bb Trumpet", "Brass");
    }

    @Test
    public void hasTrumpetType(){
        assertEquals("Bb Trumpet", trumpet.getTrumpetType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void canPlay(){
        assertEquals("Trumpet goes Toot Toot", trumpet.play());
    }
}
