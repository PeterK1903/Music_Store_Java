package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Maple Wood", InstrumentType.STRINGS ,"Red", 300, 250, 5);
    }

    @Test
    public void getMaterial(){
        assertEquals("Maple Wood", guitar.getMaterial());
    }

    @Test
    public void getType(){
        assertEquals(InstrumentType.STRINGS, guitar.getType());
    }

    @Test
    public void getColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void getBuyPrice(){
        assertEquals(300, guitar.getBuyPrice(), 0.1);
    }

    @Test
    public void getSellPrice(){
        assertEquals(250, guitar.getSellPrice(), 0.1);
    }

    @Test
    public void getNumOfStrings(){
        assertEquals(5, guitar.getNumOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Strum Strum Strum", guitar.play());
    }
}
