package accessories;

import org.junit.Before;
import org.junit.Test;
import shop.stockItems.accessories.OboeReed;
import shop.stockItems.instruments.Oboe;

import static org.junit.Assert.assertEquals;

public class OboeReedTest {
    OboeReed reed;

    @Before
    public void before(){
        reed = new OboeReed(9.00, 15.00, "Expertly handmade reed", "Barns & Mullins", "Jones Oboe Reed", "Woodwind Accessories", "Hand-finished", "Medium");
    }

    @Test
    public void hasReedType(){
        assertEquals("Hand-finished", reed.getReedType());
    }

    @Test
    public void hasReedStregth(){
        assertEquals("Medium", reed.getReedStrength());
    }
}
