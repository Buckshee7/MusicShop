package Strings;

import Instruments.Strings.Banjo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BanjoTest {

    private Banjo instrument;

    @Before
    public void before(){
        this.instrument = new Banjo("Pink");
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
        assertEquals(5, this.instrument.getStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("bara-na-na-na-ning-ning-ning", this.instrument.play());
    }

    @Test
    public void canChangeOwner(){
        this.instrument.changeOwners("the music man");
        assertEquals("the music man", this.instrument.getOwner());
    }

}
