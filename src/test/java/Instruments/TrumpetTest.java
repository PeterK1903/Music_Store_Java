package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Brass", InstrumentType.BRASS, "Brass", 600, 450, 6 );
    }

    @Test
    public void getMaterial(){
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void getType(){
        assertEquals(InstrumentType.BRASS, trumpet.getType()); }

    @Test
    public void getColour(){
        assertEquals("Brass", trumpet.getColour());
    }

    @Test
    public void getBuyPrice(){
        assertEquals(600, trumpet.getBuyPrice(), 0.1);
    }

    @Test
    public void getSellPrice(){
        assertEquals(450, trumpet.getSellPrice(), 0.1);
    }

    @Test
    public void getNumOfStrings(){
        assertEquals(6, trumpet.getNumOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("Trrrrrrummmmpet", trumpet.play());
    }

}
