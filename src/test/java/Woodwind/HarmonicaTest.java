package Woodwind;

import Instruments.Woodwind.Clarinet;
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
        assertEquals("Woodwind", this.instrument.getType());
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
    public void canPlay(){
        assertEquals("I AM THE INDESCRIBABLE NOISE A HARMONICA MAKES", this.instrument.play());
    }

}
