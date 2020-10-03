package Woodwind;

import Instruments.InstrumentType;
import Instruments.Woodwind.Harmonica;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarmonicaTest {

    private Harmonica instrument;

    @Before
    public void before(){
        this.instrument = new Harmonica();
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.WOODWIND, this.instrument.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Silver", this.instrument.getColour());
    }

    @Test
    public void hasLength(){
        assertEquals(4, this.instrument.getLength());
    }

    @Test
    public void canChangeOwner(){
        this.instrument.changeOwners("the music man");
        assertEquals("the music man", this.instrument.getOwner());
    }

}
