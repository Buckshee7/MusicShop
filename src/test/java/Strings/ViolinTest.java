package Strings;

import Exceptions.MissingInstrumentPartsException;
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
        String sound = "";
        try {sound = this.instrument.play();}
        catch (MissingInstrumentPartsException ex){
            System.out.println(ex.getMessage());
        }
        assertEquals("** screeching cat **", sound);
    }

    @Test
    public void cantPlayIfNoStrings(){
        this.instrument.removeStrings();
        String exceptionMessage = "";
        String sound = "";
        try {sound = this.instrument.play();}
        catch (MissingInstrumentPartsException ex){
            exceptionMessage = ex.getMessage();
        }
        assertEquals("Can't play with no strings!", exceptionMessage);
        assertEquals("", sound);
    }

    @Test
    public void canChangeOwner(){
        this.instrument.changeOwners("the music man");
        assertEquals("the music man", this.instrument.getOwner());
    }

}
