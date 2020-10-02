package Percussion;

import Instruments.InstrumentType;
import Instruments.Percussion.Bongos;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BongosTest {

    private Bongos instrument;

    @Before
    public void before(){
        this.instrument = new Bongos("Pink");
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.PERCUSSION, this.instrument.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Pink", this.instrument.getColour());
    }

    @Test
    public void hasMaxDecibels(){
        assertEquals(30, this.instrument.getMaxDecibels());
    }

    @Test
    public void canPlay(){
        assertEquals("bop-bop-boppo-bop-bop", this.instrument.play());
    }

    @Test
    public void canChangeOwner(){
        this.instrument.changeOwners("the music man");
        assertEquals("the music man", this.instrument.getOwner());
    }

}
