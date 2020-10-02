package Strings;

import Instruments.Strings.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar instrument;

    @Before
    public void before(){
        this.instrument = new Guitar("Pink", true);
    }

    @Test
    public void hasType(){
        assertEquals("String", this.instrument.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Pink", this.instrument.getColour());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, this.instrument.getNumStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Zwwwwaaaang, dli-zwang!", this.instrument.play());
    }

    @Test
    public void canChangeOwner(){
        this.instrument.changeOwners("the music man");
        assertEquals("the music man", this.instrument.getOwner());
    }

}
