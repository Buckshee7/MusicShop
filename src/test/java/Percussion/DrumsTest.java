package Percussion;

import Instruments.InstrumentType;
import Instruments.Percussion.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    private Drums instrument;

    @Before
    public void before(){
        this.instrument = new Drums("Pink");
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
        assertEquals(70, this.instrument.getMaxDecibels());
    }

    @Test
    public void canChangeOwner(){
        this.instrument.changeOwners("the music man");
        assertEquals("the music man", this.instrument.getOwner());
    }

}
