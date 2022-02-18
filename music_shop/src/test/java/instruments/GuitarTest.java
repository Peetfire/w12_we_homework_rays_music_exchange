package instruments;

import org.junit.Before;
import org.junit.Test;
import shop.stockItems.instruments.Guitar;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(259.99, 359.99, "Stylish electric", "Gibson", "Firebird", "Fireburst", "Guitar", 6, "Electric");
    }
    // tests for super super class 'StockItems' properties
    @Test
    public void hasStockPrice(){
        assertEquals(259.99, guitar.getStockPrice(), 0.0);
    }

    @Test
    public void hasRrpPrice(){
        assertEquals(359.99, guitar.getRrp(), 0.0);
    }

    @Test
    public void hasDescription(){
        assertEquals("Stylish electric", guitar.getDescription());
    }
    // tests for super class Instrumnet
    @Test
    public void hasMake(){
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Firebird", guitar.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Fireburst", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Guitar", guitar.getType());
    }
}
