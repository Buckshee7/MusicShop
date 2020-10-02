package Percussion;

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
        assertEquals("Percussion", this.instrument.getType());
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
    public void canPlay(){
        assertEquals("bang-boom boom-bang tish!", this.instrument.play());
    }

    @Test
    public void canChangeOwner(){
        this.instrument.changeOwners("the music man");
        assertEquals("the music man", this.instrument.getOwner());
    }

}
