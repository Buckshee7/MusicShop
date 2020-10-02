package Keyboard;

import Instruments.InstrumentType;
import Instruments.Keyboard.Organ;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrganTest {

    private Organ instrument;

    @Before
    public void before(){
        this.instrument = new Organ("Pink");
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.KEYBOARD, this.instrument.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Pink", this.instrument.getColour());
    }

    @Test
    public void hasKeys(){
        assertEquals(61, this.instrument.getKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("plong, plooooong, plong-ploooooooooooong", this.instrument.play());
    }

    @Test
    public void canChangeOwner(){
        this.instrument.changeOwners("the music man");
        assertEquals("the music man", this.instrument.getOwner());
    }

}
