import accessories.Amp;
import accessories.Stick;
import instruments.Drum;
import instruments.Guitar;
import instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;
import shop.ItemTypes;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Drum drum;
    private Guitar guitar;
    private Keyboard keyboard;
    private Amp amp;
    private Stick stick;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        drum = new Drum(ItemTypes.ACOUSTICDRUM, "Pearl", "Black", "Maple", 200, 250, 20  );
        guitar = new Guitar(ItemTypes.ELECTRICGUITAR, "LTD", "Black", "Mahogany", 800, 950, 6);
        keyboard = new Keyboard(ItemTypes.SYNTHESIZER, "Roland", "Red", "Plastic", 600, 680, 60);
        amp =  new Amp(ItemTypes.GUITARCOMBO, 200, 280, 40);
        stick = new Stick(ItemTypes.DRUMSTICK, 5, 8, "Hickory");

        shop.addItemToStock(drum);
        shop.addItemToStock(guitar);
        shop.addItemToStock(keyboard);
        shop.addItemToStock(amp);
    }

    @Test
    public void shopHasItem(){
        assertEquals(4, shop.getStockSize());
    }

    @Test
    public void shopCanAddItem(){
        shop.addItemToStock(stick);
        assertEquals(5, shop.getStockSize());
    }

    @Test
    public void shopCanRemoveItem(){
        shop.removeItemFromStock(amp);
        assertEquals(3, shop.getStockSize());
    }

    @Test
    public void canPlayInstruments(){
        assertEquals("Da-dum-da-dum", drum.play());
        assertEquals("Chunka Chunk", guitar.play());
        assertEquals("Plink", keyboard.play());
    }

    @Test
    public void checkProfit(){
        assertEquals(360, shop.calculateTotalProfit(), 0.1);
    }


}
