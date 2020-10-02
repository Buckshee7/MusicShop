package Strings;

import Instruments.InstrumentType;
import Instruments.Strings.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    private Violin instrument;

    @Before
    public void before(){
        this.instrument = new Violin("Pink", true);
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING, this.instrument.getType());
    }

    @Test
    public void hasStrings(){
        assertEquals(4, this.instrument.getNumStrings());
    }

    @Test
    public void hasColour(){
        assertEquals("Pink", this.instrument.getColour());
    }

    @Test
    public void canPlay(){
        assertEquals("** screeching cat **", this.instrument.play());
    }

    @Test
    public void canChangeOwner(){
        this.instrument.changeOwners("the music man");
        assertEquals("the music man", this.instrument.getOwner());
    }

}
