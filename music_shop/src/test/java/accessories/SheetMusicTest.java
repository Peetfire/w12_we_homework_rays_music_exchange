package accessories;

import org.junit.Before;
import org.junit.Test;
import shop.stockItems.accessories.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheet;

    @Before
    public void before(){
        sheet = new SheetMusic(10.00, 18.99, "Ultimate collection of Beatles songs", "Hal Leonard", "Ultimate Beatles", "Learning Accessories", "Collection / Songbook", "Piano" );
    }

    @Test
    public void hasFormat(){
        assertEquals("Collection / Songbook", sheet.getFormat());
    }

    @Test
    public void hasInstrument(){
        assertEquals("Piano", sheet.getInstrument());
    }
}
