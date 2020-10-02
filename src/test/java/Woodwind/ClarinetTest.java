package Woodwind;

import Instruments.Woodwind.Clarinet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    private Clarinet instrument;

    @Before
    public void before(){
        this.instrument = new Clarinet("Pink");
    }

    @Test
    public void hasType(){
        assertEquals("Woodwind", this.instrument.getType());
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
    public void canPlay(){
        assertEquals("doo-di-loo-oo", this.instrument.play());
    }

}
