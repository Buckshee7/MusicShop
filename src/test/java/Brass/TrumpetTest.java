package Brass;

import Instruments.Brass.Trumpet;
import Instruments.Woodwind.Clarinet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    private Trumpet instrument;

    @Before
    public void before(){
        this.instrument = new Trumpet();
    }

    @Test
    public void hasType(){
        assertEquals("Brass", this.instrument.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Brass", this.instrument.getColour());
    }

    @Test
    public void canPlay(){
        assertEquals("toot toot", this.instrument.play());
    }

}
