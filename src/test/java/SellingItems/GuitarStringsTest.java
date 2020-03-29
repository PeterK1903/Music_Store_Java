package SellingItems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("Replacement Strings", 5, 10);
    }

    @Test
    public void getDesc(){
        assertEquals("Replacement Strings", guitarStrings.getDescription());
    }

    @Test
    public void getBuyPrice(){
        assertEquals(5, guitarStrings.getBuyPrice(), 0.1);
    }

    @Test
    public void getSellPrice(){
        assertEquals(10, guitarStrings.getSellPrice(), 0.1);
    }


}
