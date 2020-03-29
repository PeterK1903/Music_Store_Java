package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Oak", InstrumentType.KEYS, "Black", 1400, 1200, 88);
    }

    @Test
    public void getMaterial(){
        assertEquals("Oak", piano.getMaterial());
    }

    @Test
    public void getType(){
        assertEquals(InstrumentType.KEYS, piano.getType());
    }

    @Test
    public void getColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void getBuyPrice(){
        assertEquals(1400, piano.getBuyPrice(), 0.1);
    }

    @Test
    public void getSellPrice(){
        assertEquals(1200, piano.getSellPrice(), 0.1);
    }

    @Test
    public void getNumOfStrings(){
        assertEquals(88, piano.getNumOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("PIA-PIA-PIANO", piano.play());
    }
}
