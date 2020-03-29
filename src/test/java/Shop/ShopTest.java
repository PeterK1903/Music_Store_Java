package Shop;

import Instruments.Guitar;
import Instruments.InstrumentType;
import Instruments.Piano;
import Instruments.Trumpet;
import SellingItems.GuitarStrings;
import SellingItems.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    GuitarStrings guitarStrings;
    SheetMusic sheetMusic;

    @Before
    public void before(){
        shop = new Shop("Peter's Place");
        guitar = new Guitar("Maple Wood", InstrumentType.STRINGS ,"Red", 300, 250, 5);
        piano = new Piano("Oak", InstrumentType.KEYS, "Black", 1400, 1200, 88);
        trumpet = new Trumpet("Brass", InstrumentType.BRASS, "Brass", 600, 450, 6 );
        guitarStrings = new GuitarStrings("Replacement Strings", 5, 10);
        sheetMusic = new SheetMusic("REM Sheet Music", 5, 10);
    }

    @Test
    public void getName(){
        assertEquals("Peter's Place", shop.getName());
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void addingToStock(){
        shop.addToStock(guitar);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void removingFromStock(){
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.removeFromStock(piano);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void calculatingProfit(){
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.addToStock(sheetMusic);
        assertEquals(255, shop.calculateStockPotentialProfit(), 0.1);
    }

}
