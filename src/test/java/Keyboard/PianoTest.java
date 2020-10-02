package Keyboard;

import Instruments.Keyboard.Piano;
import Instruments.Woodwind.Clarinet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano instrument;

    @Before
    public void before(){
        this.instrument = new Piano("Pink");
    }

    @Test
    public void hasType(){
        assertEquals("Keyboard", this.instrument.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Pink", this.instrument.getColour());
    }

    @Test
    public void hasKeys(){
        assertEquals(88, this.instrument.getKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("pling-plong-pling plongy-pling-plong", this.instrument.play());
    }

    @Test
    public void canChangeOwner(){
        this.instrument.changeOwners("the music man");
        assertEquals("the music man", this.instrument.getOwner());
    }

}
