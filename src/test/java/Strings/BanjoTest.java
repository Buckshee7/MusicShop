package Strings;

import Instruments.InstrumentType;
import Instruments.Strings.Banjo;
import Parts.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BanjoTest {

    private Banjo instrument;

    @Before
    public void before(){
        this.instrument = new Banjo("Pink", true);
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING, this.instrument.getType());
    }

    @Test
    public void hasColour(){
        assertEquals("Pink", this.instrument.getColour());
    }

    @Test
    public void hasStrings(){
        assertEquals(5, this.instrument.getNumStrings());
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

    @Test
    public void canBeSoldWithoutStrings(){
        instrument = new Banjo("Pink", false);
        assertEquals(null, this.instrument.getStrings());
    }

    @Test
    public void canRemoveStrings(){
        this.instrument.removeStrings();
        assertEquals(null, this.instrument.getStrings());
    }

    @Test
    public void canAddStrings(){
        this.instrument.removeStrings();
        Strings strings = new Strings(this.instrument.getName());
        this.instrument.addStrings(strings);
        assertEquals(strings, this.instrument.getStrings());
    }

}
