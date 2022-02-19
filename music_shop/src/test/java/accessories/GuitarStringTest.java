package accessories;

import org.junit.Before;
import org.junit.Test;
import shop.stockItems.accessories.GuitarString;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {
    GuitarString strings;

    @Before
    public void before(){
        strings = new GuitarString(2.99, 3.99, "Nice light gauge strings", "Ernie Ball", "Super Slinky", "Guitar Accessories", "Electric", "Extra Light");
    }

    // tests for super super class 'StockItems' properties
    @Test
    public void hasStockPrice(){
        assertEquals(2.99, strings.getStockPrice(), 0.0);
    }

    @Test
    public void hasRrpPrice(){
        assertEquals(3.99, strings.getRrp(), 0.0);
    }

    @Test
    public void hasDescription(){
        assertEquals("Nice light gauge strings", strings.getDescription());
    }
}
