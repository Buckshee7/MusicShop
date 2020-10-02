package Strings;

import Instruments.Strings.Violin;
import Instruments.Woodwind.Clarinet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    private Violin instrument;

    @Before
    public void before(){
        this.instrument = new Violin("Pink");
    }

    @Test
    public void hasType(){
        assertEquals("String", this.instrument.getType());
    }

    @Test
    public void hasStrings(){
        assertEquals(4, this.instrument.getStrings());
    }

    @Test
    public void hasColour(){
        assertEquals("Pink", this.instrument.getColour());
    }

    @Test
    public void canPlay(){
        assertEquals("** screeching cat **", this.instrument.play());
    }

}
