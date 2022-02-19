package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.stockItems.instruments.Oboe;

import static org.junit.Assert.assertEquals;

public class OboeTest {
    Oboe oboe;

    @Before
    public void before(){
        oboe = new  Oboe(300, 399.99, "Traditional hardwood tenor Oboe", "Yamaha", "YOB-241", "Black & Silver", "Woodwind", "Tenor","Rosewood & nickle silver");
    }

    @Test
    public void hasOboeType(){
        assertEquals("Tenor", oboe.getOboeType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Rosewood & nickle silver", oboe.getMaterial());
    }

    @Test
    public void canPlay(){
        assertEquals("Oboe goes noodlely nood nood", oboe.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(99.99, oboe.calculateMarkup(), 0.001);
    }
}
