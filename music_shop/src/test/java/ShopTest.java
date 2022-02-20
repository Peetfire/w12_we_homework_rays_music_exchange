import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shop.stockItems.ISell;
import shop.stockItems.accessories.OboeReed;
import shop.stockItems.instruments.Guitar;
import shop.stockItems.instruments.Keyboard;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopTest {
    Shop shop;
    ISell stockItem1, stockItem2, stockItem3;

    @Before
    public void before(){
        stockItem1 = new Guitar(259.99, 359.99, "Stylish electric", "Gibson", "Firebird", "Fireburst", "Guitar", 6, "Electric");
        stockItem2 = new OboeReed(9.00, 15.00, "Expertly handmade reed", "Barns & Mullins", "Jones Oboe Reed", "Woodwind Accessories", "Hand-finished", "Medium");
        stockItem3 = new Keyboard(200.00, 270.50, "Lovely beginners keyboard",  "Roland", "MU1","Black", "Keys", "Electric Keyboard", 88);
        shop = new Shop();
    }
    @Test
    public void shopStartsEmpty(){
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddStock(){
        shop.addStock(stockItem1);
        shop.addStock(stockItem2);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canFindStock(){
        shop.addStock(stockItem1);
        assertTrue(shop.findStock(stockItem1));
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(stockItem1);
        shop.addStock(stockItem2);
        shop.addStock(stockItem3);
        assertEquals(3, shop.getStockCount());
        shop.removeStock(stockItem1);
        assertEquals(2, shop.getStockCount());
        shop.removeStock(stockItem2);
        shop.removeStock(stockItem3);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canDealWithBadRemovalRequest(){
        shop.addStock(stockItem1);
        shop.removeStock(stockItem2);
        assertEquals(1, shop.getStockCount());
    }
}
