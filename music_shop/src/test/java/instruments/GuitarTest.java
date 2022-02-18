package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.stockItems.instruments.Guitar;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar();
    }
    // tests for supersuper class 'StockItems' properties
    @Test
    public void hasStockPrice(){
        assertEquals(259.99, guitar.getStockPrice());
    }
}
