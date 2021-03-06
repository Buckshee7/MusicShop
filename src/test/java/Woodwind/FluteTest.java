package Woodwind;

import Instruments.InstrumentType;
import Instruments.Woodwind.Clarinet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    private Clarinet instrument;

    @Before
    public void before(){
        this.instrument = new Clarinet("Pink");
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.WOODWIND, this.instrument.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Pink", this.instrument.getColour());
    }

    @Test
    public void hasLength(){
        assertEquals(26, this.instrument.getLength());
    }

    @Test
    public void canChangeOwner(){
        this.instrument.changeOwners("the music man");
        assertEquals("the music man", this.instrument.getOwner());
    }

}
