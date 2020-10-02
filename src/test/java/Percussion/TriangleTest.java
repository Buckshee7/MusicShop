package Percussion;

import Instruments.Percussion.Triangle;
import Instruments.Woodwind.Clarinet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    private Triangle instrument;

    @Before
    public void before(){
        this.instrument = new Triangle("Pink");
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
        assertEquals(10, this.instrument.getMaxDecibels());
    }


    @Test
    public void canPlay(){
        assertEquals("Ting", this.instrument.play());
    }

}
