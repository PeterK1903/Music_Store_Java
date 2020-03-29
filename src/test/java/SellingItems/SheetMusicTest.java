package SellingItems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {


    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("REM Sheet Music", 5, 10);
    }

    @Test
    public void getDesc(){
        assertEquals("REM Sheet Music", sheetMusic.getDescription());
    }

    @Test
    public void getBuyPrice(){
        assertEquals(5, sheetMusic.getBuyPrice(), 0.1);
    }

    @Test
    public void getSellPrice(){
        assertEquals(10, sheetMusic.getSellPrice(), 0.1);
    }
}
